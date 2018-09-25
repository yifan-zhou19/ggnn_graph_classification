package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int q;
		int[][] a = new int[110][110];
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = n;
		for (k = 1;k <= q;k++)
		{
			int sum = 0;
			n = q;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			while (true)
			{
				if (n == 1)
				{
					break;
				}
			int min = 0;
			for (i = 1;i <= n;i++)
			{
				min = 9999999;
				for (j = 1;j <= n;j++)
				{
					if (min > *(p[i] + j))
					{
						min = (p[i] + j);
					}
				}
				for (j = 1;j <= n;j++)
				{
					*(p[i] + j) -= min;
				}
			}
			for (i = 1;i <= n;i++)
			{
				min = 9999999;
				for (j = 1;j <= n;j++)
				{
					if (min > *(p[j] + i))
					{
						min = (p[j] + i);
					}
				}
				for (j = 1;j <= n;j++)
				{
					*(p[j] + i) -= min;
				}
			}
			sum += a[2][2];
			for (i = 2;i <= n - 1;i++)
			{
				for (j = 2;j <= n - 1;j++)
				{
					*(p[i] + j) = *(p[i + 1] + j + 1);
				}
			}
			for (i = 2;i <= n - 1;i++)
			{
				*(p[1] + i) = *(p[1] + i + 1);
				*(p[i] + 1) = *(p[i + 1] + 1);
			}
			n--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}


		return 0;
	}
}

