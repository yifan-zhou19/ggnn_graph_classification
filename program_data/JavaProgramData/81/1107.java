package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int t = 0;
		int[] b = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
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
		if (m < 5 && n < 5)
		{
			t++;
		}
		if (t == 0)
		{
		   System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = b[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",a[i][j]);
					}
					else
					{
					System.out.printf(" %d",a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
			return 0;
	}




}

