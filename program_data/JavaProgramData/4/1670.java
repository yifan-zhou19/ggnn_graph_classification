package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int row;
		int col;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k <= row + col - 2;k++)
		{
			for (i = 0,j = k - 1;i <= row - 1;i++,j--)
			{
				if (i <= row - 1 && j >= 0 && j <= col - 1 && i >= 0)
				{
					System.out.printf("%d\n",*(p[i] + j));
				}
			}
		}
		System.out.printf("%d\n",*(p[row - 1] + col - 1));

	}
}

