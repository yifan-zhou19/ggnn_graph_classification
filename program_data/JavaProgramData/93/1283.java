package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i = 0;
		int m = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0)
		{
			System.out.print("3");
		i++;
		m++;
		}
		if (a % 5 == 0)
		{
			if (i != 0)
			{
			System.out.print(" 5");
			}
		else
		{
			System.out.print("5");
		}
		i++;
			m++;
		}
		if (a % 7 == 0)
		{
			if (i != 0)
			{
			System.out.print(" 7");
			}
		else
		{
			System.out.print("7");
		}
		m++;
		}
		if (m == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

