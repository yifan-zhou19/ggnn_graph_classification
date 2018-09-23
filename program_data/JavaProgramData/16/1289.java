package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num; //??????????10000??????????????
		int a;
		int b;
		int c;
		int d;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = num / 1000; //??????
		b = (num - a * 1000) / 100; //??????
		c = (num - a * 1000 - b * 100) / 10; //??????
		d = num - a * 1000 - b * 100 - c * 10; //??????
		if (a != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		else if (a == 0 && b != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
		}
		else if (a == 0 && b == 0 && c != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		else
		{
			System.out.print(d);
			System.out.print("\n");
		}
		return 0;
	}

}

