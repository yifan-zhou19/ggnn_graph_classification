package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void reverse(int num);
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			reverse(num);
		}
		return 0;
	}

	public static void reverse(int num0)
	{
		int num1 = 0;
		int n = 1;
		while (num0 / n != 0)
		{
			n = n * 10;
		}
		for (int i = 10;i <= n;i = i * 10)
		{
			num1 = num1 + (num0 % i) / (i / 10) * (n / i);
			num0 = num0 - num0 % i;
		}
		System.out.print(num1);
		System.out.print("\n");
	}

}

