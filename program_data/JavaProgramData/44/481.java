package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int change = 0; //change???????
		while (num != 0)
		{
			change = change * 10 + num % 10;
			num /= 10;
		}
		return change;
	}
	public static int Main()
	{
		int num; //????
		int i;
		for (i = 0;i < 6;i++) //????
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(reverse(num));
			System.out.print("\n");
		}
		return 0;
	}
}

