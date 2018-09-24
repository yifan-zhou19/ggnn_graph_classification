package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
					p + i * col + j = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < col;j++)
		{
			m = j;
			for (i = 0;!((m == -1) || (i == row));i++,m--)
			{
				System.out.printf("%d\n",*(p + i * col + m));
			}
		}
		for (i = 1;i < row;i++)
		{
			m = i;
			for (j = col - 1;!((m == row) || (j == -1));m++,j--)
			{
				System.out.printf("%d\n",*(p + m * col + j));
			}
		}
		return 0;
	}
}

