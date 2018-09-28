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
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int s = 0;
		int r = 0;
		int c = 0;

		int[][] jz = new int[100][100];
		int m;
		int n;
		int i = 1;
		while (i <= k)
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
			for (int jm = 0;jm < m;jm++)
			{
				for (int jn = 0;jn < n;jn++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						jz[jm][jn] = Integer.parseInt(tempVar4);
					}
				}
			}
			r = 0;
			c = 0;
			for (c = 0;c < n;c++)
			{
				s1 += jz[r][c];
			}
			r = m - 1;
			c = 0;
			for (c = 0;c < n;c++)
			{
				s2 += jz[r][c];
			}
			r = 0;
			c = 0;
			for (r = 0;r < m;r++)
			{
				s3 += jz[r][c];
			}
			r = 0;
			c = n - 1;
			for (r = 0;r < m;r++)
			{
				s4 += jz[r][c];
			}
			s = s1 + s2 + s3 + s4 - jz[0][0] - jz[0][n - 1] - jz[m - 1][0] - jz[m - 1][n - 1];
			System.out.printf("%d",s);
			s1 = 0;
			s2 = 0;
			s3 = 0;
			s4 = 0;
			s = 0;

			if (i != k)
			{
				System.out.print("\n");
			}








			i++;
		}




		return 0;
	}
}

