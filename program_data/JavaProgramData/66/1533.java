package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
		{
			x[1] = 29;
		}
		else
		{
			x[1] = 28;
		}
		int day = 0;
		for (int i = 0;i < a - 1;i++)
		{
			day += x[i];
		}
		day += b;
		int X = (n - 1) % 400;
		for (int i = 1;i <= X;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				day += 2;
			}
			else
			{
				day++;
			}
		}
		int m = (day - 1) % 7;
		switch (m)
		{
		case 1:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		case 6:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		case 0:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		}
		}
		return 0;
	}

}

