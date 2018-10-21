package <missing>;

public class GlobalMembers
{
	public static int fenpei(int n, int k)
	{
		int i = 0;
		int m = n - 1;
		int j = 0;
		int t = 1;
		while (true)
		{
			j = 0;
			m = t * (n - 1);
			for (i = 0;i < n;i++)
			{
			if (m % (n - 1) != 0)
			{
				break;
			}
			m = m / (n - 1) * n + k;
			j++;
			if (j == n)
			{
				break;
			}
			}
			if (j == n)
			{
				break;
			}
			else
			{
				t++;
			}
		}
		return m;
	}
	public static void Main(String[] args)
	{
		int n = 0;
		int k = 0;
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
		System.out.printf("%d",fenpei(n, k));
	}
}

