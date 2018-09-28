package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????
	 * ?????2011-11-6
	 * ?????
	 * ???????????
	 */
	public static int Main()
	{
		int money; //????
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (money >= 100) //????????????
		{
				money = money - 100;
			a++;
		}
		while (money >= 50)
		{
				money = money - 50;
			b++;
		}
		while (money >= 20)
		{
				money = money - 20;
			c++;
		}
		while (money >= 10)
		{
				money = money - 10;
			d++;
		}
		while (money >= 5)
		{
				money = money - 5;
			e++;
		}
		while (money >= 1)
		{
					money = money - 1;
				f++;
		}
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		return 0;
	}

}

