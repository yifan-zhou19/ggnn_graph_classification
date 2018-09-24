package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int cow;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			cow = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
						  for (j = 0;j < cow;j++)
						  {
											String tempVar3 = ConsoleInput.scanfRead();
											if (tempVar3 != null)
											{
												a[i][j] = Integer.parseInt(tempVar3);
											}
						  }
						  if (i != row - 1)
						  {
						  System.out.print("\n");
						  }
		}
		i = 0;
		while (row - i - i > 1 && cow - i - i > 1)
		{
									   for (j = i;j < cow - i;j++)
									   {
														   System.out.printf("%d\n",a[i][j]);
									   }
										for (j = i + 1;j < row - i;j++)
										{
														   System.out.printf("%d\n",a[j][cow - i - 1]);
										}
										for (j = cow - 2 - i;j >= i;j--)
										{
														   System.out.printf("%d\n",a[row - 1 - i][j]);
										}
										for (j = row - 2 - i;j >= i + 1;j--)
										{
														   System.out.printf("%d\n",a[j][i]);
										}
									   i++;
		}
		if (row - i - i == 1)
		{
						 for (j = i;j < cow - i;j++)
						 {
														   System.out.printf("%d\n",a[i][j]);
						 }
		}
		else if (cow - i - i == 1)
		{
						 for (j = i;j < row - i;j++)
						 {
														   System.out.printf("%d\n",a[j][i]);
						 }
		}
		return 0;
	}
}

