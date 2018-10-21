package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 * ????M????????N????????????????????????????????K????
	 *      ???5?1?1?1?5?1???????
	 * ????: 2010-11-28
	 * ??: ??
	 */



	public static int Arrange_Apple(int p, int dish, int apple)
	{
		int sum = 0;
		if (apple < p)
		{
			return 0;
		}
		if (dish == 1 && apple >= p)
		{
			return 1;
		}
		for (int i = p; i <= apple / dish; i++)
		{
			sum += Arrange_Apple(i, dish - 1, apple - i);
		}
		return sum;
	}

	public static int Main()
	{
		int dish = 0;
		int apple = 0;
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dish = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Arrange_Apple(0, dish, apple));
			System.out.print("\n");
		}
		return 0;
	}

}

