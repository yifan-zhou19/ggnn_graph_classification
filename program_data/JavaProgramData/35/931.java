package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int l;
		int t;
		int m;
		int n;
		int max = 0;
		int jishuqi = 0;
		int hang;
		int lie;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= hang - 1;i++)
		{
			for (j = 0;j <= lie-1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= hang - 1;i++)
		{
			for (j = 0;j <= lie-1;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					m = i;
					n = j;
				}
			}
				/*printf("%d %d\n",m,n);*/
				for (k = 0;k <= hang - 1;k++)
				{
					if (a[m][n] < a[k][n])
					{
						jishuqi = jishuqi + 1;
					}
				}
				if (jishuqi == hang - 1)
				{
					System.out.printf("%d+%d\n",m,n);
				}
				else
				{
					System.out.print("No\n");
				}
				break;
		}
	}

}

