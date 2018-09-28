package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			int y;
			int m1;
			int m2;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y % 4 != 0 || (y % 4 == 0 && y % 100 == 0 && y % 400 != 0))
			{
				 int[] zz = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
				 if ((zz[m1 - 1] - zz[m2 - 1]) % 7 == 0)
				 {
					 System.out.print("YES");
					 System.out.print("\n");
				 }
				 else
				 {
					 System.out.print("NO");
					 System.out.print("\n");
				 }
			}
			else
			{
				int[] zz = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
				 if ((zz[m1 - 1] - zz[m2 - 1]) % 7 == 0)
				 {
					 System.out.print("YES");
					 System.out.print("\n");
				 }
				 else
				 {
					 System.out.print("NO");
					 System.out.print("\n");
				 }
			}
		}
	}
}

