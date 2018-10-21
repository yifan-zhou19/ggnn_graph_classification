package <missing>;

public class GlobalMembers
{
	/*
	 * ???:02.cpp
	 * ???:???
	 * ????:2011-11-06
	 * ??:?????????????????????????????????????????100??50??20??10??5??1?????
	 */

	public static int Main()
	{
		int a; //????
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a >= 100) //????????????
		{
			b = (int)(a / 100);
			System.out.print(b);
			System.out.print("\n");
			a = a - b * 100;
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		if (a >= 50)
		{
			System.out.print(1);
			System.out.print("\n");
			a = a - 50;
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		if (a >= 40)
		{
			System.out.print(2);
			System.out.print("\n");
			a = a - 40;
		}
		else if (a >= 20 && a < 40)
		{
			System.out.print(1);
			System.out.print("\n");
			a = a - 20;
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		if (a >= 10)
		{
			System.out.print(1);
			System.out.print("\n");
			a = a - 10;
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		if (a >= 5)
		{
			System.out.print(1);
			System.out.print("\n");
			a = a - 5;
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		System.out.print(a);
		System.out.print("\n");
		return 0; //????
	}
}

