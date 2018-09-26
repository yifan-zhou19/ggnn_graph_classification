package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] ws = new int[8][8];
		int i;
		int j;
		int n;
		int m;
		int a;
		int b;
		int h;
		int k;
		int t;
		int aa;
		int g;
		int rp = 0;
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
		aa = 10000;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ws[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (h = 0;h < n;h++)
		{
			for (k = 0;k < m;k++)
			{
				if (ws[h][k] > rp)
				{
					rp = ws[h][k];
					a = h;
					b = k;
				}
			}


			for (g = 0;g < n;g++)
			{
				if (ws[g][b] < aa)
				{
					aa = ws[g][b];
					t = g;
				}
			}
			if (t == a)
			{
				System.out.printf("%d+%d",a,b);
					break;
			}
			else
			{
				a = -1;
				rp = 0;
				aa = 10000;
				continue;
			}





		}

		if (a == -1)
		{

			System.out.print("No");
		}
			return 0;
	}

}

