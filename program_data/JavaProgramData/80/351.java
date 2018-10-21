package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int by;
		int bm;
		int bd;
		int ey;
		int em;
		int ed;
		int[] mon1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mon2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		int i;
		int j;
		by = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = by;i < ey;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		for (i = 1;i < em;i++)
		{
			if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
			{
				sum = sum + mon2[i];
			}
			else
			{
				sum = sum + mon1[i];
			}
		}
		sum = sum + ed;
		for (i = 1;i < bm;i++)
		{
			if ((by % 4 == 0 && by % 100 != 0) || (by % 400 == 0))
			{
				sum = sum - mon2[i];
			}
			else
			{
				sum = sum - mon1[i];
			}
		}
		sum = sum - bd;
		System.out.print(sum);
		System.out.print("\n");
		return 0;

	}
}

