package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//




	public static int Main()
	{
		int w;
		int k;
		int month;
		int daysum = 0;
		int[] a = new int[13];
		int i = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (month = 1;month <= 12;month++)
		{
			if ((daysum + 13) % 7 == (13 - w) % 7)
			{
				a[i] = month;
				i++;
			}
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				daysum = daysum + 31;
			}
			if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				daysum = daysum + 30;
			}
			if (month == 2)
			{
				daysum = daysum + 28;
			}
		}
		for (k = 0;k <= i - 1;k++)
		{
			System.out.print(a[k]);
			System.out.print("\n");
		}
		return 0;
	}

}

