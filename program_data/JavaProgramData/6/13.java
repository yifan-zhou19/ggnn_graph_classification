package <missing>;

public class GlobalMembers
{
	public static int calcSum(tangible.RefObject<Integer> matrix, int row, int col)
	{
		int sum = 0;
		int i;
		int j;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				if (i == 0 || i == row - 1 || j == 0 || j == col - 1)
				{
					sum += *(matrix.argValue + i * col + j);
				}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *result = (int *)malloc(k * sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int result = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		int i = 0;
		int row;
		int col;
		int sum;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *matrix;
		int matrix;
		for (i = 0; i < k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			matrix = (int)malloc(m * n * (Integer.SIZE / Byte.SIZE));
			for (row = 0; row < m; row++)
			{
				for (col = 0; col < n; col++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						matrix + row * n + col = Integer.parseInt(tempVar4);
					}
				}
			}
		 tangible.RefObject<Integer> tempRef_matrix = new tangible.RefObject<Integer>(matrix);
			 *(result + i) = calcSum(tempRef_matrix, m, n);
			 matrix = tempRef_matrix.argValue;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(matrix);
		}
		for (i = 0; i < k - 1; i++)
		{
			System.out.printf("%d\n", *(result + i));
		}
		System.out.printf("%d", *(result + i));
		return 0;
	}
}

