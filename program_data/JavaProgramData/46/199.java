package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i = 0;
		int j = 0;
		int m = 0;
		int h = 0;
		int g = 0;
		int s = 0;
		int t = 0;
		int[][] an = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < k;j++)
		   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   an[i][j] = Integer.parseInt(tempVar3);
		   }
		   }
		}
		 if (n > k)
		 {
			 s = k;
		 }
		 else
		 {
			 s = n;
		 }
		 for (m = 0;m < ((s + 2) / 2);m++)
		 {
			 for (i = m,j = m;j < k - m - 1;j++)
			 {
				 System.out.printf("%d\n",an[m][j]);
			 }
			 for (i = m;i < n - m - 1;i++)
			 {
				  System.out.printf("%d\n",an[i][k - m - 1]);
			 }
			 for (h = k - m - 1;h > m;h--)
			 {
				System.out.printf("%d\n",an[n - m - 1][h]);
				if (m == s / 2 && s % 2 != 0)
				{
				  break;
				}
			 }
			 for (g = n - m - 1;g > m;g--)
			 {
				  System.out.printf("%d\n",an[g][m]);
				 if (m == s / 2 && s % 2 != 0)
				 {
				  break;
				 }
			 }
		 }
		   if (n == k && n % 2 != 0)
		   {
			   t = (n - 1) / 2;
			 System.out.printf("%d",an[t][t]);
		   }
		   return 0;
	}
}

