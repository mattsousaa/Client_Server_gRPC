import base64

f = open("serialized_image.txt","w+")

########## Convert Image to String ##########

with open("cr7_test.jpg", "rb") as imageFile:
    str = base64.b64encode(imageFile.read())

    f.write("%s\r\n" % str)

    print(str)

########## Convert String to Image ##########

    imgdata = base64.b64decode(str)

    filename = 'some_image.jpg'  # I assume you have a way of picking unique filenames

with open(filename, 'wb') as f:

    f.write(imgdata)