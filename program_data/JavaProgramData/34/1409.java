package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogucaixing.cpp
	 * ??????
	 * ????: 2012-11-25
	 * ?????????
	 */
	public static int print(int x) //?????????
	{
		if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		if (x % 2 == 0)
		{
			System.out.print(x);
			System.out.print("/2=");
			System.out.print(x / 2);
			System.out.print("\n");
		}
		if (x % 2 == 1)
		{
			System.out.print(x);
			System.out.print("*3+1=");
			System.out.print(x * 3 + 1);
			System.out.print("\n");
		}
		return 0;
	}
	public static int number(int x)
	{ //??????????
		if (x == 1)
		{
			print(x);
			return 0;
		}
		if (x % 2 == 0)
		{
			print(x);
			return number(x / 2);
		}
		else
		{
			print(x);
			return number(x * 3 + 1);
		}
	}
	public static int Main()
	{
		int x; //????
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		number(x); //????
		return 0; //????
	}

}

