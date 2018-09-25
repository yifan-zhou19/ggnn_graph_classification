package <missing>;

public class GlobalMembers
{
	public static int result;

	public static void function(int apple,int dish,int min)
	{
		if (dish == 0 && apple == 0)
		{
			result++;
		}
		if (dish == 0 && apple != 0 || apple == 0 && dish != 0 || apple < min)
		{
			return;
		}
		for (int k = min;k <= apple / dish;k++)
		{
			function(apple - k, dish - 1, k);
		}
	}

	public static int Main()
	{
		int n;
		int apple;
		int dish;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dish = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			function(apple, dish, 0);
			System.out.print(result);
			System.out.print("\n");
			result = 0;
		}
		return 0;
	}

}

