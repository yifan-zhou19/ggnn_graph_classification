package <missing>;

public class GlobalMembers
{
	public static int g(int x)
	{
		if (x == 0)
		{
			return 0;
		}
		else
		{
		if (x == 1)
		{
			return 1;
		}
		else
		{
		int s = 0;
		int i = 1;
		while (i <= x)
		{
			if (x % i == 0)
			{
				s++;
			}
			i++;
		}
			return s;
		}
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			if (g(i) == 2 && g(i + 2) == 2)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
			p++;
		}
		if (p == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

