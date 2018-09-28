package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int r;
		int s;
		int p;
		int k;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		 for (i = 0;i < m;i++)
		 {
			for (j = 0;j < n;j++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
			}
		 }
			for (r = 0;r < n;r++)
			{
				  p = r;
				 for (s = 0;p >= 0;s++)
				 {
					 if (s < m)
					 {
				   System.out.printf("%d\n",a[s][p]);
					 }
					p--;
				 }
			}
			for (k = n;k <= m + n - 2;k++)
			{
				p = n - 1;
				for (s = k - n + 1;s < m;s++)
				{
					if (p >= 0)
					{
					System.out.printf("%d\n",a[s][p]);
					}
					p--;
				}
			}
			return 0;
	}

}

