package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012855 **
	//*???2013.11.27  **
	//********************************


	public static int putapple(int apple, int basket)
	{
		if (apple < 0)
		{
			return 0; // ??apple <0 ????????
		}
		if (basket == 1)
		{
			return 1; // ??basket == 1 ?????????
		}

		// ????????????
		int situation1 = putapple(apple, basket - 1);

		// ?????????
		int situation2 = putapple(apple - basket, basket);
		return situation1 + situation2; // ????????
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			int apple;
			int basket;
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			basket = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(putapple(apple, basket));
			System.out.print("\n");
		}
		return 0;
	}
}

