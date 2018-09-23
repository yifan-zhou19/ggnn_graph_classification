package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void f(int k,int n)
	{
		int i;
		int flag = 0;
		for (i = k;i <= n;i++)
		{
			if (n % i == 0)
			{
				f(i, n / i);
				flag = 1;
			}
		}
		if ((flag == 0 && k <= n) || n == 1)
		{
		num++;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   f(2, n);
		   System.out.print(num);
		   System.out.print("\n");
		   num = 0;
		}

		return 0;
	}

}

