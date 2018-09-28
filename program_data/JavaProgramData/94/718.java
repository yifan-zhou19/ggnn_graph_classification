package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int k;
		int e;
		int N;

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
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[i] = a[i];
			}
			else
			{
				b[i] = 0;
			}
		}

		for (k = 1;k <= N;k++)
		{
		   for (i = 0;i < N - 1;i++)
		   {
				if (b[i] >= b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
		   }
		}
		for (i = 0;i < N;i++)
		{
			if (b[i] != 0 && i != N - 1)
			{
				System.out.printf("%d,",b[i]);
			}
			if (b[i] != 0 && i == N - 1)
			{
				System.out.printf("%d",b[N - 1]);
			}
		}


		return 0;
	}
}

