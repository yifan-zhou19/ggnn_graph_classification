package <missing>;

public class GlobalMembers
{
	public static int evennumber(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i = i + 1)
		{
			if (x % i == 0)
			{
				return (0);
				break;
			}
		}
		if (i > Math.sqrt(x))
		{
			return (1);
		}
	}
	public static void Main()
	{
		int n = 6;
		int m;
		int k;
		int o;
		int p;
		int e = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= m;n = n + 2)
		{

			for (e = 3;e < n;e = e+2)
			{
				k = n - e;
				o = evennumber(k);
				p = evennumber(e);
				if (o == 1 && p == 1)
				{
					break;
				}
				else
				{
					continue;
				}
			}
			System.out.printf("%d=%d+%d\n",n,e,k);
		}
	}
}

