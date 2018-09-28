package <missing>;

public class GlobalMembers
{
	public static int feibonaqi(int N)
	{
		int[] F = new int[1000];
		int i;

		F[0] = 1;
		F[1] = 1;

		for (i = 2; i < N; i++)
		{
			F[i] = F[i - 1] + F[i - 2];
		}

		return F[N - 1];




	}
	public static int Main()
	{
		int n;
		int j;
		int[] a = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 0; j < n; j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}

		for (j = 0; j < n; j++)
		{
			System.out.printf("%d\n", feibonaqi(a[j]));

		}

		return 0;
	}

}

