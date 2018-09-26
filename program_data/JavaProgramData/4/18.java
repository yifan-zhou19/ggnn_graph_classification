package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] * a = new int[100][100];
		int i;
		int j;
		int col;
		int row;
		int k;
		int xie;
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
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				a[i][j] = (int)malloc(10000);
			}
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

		xie = col + row - 1;
		for (i = 0;i <= xie+1;i++)
		{
			for (j = 0;j < row;j++)
			{
				for (k = 0;k < col;k++)
				{
					if (j + k != i)
					{
						continue;
					}
					else
					{
						System.out.printf("%d\n",a[j][k]);
					}
				}
			}
		}
	}

}

