package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int d;
		int i;
		int j;
		int counter = 0;
		int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
			for (i = 0;i < m - 1;i++)
			{
				counter += month2[i];
			}
			counter += d;
			System.out.print(counter);
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				counter += month1[i];
			}
			counter += d;
			System.out.print(counter);
			System.out.print("\n");
		}
		return 0;
	}
}

