package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int apple = new int(int m,int n,int k);
		int m;
		int n;
		int k;
		int i;
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
		for (i = 1;;i++)
		{
			m = i;
			m = apple(m, n, k);
			if (m != 0)
			{
				System.out.printf("%d\n",m);
				break;
			}
		}
	}
	public static int apple(int m,int n,int k)
	{
		int j;
		for (j = 1;j <= n;j++)
		{
			if (m % (n - 1) == 0)
			{
				m = m * n / (n - 1) + k;
			}
			else
			{
				m = 0;
				break;
			}
		}
		return (m);
	}
}

