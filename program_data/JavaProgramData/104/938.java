package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{

		if (a == b)
		{
			return a;
		}
		else if (a > b)
		{
			 return f(a / 2, b);
		}
		else if (a < b)
		{
			 return f(a, b / 2);
		}

	}



	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(x, y);

		System.out.print(f(x, y));
		System.out.print("\n");


		return 0;
	}





}

