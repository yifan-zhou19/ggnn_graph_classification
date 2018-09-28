package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 1)
		{
		if (a % 2 == 1)
		{
			System.out.print(a);
			System.out.print("*");
			System.out.print(3);
			System.out.print("+");
			System.out.print(1);
			System.out.print("=");
			System.out.print(a * 3 + 1);
			System.out.print("\n");
		a = a * 3 + 1;
		}
		else
		{
		System.out.print(a);
		System.out.print("/");
		System.out.print(2);
		System.out.print("=");
		System.out.print(a / 2);
		System.out.print("\n");
		a = a / 2;
		}

		}
	 System.out.print("End");
	 System.out.print("\n");
			  return 0;
	}

}

