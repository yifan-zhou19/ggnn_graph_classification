package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; ;i++)
		{
			if (number >= 100)
			{
				a = number / 100;
				number = number - 100 * a;
			}

			if (number < 100 && number >= 50)
			{
				b = number / 50;
				number = number - 50 * b;
			}

			if (number < 50 && number >= 20)
			{
				c = number / 20;
				number = number - 20 * c;

			}
			if (number < 20 && number >= 10)
			{
				d = number / 10;
				number = number - 10 * d;
			}
			if (number < 10 && number >= 5)
			{
				e = number / 5;
				number = number - 5 * e;
			}
			if (number < 5 && number>0)
			{
				f = number;
				break;
			}
			if (number <= 0)
			{
				break;
			}
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

