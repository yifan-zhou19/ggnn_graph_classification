package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int n;
		int i;
		int e;
		int m = 0;
		int[] sz = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 sz[i] = Integer.parseInt(tempVar2);
				 }
				 if (sz[i] % 2 != 0)
				 {
						m = m + 1;
						sz[m - 1] = sz[i];
				 }
		}
		for (n = 1;n <= m;n++)
		{
				 for (i = 0;i < m - n;i++)
				 {
						if (sz[i] > sz[i + 1])
						{
							   e = sz[i + 1];
							   sz[i + 1] = sz[i];
							   sz[i] = e;
						}
				 }
		}
		for (i = 0;i < m;i++)
		{
				 if (i != m - 1)
				 {
						System.out.printf("%d,",sz[i]);
				 }
				 else
				 {
						System.out.printf("%d",sz[i]);
				 }
		}
		return 0;
	}



}

