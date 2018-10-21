package <missing>;

public class GlobalMembers
{
	public static void cal(int x)
	{
		if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		if (x > 1)
		{
		if (x % 2 != 0)
		{
			System.out.print(x);
			System.out.print("*3+1=");
			x = x * 3 + 1;
			System.out.print(x);
			System.out.print("\n");
		}
		if (x % 2 == 0)
		{
			System.out.print(x);
			System.out.print("/2=");
			x = x / 2;
			System.out.print(x);
			System.out.print("\n");
		}
		cal(x);
		}
		return;
	}

	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cal(x);
		return 0;
	}


}

