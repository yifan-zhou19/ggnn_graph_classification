package <missing>;

public class GlobalMembers
{
	public static void function(int num)
	{
		System.out.print(num % 10);
		if ((num / 10) != 0)
		{
			function(num / 10);
		}
	}
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		function(num);
	return 0;
	}

}

