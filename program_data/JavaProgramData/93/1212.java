package <missing>;

public class GlobalMembers
{
	public static int flag;

	public static void out_put(int num)
	{
		++flag;
		if (flag != 1)
		{
			System.out.print(" ");
		}
		System.out.print(num);
		return;
	}

	public static int Main()
	{
		int n;
		flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0)
		{
			out_put(3);
		}
		if (n % 5 == 0)
		{
			out_put(5);
		}
		if (n % 7 == 0)
		{
			out_put(7);
		}
		if (flag == 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

