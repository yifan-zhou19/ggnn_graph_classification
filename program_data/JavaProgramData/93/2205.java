package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int leap_1 = 0;
		int leap_2 = 0;
		int leap_3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num % 3 == 0)
		{
			leap_1 = 1;
		}
		if (num % 5 == 0)
		{
			leap_2 = 1;
		}
		if (num % 7 == 0)
		{
			leap_3 = 1;
		}
		if (leap_1 * leap_2 * leap_3 == 1)
		{
			System.out.print("3 5 7");
		}
		else if (leap_1 * leap_2 == 1)
		{
			System.out.print("3 5");
		}
		else if (leap_1 * leap_3 == 1)
		{
			System.out.print("3 7");
		}
		else if (leap_2 * leap_3 == 1)
		{
			System.out.print("5 7");
		}
		else if (leap_1 == 1)
		{
			System.out.print("3");
		}
		else if (leap_2 == 1)
		{
			System.out.print("5");
		}
		else if (leap_3 == 1)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}

}

