package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[30];
		int[][] b = new int[30][100];
		for (int i = 0;i <= 29;i++)
		{
				b[i][1] = 1;
				b[i][2] = 1;
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if ((a[i] == 1) || (a[i] == 2))
				{
									 System.out.printf("%d\n",b[i][a[i]] = 1);
				}
				else
				{
					 for (int j = 3;j <= a[i];j++)
					 {
						 b[i][j] = b[i][j - 1] + b[i][j - 2];
					 }
					   System.out.printf("%d\n",b[i][a[i]]);
				}
		}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n = Integer.parseInt(tempVar3);
				}
		return 0;
	}

}

