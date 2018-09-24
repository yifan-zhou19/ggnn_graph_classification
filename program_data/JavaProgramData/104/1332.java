package <missing>;

public class GlobalMembers
{
	public static int a1(int n)
	{
		if (n / 2 == 0)
		{
		return 1;
		}
		else
		{
		return (1 + a1(n / 2));
		}
	}
	public static void search(int a,int b)
	{
		if (a1(a) == a1(b))
		{
			if (a / 2 == b / 2 && a / 2 != b / 2)
			{
				System.out.print(a / 2);
			}
			else if (a == b)
			{
				System.out.print(a);
			}
			else
			{
				search(a / 2, b / 2);
			}
		}
			if (a1(a) > a1(b))
			{
				search(a / 2, b);
			}
			if (a1(a) < a1(b))
			{
				search(a, b / 2);
			}
	}




	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		search(x, y);


	}
}

