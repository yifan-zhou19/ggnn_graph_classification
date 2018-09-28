package <missing>;

public class GlobalMembers
{
	public static int divide(int m,int n,int k,int i)
	{ //i???????????
		if ((m - k) % n != 0)
		{
			return 0;
		}
		else
		{
			if (i == 1)
			{
				return m;
			}
			else
			{
				m = (m - k) / n * (n - 1);
				i--;
				return divide(m, n, k, i);
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int left;
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
		for (m = k;;m++)
		{
			left = divide(m, n, k, n);
			if (left - k >= n)
			{
				System.out.printf("%d",m);
				break;
			}
		}
		return 0;
	}
}

