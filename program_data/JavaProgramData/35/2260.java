package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int flag1;
		int flag2;
		int flag3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				k = l = 1;
				flag1 = flag2 = 1;
				do
				{
					if (a[i][j] < a[i][k])
					{
						flag1 = 0;
						break;
					}
					k++;
				}while (k <= m);
				do
				{
					if (a[i][j] > a[l][j])
					{
						flag2 = 0;
						break;
					}
					l++;
				}while (l <= n);
				if (flag1 == 1 && flag2 == 1)
				{
					System.out.printf("%d+%d",i - 1,j - 1);
					flag3 = 1;
					return 0;
				}
			}
		}
		if (flag3 == 0)
		{
			System.out.print("No");
		}






	  return 0;
	}

}

