package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[][] p = new int[1000][60];
		int[] q = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[m][0] = Integer.parseInt(tempVar2);
			}
			int t;
			t = p[m][0];
			if (t == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			for (int j = 1;j <= t;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[m][j] = Integer.parseInt(tempVar3);
				}
			}
			int b;
			b = 60 - 3 * t - p[m][t];
			if (b >= 0)
			{
			q[m] = b + p[m][t];
			System.out.printf("%d\n",q[m]);
			}
			else
			{
				int s;
				int z;
				int h1;
				int h2;
				int l;
				for (int f = 1;f <= t;f++)
				{
					s = p[m][f] + 3 * f;
					if (s > 60)
					{
						h1 = p[m][f];
						h2 = p[m][f - 1];
						z = f;
						for (int g = 0;g <= t;g++)
						{
							p[m][g] = -60;
						}
					}
				}
					l = 60 - 3 * (z - 1) - h2 - (h1 - h2);
					if (l >= 0)
					{
						q[m] = h1;
					}
					else
					{
						q[m] = 60 - 3 * (z - 1);
					}
					System.out.printf("%d\n",q[m]);
			}
			}
		}
	}


}

