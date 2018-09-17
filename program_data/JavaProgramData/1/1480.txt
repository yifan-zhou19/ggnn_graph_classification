package <missing>;

public class GlobalMembers
{
	public static int divide(int d,int n)
	{
		int sum = 0;
		for (int i = d;i < n;i++)
		{
			if (n % i == 0 && (n / i) >= i)
			{
				sum = sum + 1;
				sum = sum + divide(i, n / i);
			}
		}
		return (sum);
	}
	public static int Main()
	{
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(divide(2, num) + 1);
			System.out.print("\n");
		}
		return 0;
	}

}

