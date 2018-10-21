package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	 int a = 0;
	 int b;
	 while (num != 0)
	 {
	  b = num % 10;
	  a = a * 10 + b;
	  num = num / 10;
	 }
	 return a;
	}
	public static int Main()
	{
		int num;
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			System.out.print(reverse(num));
			System.out.print("\n");
		}
		return 0;

	}
}

