package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		(int)(*a)[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (int [100])calloc(100,100 * (Integer.SIZE / Byte.SIZE)); //???pass?????????????????pass???
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
						*(a + i) + j = tempVar3;
					}
				}
			}

		for (k = 0;k < col;k++)
		{
			for (i = 0;k - i >= 0 && i <= row - 1;i++)
			{
				System.out.printf("%d\n",*(*(a + i) + k - i));
			}
		}
		for (k = 1;k < row;k++)
		{
			for (i = 0;k + i <= row - 1 && col - 1 - i >= 0;i++)
			{
				System.out.printf("%d\n",*(*(a + k + i) + col - 1 - i));
			}
		}
	}

}

