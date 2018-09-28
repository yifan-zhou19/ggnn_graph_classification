package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*?????? 1200012768 **
	//*???2013.1.10  **
	//*?????????  **
	//********************************
	public static int fun(int a)
	{
		if (a <= 2)
		{
			return 1;
		}
		return fun(a - 1) + fun(a - 2);
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fun(a));
			System.out.print("\n");
		}
		return 0;
	}

}

