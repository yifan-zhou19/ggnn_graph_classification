package <missing>;

public class GlobalMembers
{
	//???2010?12?1?

	//???1000010586_???

	//???????

	public static int m;
	public static int num;
	public static int make(int a)
	{
		int i;
		int j;
		int ans;
		ans = Math.sqrt(a);
		if (pan(a) == 0)
		{
			num++;
			return num;
		}
		else
		{
			num++;
			for (i = m / a ; i <= ans ; i++)
			{
				if (i == 1)
				{
					continue;
				}
				if (a % i == 0)
				{
					m = a;
					num = make(a / i);
				}
			}
			if (i == ans + 1)
			{
				return num;
			}
		}
		return num;
	}
	public static int pan(int a)
	{
		int n = 0;
		int i;
		for (i = 1 ; i <= Math.sqrt(a) ; i++)
		{
			if (a % i == 0)
			{
				n++;
			}
		}
		if (n == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 0;
			m = a;
			System.out.print(make(a));
			System.out.print("\n");
		}
		return 0;
	}

}

