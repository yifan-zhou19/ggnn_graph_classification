package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ec = new int(int a,int b); //?? ec????
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(ec(x, y));
		return 0;
	}
	public static int ec(int a,int b)
	{
		if (a == b)
		{
			return a; //??????
		}
		if (a > b)
		{
			int t = a;
			a = b;
			b = t;
		}
		return (ec(a, b / 2)); //????
	}
}

