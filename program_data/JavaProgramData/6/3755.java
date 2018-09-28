package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			int[] p = new int[100];
			p = a;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (int j = 0;j < m;j++)
			{
				for (int l = 0;l < n;l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m != 1 && n != 1)
			{
			for (int l = 0;l < n;l++)
			{
				sum += *(p[0] + l) + *(p[m - 1] + l);
			}
			for (int j = 1;j < m - 1;j++)
			{
				sum += *(p[j]) + *(p[j] + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
			}
			else
			{
			System.out.print(p);
			System.out.print("\n");
			}
		}

		return 0;
	}



}

