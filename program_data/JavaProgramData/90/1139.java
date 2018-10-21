package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int a,int b);
		int i;
		int n;
		int apple;
		int plate;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(apple, plate));
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int a,int b) //??????????
	{
		int result;
		if (b == 1 && a != 0)
		{
			result = 1;
		}
		else if (a == 0)
		{
			result = 1;
		}
		else if (a >= b)
		{
			result = f(a, b - 1) + f(a - b, b);
		}
		else
		{
			result = f(a, a);
		}
		return result;
	}
}

