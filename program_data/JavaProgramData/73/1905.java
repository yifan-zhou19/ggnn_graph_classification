package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] g = new int[5];
		int[] sum = new int[5];
		int[] t = new int[5];
		int k;
		int m = 0;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= 4;i++)
		{
			for (j = 0,sum[i] = a[i][0],t[i] = 0;j <= 4;j++)
			{
				if (sum[i] < a[i][j])
				{
					sum[i] = a[i][j];
					t[i] = j;
				}
			}
			for (k = 0;k <= 4;k++)
			{
				if (sum[i] < a[k][t[i]])
				{
				g[i]++;
				}
			}
			if (g[i] == 4)
			{
				m = 1;
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(t[i] + 1);
				System.out.print(" ");
				System.out.print(sum[i]);
				System.out.print("\n");
			}
		}
		 if (m == 0)
		 {
		 System.out.print("not found");
		 }
		 return 0;
	}

}

