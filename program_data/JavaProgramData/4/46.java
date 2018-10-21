package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int min;
		int[][] p;
		int row;
		int col;
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
		p = new int[row];
		for (i = 0;i < row;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		*(p + i) = (int)malloc(col * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < row;i++)
		{
		for (j = 0;j < col;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			*(p + i) + j = tempVar3;
		}
		}
		}
		min = row < col != 0?row:col;
		for (k = 0;k < min;k++)
		{
		for (i = 0,j = k;i <= k;i++,j--)
		{
		System.out.printf("%d\n",*(*(p + i) + j));
		}
		}
		if (col == min)
		{
		for (k = 1;k < row;k++)
		{
		for (i = k, j = col - 1;i < row && j >= 0;i++, j--)
		{
		System.out.printf("%d\n",*(*(p + i) + j));
		}
		}
		}
		else
		{
			for (k = min;k < col;k++)
			{
			for (i = 0,j = k;i < row;i++,j--)
			{
			System.out.printf("%d\n",*(*(p + i) + j));
			}
			}
			for (k = 1;k < row;k++)
			{
			for (i = k,j = col - 1;i < row;i++,j--)
			{
			System.out.printf("%d\n",*(*(p + i) + j));
			}
			}
		}
	}
}

