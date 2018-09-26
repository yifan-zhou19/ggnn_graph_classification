package <missing>;

public class GlobalMembers
{
	public static int calculate(int x)
	{
		if (x % 2 == 0)
		{
			System.out.print(x);
			System.out.print("/2=");
			System.out.print(x / 2);
			System.out.print("\n");
			x = x / 2;
			if (x == 1)
			{
				System.out.print("End");
				System.out.print("\n");
			}
			else
			{
				calculate(x);
			}
		}
		else if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			System.out.print(x);
			System.out.print("*3+1=");
			System.out.print(x * 3 + 1);
			System.out.print("\n");
			x = x * 3 + 1;
			calculate(x);
		}

		return 0;
	}
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		calculate(num);
		return 0;
	}
}

