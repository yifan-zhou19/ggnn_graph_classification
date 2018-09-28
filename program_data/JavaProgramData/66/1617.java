package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int daysum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] daynor = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dayleap = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		daysum = (((y - 1) % 7) * (365 % 7) % 7) + ((y - 1) / 4) % 7 - ((y - 1) / 100) % 7 + ((y - 1) / 400) % 7;
		if ((y % 4 != 0) || ((y % 100 == 0) && (y % 400 != 0)))
		{
		   for (int i = 0;i < m;i++)
		   {
			  daysum += (daynor[i] % 7);
		   }
		}
		else
		{
		   for (int i = 0;i < m;i++)
		   {
			  daysum += (dayleap[i] % 7);
		   }
		}
		daysum += (d % 7);
		if (daysum % 7 == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		else if (daysum % 7 == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		else if (daysum % 7 == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		else if (daysum % 7 == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		else if (daysum % 7 == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		else if (daysum % 7 == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		else if (daysum % 7 == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}

		return 0;
	}

}

