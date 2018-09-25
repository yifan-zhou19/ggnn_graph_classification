package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int er = 0;
		int ws = 0;
		int sh = 0;
		int wu = 0;
		int b = 0;
		int money;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;)
		{
			if (money / 100 >= 1)
			{
				money = money - 100;
				b = b + 1;
			}
		else
		{
			break;
		}
		} //?????100???
		for (;;)
		{
			if (money / 50 >= 1)
			{
				money = money - 50;
				ws = ws + 1;
			}
		else
		{
			break;
		}
		} //?????50???
		for (;;)
		{
			if (money / 20 >= 1)
			{
				money = money - 20;
				er = er + 1;
			}
		else
		{
			break;
		}
		}
		for (;;)
		{
			if (money / 10 >= 1)
			{
				money = money - 10;
				sh = sh + 1;
			}
		else
		{
			break;
		}
		}
		for (;;)
		{
			if (money / 5 >= 1)
			{
				money = money - 5;
				wu = wu + 1;
			}
		else
		{
			break;
		}
		}
		System.out.print(b);
		System.out.print("\n");
		System.out.print(ws);
		System.out.print("\n");
		System.out.print(er);
		System.out.print("\n");
		System.out.print(sh);
		System.out.print("\n");
		System.out.print(wu);
		System.out.print("\n");
		System.out.print(money);
		System.out.print("\n");
		return 0;
	}

}

