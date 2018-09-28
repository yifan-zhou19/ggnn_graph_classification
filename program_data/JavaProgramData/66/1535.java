package <missing>;

public class GlobalMembers
{
	public static int leap(int n)
	{
		if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		sum = (y - 1 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400) % 7;
		month[2] = month[2] + leap(y);
		for (int i = 0;i < m;i++)
		{
			sum += month[i];
		}
		sum += d - 1;
		sum = sum % 7;
		switch (sum)
		{
			case 0:
				System.out.print("Mon.");
				System.out.print("\n");
				break;
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
		}
		return 0;
	}
}

