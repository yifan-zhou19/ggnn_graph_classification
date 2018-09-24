package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int m = 0;
		int i = 2;
		for (;i < n;)
		{
		if (n % i == 0)
		{
		break;
		}
		i++;
		}
		{
		if (i == n)
		{
		m = 1;
		}
	}
		return m;
	}
	public static int Main()
	{
		int n;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 3;i <= (n / 2);i++)
		{
			k = n - i;
			{
				if (f(i) == 1 && f(k) == 1)
				{
			System.out.printf("%d %d\n",i,k);
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}




}

