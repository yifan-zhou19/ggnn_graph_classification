package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void f(int n,int y)
	{
		int a = Math.sqrt(n);
		for (int i = y;i <= a;i++)
		{
			if (n % i == 0)
			{
				sum++;
				y = i;
				f(n / i, y);
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			int num;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			f(num, 2);
			System.out.print(sum + 1);
			System.out.print("\n");
		}
		return 0;
	}
}

