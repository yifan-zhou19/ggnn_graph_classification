package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int y;
			int m;
			int d;
			int sum = 0;
			int[][] month =
			{
				{0, 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5},
				{0, 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6}
			};
			int leap;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = (y - 1) / 4 * 2 + y - 1 - (y - 1) / 4 - y / 100 + y / 400; //??100?????
			leap = (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0));
			sum = sum + month[leap][m] + d;
			switch (sum % 7)
			{
			case 0:
				System.out.print("Sun.");
				System.out.print("\n");
				break;
			case 1:
				System.out.print("Mon.");
				System.out.print("\n");
				break;
			case 2:
				System.out.print("Tue.");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("Wed.");
				System.out.print("\n");
				break;
			case 4:
				System.out.print("Thu.");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("Fri.");
				System.out.print("\n");
				break;
			case 6:
				System.out.print("Sat.");
				System.out.print("\n");
				break;
			default:
				System.out.print("error");
				System.out.print("\n");
				break;
			}
			return 0;
	}
}

