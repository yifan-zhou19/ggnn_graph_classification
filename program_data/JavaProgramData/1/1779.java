package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void yinshu(int x,int y)
	{
		if (x == y)
		{
			num++;
		}
		else if ((x % y == 0) && (x > y))
		{
			yinshu(x / y, y);
			yinshu(x, y + 1);
		}
		else if (x > y)
		{
			yinshu(x, y + 1);
		}
	}
	public static int Main()
	{
		int n;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yinshu(x, 2);
		System.out.print(num);
		System.out.print("\n");
		num = 0;
		}
	}

}

