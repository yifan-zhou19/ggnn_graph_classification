package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int l;
		int max = 0;
		int max1 = 0;
		int max2 = 0;
		int min1 = 0;
		int min2 = 0;
		int min = 0;
		int t = 0;
		int r;
		int s;
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


		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j == 0)
				{
					max = a[i][0];
					r = 0;
				}
				else if (a[i][j] > max)
				{
					max = a[i][j];
					r = j;
				}
			}
			for (k = 0;k < 5;k++)
			{
				for (l = 0;l < 5;l++)
				{
					if (l == 0)
					{
						min = a[0][k];
						s = 0;
					}
					else if (a[l][k] < min)
					{
						min = a[l][k];
						s = l;
					}
				}

				if (max == min && i == s && r == k)
				{
					s++;
					r++;
					System.out.printf("%d %d %d",s,r,min);
					t++;
					max = 0;
					min = 100;
				}
			}


		}
		if (t == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

