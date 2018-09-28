package <missing>;

public class GlobalMembers
{
	public static int whether(int n, int k, int[] m, int q)
	{
		int i = 1;
		m[0] = q * n + k;
		for (i = 1;i < n;i++)
		{
			if (m[i - 1] % (n - 1) == 0)
			{
			m[i] = m[i - 1] * n / (n - 1) + k;
			}
			else
			{
				return 0;
				break;
			}
		}
		if (i == n)
		{
			return 1;
		}
	}
	public static void Main()
	{
		int q = 0;
		int[] m = new int[300];
		int k = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (q = 1;;q++)
		{
			if (whether(n, k, m, q) == 1)
			{
				break;
			}
		}
		System.out.printf("%d",m[n - 1]);
	}


}

