package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int n0 = 0;
		int[][] juzhen = new int[102][102];
		int sum = 0;
		int[] minc = new int[102];
		int[] minr = new int[102];
		int lins = 0;
		int[] p = juzhen;
		int[] pr = minr;
		int[] pc = minc;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n0 < n)
		{
			lins = 0;
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(p[i] + j) = 0;
				}
				pr[i] = 100000;
				pc[i] = 100000;
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			while (lins < n - 1)
			{
				for (i = 0;i < n;i++)
				{
					pr[i] = 100000;
					pc[i] = 100000;
				}
				for (i = 0;i < n - lins;i++)
				{
					for (j = 0;j < n - lins;j++)
					{
						if (*(p[i] + j) < minr[i])
						{
							pr[i] = (p[i] + j);
						}
					}
				}
				for (i = 0;i < n - lins;i++)
				{
					for (j = 0;j < n - lins;j++)
					{
						*(p[i] + j) -= pr[i];
					}
				}
				for (j = 0;j < n - lins;j++)
				{
					for (i = 0;i < n - lins;i++)
					{
						if (*(p[i] + j) < pc[j])
						{
							pc[j] = (p[i] + j);
						}
					}
				}
				for (j = 0;j < n - lins;j++)
				{
					for (i = 0;i < n - lins;i++)
					{
						*(p[i] + j) -= pc[j];
					}
				}
				sum += *(p[1] + 1);

				for (i = 2;i < n - lins;i++)
				{
					for (j = 0;j < n - lins;j++)
					{
						*(p[i - 1] + j) = *(p[i] + j);
					}
				}
				for (j = 2;j < n - lins;j++)
				{
					for (i = 0;i < n - lins;i++)
					{
						*(p[i] + j - 1) = *(p[i] + j);
					}
				}
				lins++;

			}
			System.out.print(sum);
			System.out.print("\n");
			n0++;
		}
		return 0;
	}
}

