package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
		 for (j = 1 ; j <= m ; j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar);
			 }
		 }
		}

		for (i = 2 ; i <= n + m ; i++)
		{
		 for (j = Math.max(1,i - m) ; j <= Math.min(n,i - 1) ; j++)
		 {
			 System.out.printf("%d\n",a[j][i - j]);
		 }
		}
	}

}

