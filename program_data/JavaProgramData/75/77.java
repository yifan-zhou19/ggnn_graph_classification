package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[2][1000];
		int i;
		int j = 0;
		int k;
		int n;
		int p = 0;
		int max = 0;
		char q;
		for (i = 0;i < 2;i++)
		{
			j = 0;
			do
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				j++;
			} while ((q = System.in.read()) != '\n');
		}
		for (k = 0;k <= 1000;k++)
		{
			for (n = 0;n < j;n++)
			{
				if (a[0][n] <= k != 0 && a[1][n]> k)
				{
					p = p + 1;
				}
			}
			if (p > max)
			{
				max = p;
			}
			p = 0;
		}
		System.out.print(j);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

