package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a % 2 == 0)
		{
			return a / 2;
		}
		return a * 3 + 1;
	}

	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 1)
		{
			if (a % 2 == 0)
			{
				System.out.print(a);
				System.out.print("/2=");
				System.out.print(f(a));
				System.out.print("\n");
			}
			else
			{
				System.out.print(a);
				System.out.print("*3+1=");
				System.out.print(f(a));
				System.out.print("\n");
			}
			a = f(a);
		}
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;
	}
}

