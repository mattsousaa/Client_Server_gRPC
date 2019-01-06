import cv2 as cv
 
num_down = 2       # number of downsampling steps
num_bilateral = 7  # number of bilateral filtering steps
 
img_rgb = cv.imread("cr7_test.jpg")
 
# downsample image using Gaussian pyramid
img_color = img_rgb
for _ in range(num_down):
    img_color = cv.pyrDown(img_color)
 
# repeatedly apply small bilateral filter instead of
# applying one large filter
for _ in range(num_bilateral):
    img_color = cv.bilateralFilter(img_color, d=9,
                                    sigmaColor=9,
                                    sigmaSpace=7)
 
# upsample image to original size
for _ in range(num_down):
    img_color = cv.pyrUp(img_color)


# convert to grayscale and apply median blur
img_gray = cv.cvtColor(img_rgb, cv.COLOR_RGB2GRAY)
img_blur = cv.medianBlur(img_gray, 7)

# detect and enhance edges
img_edge = cv.adaptiveThreshold(img_blur, 255,
                                 cv.ADAPTIVE_THRESH_MEAN_C,
                                 cv.THRESH_BINARY,
                                 blockSize=9,
                                 C=2)

# convert back to color, bit-AND with color image
img_edge = cv.cvtColor(img_edge, cv.COLOR_GRAY2RGB)
img_cartoon = cv.bitwise_and(img_color, img_color, img_edge)
 
# display
cv.imwrite('teste.jpg',img_cartoon)