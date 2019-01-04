import numpy as np

def matrix_multiplication(x1, y1, x2, y2):
	
	rows1  = x1
	cols1 = y1
	low1 = 22
	hihg1 = 37
	step1 = 2

	rows2  = x2
	cols2 = y2
	low2 = 13
	hihg2 = 89
	step2 = 2

	result = np.zeros((rows1,cols2))

	#print(result)

	matrix = np.random.choice([x for x in xrange(low1,hihg1,step1)],rows1*cols1)
	matrix.resize(rows1,cols1) 

	matrix2 = np.random.choice([x for x in xrange(low2,hihg2,step2)],rows2*cols2)
	matrix2.resize(rows2,cols2)

	print("Matriz 1")
	print('Ordem: {one}x{two}'.format(one=rows1,two=cols1))
	print(matrix)

	print('\n')

	print("Matriz 2")
	print('Ordem: {one}x{two}'.format(one=rows2,two=cols2))

	print(matrix2)

	print('\n')

	result = np.dot(matrix, matrix2)

	#print(result)

	res_string = np.array2string(result, precision=2, separator=',', suppress_small=True)

	return res_string