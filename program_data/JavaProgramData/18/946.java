package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int m;
		int s = 0;
		int i;
		int j;
		int x;
		int y;
		int t = 0;
		int[] p = new int[100];
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1; m <= n; m++)
		{
			s = 0;
			t = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					(*(p[i] + j)) = ConsoleInput.readToWhiteSpace(true);
				}
			}

			for (y = n; y > 1; y--)
			{


				for (i = 0; i < n - t; i++)
				{
					x = (p[i]); //a[i][0];
					for (j = 0; j < n - t; j++)
					{
						if (x > *(p[i] + j))
						{
							x = (p[i] + j);
						}
					}
					for (j = 0; j < n - t; j++)
					{
						*(p[i] + j) -= x;
					}
				}



				for (j = 0; j < n - t; j++)
				{
					x = (p[0] + j);
					for (i = 0; i < n - t; i++)
					{
						if (x > *(p[i] + j))
						{
							x = (p[i] + j);
						}
					}
					for (i = 0; i < n - t; i++)
					{
						*(p[i] + j) -= x;
					}
				}


				s = s + *(p[1] + 1);
				for (i = 0; i < n - t; i++)
				{
					for (j = 1; j < n - t - 1; j++)
					{
						*(p[i] + j) = *(p[i] + j + 1);
					}
				}
				for (i = 1; i < n - t - 1; i++)
				{
					for (j = 0; j < n - t; j++)
					{
						*(p[i] + j) = *(p[i + 1] + j);
					}
				}
				t++;
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}

}

