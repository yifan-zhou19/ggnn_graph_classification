package <missing>;

public class GlobalMembers
{
	public static void fun(int s)
	{
		if (s == 0)
		{
			return;
		}
		else
		{
			System.out.print(s % 10);
			fun(s /= 10);
		}
	}
	public static int Main()
	{
		int s;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (s == 0)
		{
			System.out.print(s);
		}
		else
		{
			fun(s);
		}
		return 0;
	}


}

