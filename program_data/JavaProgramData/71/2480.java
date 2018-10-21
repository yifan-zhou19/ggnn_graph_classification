package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int[][] k = new int[200][2];
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int[] weekdays = {1, 2, 3, 4, 5, 6, 7};
		int[] y = new int[200];
		int[][] m = new int[200][2];
		int[][] w = new int[200][2];
		int i;
		for (l = 0;l < n;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[l] = Integer.parseInt(tempVar2);
			}
		for (j = 0;j < 2;j++)
		{

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m[l][j] = Integer.parseInt(tempVar3);
		}
		w[l][j] = y[l] % 7 + y[l] / 4 - y[l] / 100 + y[l] / 400;
	   for (i = 1; i < m[l][j]; i++)
	   {
			w[l][j] += days[i];
	   }
		   w[l][j] += 1 - 1;
		if (((y[l] % 4 == 0 && y[l] % 100 != 0) || y[l] % 400 == 0) && (m[l][j] <= 2))
		{
			w[l][j]--;
		}
		 k[l][j] = weekdays[w[l][j] % 7];
		}
		}
		for (l = 0;l < n;l++)
		{
		 if (k[l][0] == k[l][1])
		 {
			 System.out.print("YES\n");
		 }
		 else
		 {
			 System.out.print("NO\n");
		 }
		}
		return 0;
	}
}

