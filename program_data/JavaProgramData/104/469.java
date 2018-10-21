package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{ //????f(x)???????
		while (x != y)
		{
			if (x > y)
			{
				x = x / 2;
			}
			else
			{
				y = y / 2;
			}
		}
		return x;
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a, b));
		System.out.print("\n");
		return 0;
	}
}

