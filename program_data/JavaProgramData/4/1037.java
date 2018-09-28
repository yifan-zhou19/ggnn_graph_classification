package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int col;
		int row;
		int i;
		int j;
		int k;
		int t = 0;
		int[][] a = new int[101][101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (int)malloc((Integer.SIZE / Byte.SIZE) * row * col);

		for (i = 0;i < col;i++)
		{
			for (k = 0, j = i;j >= 0 && k < row;k++, j--)
			{
					*(p + t) = a[k][j];
					t++;
			}
		}
		for (i = 1;i < row;i++)
		{
			for (k = i, j = col - 1;k < row && j >= 0;j--, k++)
			{
					*(p + t) = a[k][j];
					t++;
			}
		}
	for (i = 0;i < row * col;i++)
	{
		System.out.printf("%d\n",*(p + i));
	}
	}





}

