package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int gen = new int(int, int); //???????????
		System.out.print(gen(x, y));
		return 0;
	}

	public static int up(int a) //??a????
	{
		int line;
		int k;
		int m;
		m = a;
		for (line = 0; m != 0; line++) //??a????line
		{
			m /= 2;
		}
		k = Math.pow(2.0, line-2) + (a - Math.pow(2.0, line-1)) / 2; //???????a????k
		return k;
	}
	public static int gen(int a, int b) //????????a?b?????
	{
		if (a == b) //?a??b?????
		{
			return a;
		}
		if (a > b) //?a??b??a????up(a)?b???
		{
			a = up(a);
			return gen(a, b);
		}
		if (a < b) //?b??a???
		{
			 b = up(b);
			 return gen(a, b);
		}
	}
}

