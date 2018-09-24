package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                            **
	//*????? 1100013004                     **
	//*???2010.11.14                          **
	//****************************************
	public static int a;
	public static int b;
	public static int even(int a)
	{
		b = a / 2;
		System.out.print(a);
		System.out.print("/");
		System.out.print(2);
		System.out.print("=");
		System.out.print(b);
		System.out.print("\n");
		return b;
	}
	public static int odd(int a)
	{
		b = a * 3 + 1;
		System.out.print(a);
		System.out.print("*");
		System.out.print(3);
		System.out.print("+");
		System.out.print(1);
		System.out.print("=");
		System.out.print(b);
		System.out.print("\n");
		return b;
	}
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			while (a > 1)
			{
				if (a % 2 == 0)
				{
					a = even(a);
				}
				else
				{
					a = odd(a);
				}
			}
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;
	}

}

