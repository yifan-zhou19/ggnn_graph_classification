package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[][] jz = new int[100][100];
		int m;
		int n;

		int[] s = new int[1000];
		int i;
		int j;
		int q;

		for (q = 0;q < k;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			 for (i = 0;i < m;i++)
			 {
				 for (j = 0;j < n;j++)
				 {

					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(jz[i][j]) = Integer.parseInt(tempVar4);
					}
				 }
			 }
			for (i = 0;i < m;i++)
			{
			  s[q] += jz[i][0];
			}
			for (i = 0;i < m;i++)
			{
			   s[q] += jz[i][n - 1];
			}
			for (i = 0;i < n;i++)
			{
				s[q] += jz[0][i];
			}
			for (i = 0;i < n;i++)
			{
				s[q] += jz[m - 1][i];
			}
			s[q] = s[q] - (jz[0][0]) - (jz[0][n - 1]) - (jz[m - 1][0]) - (jz[m - 1][n - 1]);
			if (q == k - 1)
			{
				 System.out.printf("%d",s[q]);
			}
			else
			{
				System.out.printf("%d\n",s[q]);
			}
			m = 0;
			n = 0;
		}
		return 0;
	}

}

