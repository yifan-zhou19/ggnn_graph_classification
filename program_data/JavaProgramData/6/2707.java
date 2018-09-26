package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int k;
		int m;
		int n;
		int i;
		int j;
		int l;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
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
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][l] = Integer.parseInt(tempVar4);
					}
				}
			}
			if ((m == 1) && (n == 1))
			{
				System.out.printf("%d\n",a[0][0]);
			}
			else if (m == 1)
			{
				s = 0;
				for (j = 0;j < n;j++)
				{
					s = s + a[0][j];
				}
				System.out.printf("%d\n",s);
			}
			else if (n == 1)
			{
				s = 0;
				for (j = 0;j < m;j++)
				{
					s = s + a[j][0];
				}
				System.out.printf("%d\n",s);
			}
			else
			{
				s = 0;
				for (j = 0;j < n - 1;j++)
				{
					s = s + a[0][j];
				}
				for (j = 0;j < m - 1;j++)
				{
					s = s + a[j][n - 1];
				}
				for (j = n - 1;j > 0;j--)
				{
					s = s + a[m - 1][j];
				}
				for (j = m - 1;j > 0;j--)
				{
					s = s + a[j][0];
				}
				System.out.printf("%d\n",s);
			}
		}
	}



}

