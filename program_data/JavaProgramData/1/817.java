package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int judge = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				judge = 0;
			}
		}
			return judge;
	}
	public static int function(int number,int x)
	{
		int temp = 0;
		int i;
		int result = 0;
		if (prime(number) == 0)
		{
			for (i = x;i <= number;i++)
			{
				if (number % i == 0)
				{
					x = i;
					temp = number / i;
					result += function(temp, x);
				}
			}
		}
		else if ((number >= x != 0 || number == 1) && prime(number) != 0)
		{
			result = 1;
		}
		return result;
	}
	public static int Main()
	{
		int i;
		int times;
		int number;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < times;i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(function(number, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

