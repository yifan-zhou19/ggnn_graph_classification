package <missing>;

public class GlobalMembers
{
	public static int answer(int a, int b)
	{
		if (a == b)
		{
			return a;
		}
		else if (a > b)
		{
			return answer(a / 2, b);
		}
		else
		{
			return answer(a, b / 2);
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(answer(x, y));
		System.out.print("\n");
		return 0;
	}
}

