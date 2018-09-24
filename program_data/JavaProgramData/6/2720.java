package <missing>;

public class GlobalMembers
{
	//???????
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[101][101];
		int i;
		int j;
		int t;
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (j = 1;j <= m;j++)
		   {
			 for (t = 1;t <= n;t++)
			 {
			   a[j][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		   }
				if (m == 1 && n == 1)
				{
					sum = a[1][1];
				}
			   else
			   {
		   for (j = 1;j <= m;j++)
		   {
		   sum = sum + a[j][1];
		   sum = sum + a[j][n];
		   }
			   }
		   for (t = 2;t < n;t++)
		   {
			sum = sum + a[1][t];
			sum = sum + a[m][t];
		   } //?????
		   System.out.print(sum);
		   System.out.print("\n");
		}

		return 0;

	}
}

