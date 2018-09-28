package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int a;
		int b = 0;
		int[][] gao = new int[1000][1000];
		int[][] din = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					gao[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < m;k++)
		{
			for (a = 0;a < n;a++)
			{
				if ((a != 0 && gao[k][a] >= gao[k][a - 1] != 0 && gao[k][a] >= gao[k][a + 1] != 0 || a == 0 && gao[k][a] >= gao[k][a + 1]) && (k != 0 && gao[k][a] >= gao[k - 1][a] != 0 && gao[k][a] >= gao[k + 1][a] != 0 || k == 0 && gao[k][a] >= gao[k + 1][a]))
				{
				   din[b][0] = k;
				   din[b][1] = a;
				   b++;
				}
				else
				{
					continue;
				}
			}
		}

		for (int c = 0;c < b;c++)
		{
	   for (int d = 0;d < 2;d++)
	   {
		   if (d != 1)
		   {
		   System.out.printf("%d ",din[c][d]);
		   }
		   else
		   {
			   System.out.printf("%d\n",din[c][d]);
		   }

	   }
		}

		return 0;
	}




}

