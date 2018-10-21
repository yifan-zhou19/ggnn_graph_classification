package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int M;
		int N;
		int m;
		int n;
		int i;
		int j = 0;
		int[][] a = new int[100][100];
		int s = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		M = m;
		N = n;
		k = m * n;
		for (;;)
		{

		   for (i = M - m,j = N - n;j < n;j++)
		   {
			System.out.printf("%d\n",a[i][j]);
			s = s + 1;
		   }
				m = m - 1;
				j = j - 1;
				if (s == k)
				{
					break;
				}
				for (i = M - m;i <= m;i++)
				{
					System.out.printf("%d\n",a[i][j]);
					s = s + 1;
				}
						n = n - 1;
						i = i - 1;
						if (s == k)
						{
					break;
						}

						for (j = n - 1;j >= N - n - 1;j--)
						{
							System.out.printf("%d\n",a[i][j]);
							s = s + 1;
						}
						 j = j + 1;
						 if (s == k)
						 {
					break;
						 }

								for (i = m - 1;i >= M - m;i--)
								{
									System.out.printf("%d\n",a[i][j]);
								   s = s + 1;
								}
								i = i + 1;
							if (s == k)
							{
					break;
							}




		}



	}
}

