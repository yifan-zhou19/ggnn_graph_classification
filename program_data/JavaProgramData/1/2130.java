package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int find = new int(int m,int k);
		int n;
		int y;
		int d;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (d = 0;d < c;d++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		y = find(n, 1);
		System.out.printf("%d\n",y);
		}
	}
	public static int find(int m,int k)
	{
		int i;
		int t = 1;
		int n = 0;
		int x = 0;
		int a;
		int s = 0;
		for (i = 2;i <= m;i++)
		{
			if (m % i == 0)
			{
				n++;
			}
		}
		if (n == 1 || m == 1)
		{
			return 1;
		}
		else
		{
		for (i = 2;i <= m;i++)
		{
			if (m % i == 0 && m / i >= i != 0 && i >= k)
			{

				k = i;
				t = t + find(m / i, k);

			}

		}
		}

		return t;
	}
}

