package <missing>;

public class GlobalMembers
{
	public static int f(int N, int min)
	{
		int s = 1;
		int i;
		if (N < min)
		{
			return 0;
		}
		for (i = min; i < N; i++)
		{
			if (N % i == 0)
			{
				s += f(N / i, i);
			}
		}
		return s;
	}

	public static int Main()
	{
		int n;
		int i;
		int b = 2;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%d\n", f(a[i], b));
		}
		return 0;
	}
}

