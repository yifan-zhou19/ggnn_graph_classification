package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
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
		int[][] a;
		a = new int[row];
		for (i = 0;i < row;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a[i] = (int)malloc(col * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(a + i) + j = tempVar3;
			}
			}
		}
		int len;
		for (len = 0;len < row + col - 1;len++)
		{
			for (i = 0;i < row;i++)
			{
				j = len - i;
				if ((j < col) && (j >= 0))
				{
					System.out.printf("%d\n",*(*(a + i) + len - i));
				}
			}
		}
		return 0;
	}
}

