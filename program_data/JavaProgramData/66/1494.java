package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t;
		int q;
		int k;
		int sum;
		int f;
		t = (y - 1) / 400;
		q = (y - 1) % 400 / 100;
		k = (y - 1) % 100;
		sum = q * (100 * 365 + 24) + k * 365 + k / 4;
		int[] zz = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		if (y % 4 != 0 || (y % 4 == 0 && y % 100 == 0 && y % 400 != 0))
		{
			sum += zz[m - 1] + d;
		}
		else
		{
			if (m <= 2)
			{
				sum += zz[m - 1] + d;
			}
			else
			{
				sum += zz[m - 1] + d + 1;
			}
		}
		f = (sum - 1) % 7;
			if (f == 0)
			{
				System.out.print("Mon.");
				System.out.print("\n");
			}
			if (f == 1)
			{
				System.out.print("Tue.");
				System.out.print("\n");
			}
			if (f == 2)
			{
				System.out.print("Wed.");
				System.out.print("\n");
			}
			if (f == 3)
			{
				System.out.print("Thu.");
				System.out.print("\n");
			}
			if (f == 4)
			{
				System.out.print("Fri.");
				System.out.print("\n");
			}
			if (f == 5)
			{
				System.out.print("Sat.");
				System.out.print("\n");
			}
			if (f == 6)
			{
				System.out.print("Sun.");
				System.out.print("\n");
			}
	}

}

