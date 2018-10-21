package <missing>;

public class GlobalMembers
{
	public static int y(int x)
	{
		int i;
		int m = 0;
		for (i = 1;i < Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				m++;
			}
		}
		m = m * 2;
		if (x % i == 0)
		{
			m++;
		}
		return m;
	}
	public static void Main(String[] args)
	{
		int a = 0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n - 1;i += 2)
		{
			if (y(i) == 2 && y(i + 2) == 2)
			{
				System.out.printf("%d %d\n",i,i + 2);
				a++;
			}
		}
		if (a < 1)
		{
			System.out.print("empty");
		}
	}
}

