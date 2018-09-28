package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int apple = new int(int n,int k);
		int N;
		int K;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			K = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",apple(N, K));
	}
	public static int apple(int n,int k)
	{
		int m;
		int i;
		int j;
		for (j = n + 1;;j++)
		{
			m = j;
			for (i = 0;i < n;i++)
			{
				if ((m - k) > 0 && (m - k) % n == 0)
				{
					m = (m - k) / n * (n - 1);
				}
				else
				{
					m = 0;
					break;
				}
			}
			if (m > 0)
			{
				break;
			}
		}
		return j;
	}

}

