package <missing>;

public class GlobalMembers
{
	public static int Sort(int a,int b)
	{
		int i;
		if (a == b)
		{
			return a;
		}
		else if (a > b)
		{
			Sort(a / 2, b);
		}
		else
		{
			Sort(a, b / 2);
		}
	}

	public static int Main()
	{
		int x;
		int y;
		int xi;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(Sort(x, y));
		System.out.print("\n");
		return 0;
	}
}

