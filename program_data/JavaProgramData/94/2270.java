package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int a = 0;
		int e;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[N];
		int[] m = new int[N];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
			for (i = 0;i < N;i++)
			{
				m[i] = 0;
			}
			for (i = 0;i < N;i++)
			{
				if ((sz[i]) % 2 == 1)
				{
					a++;
					m[i] = sz[i];
				}
					else
					{
						continue;
					}
			}
			   for (k = 1;k < N;k++)
			   {
			   for (i = 0;i < N - k;i++)
			   {
				   if (m[i] > m[i + 1])
				   {
					   e = m[i + 1];
					   m[i + 1] = m[i];
					   m[i] = e;
				   }
			   }
			   }
				for (i = N - a;i < N - 1;i++)
				{
				System.out.printf("%d,",m[i]);

				}
				System.out.printf("%d",m[N - 1]);
				return 0;

	}






}

