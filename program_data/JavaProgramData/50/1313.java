package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*11.2??  ?????                                 *
	//*?????  ?? 1100012844                          *
	//*???2011?11?2?                                  *
	//*******************************************************
	public static int Main()
	{
		// days????????????
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w; // a??????1?1??i?13?????
		int i;
		int[] a = {0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		// ??1?1??i?13????????a[i]?
		for (i = 1; i < 12; i++)
		{
			a[i + 1] = a[i] + days[i];
		}

		// ??a??
		for (i = 1; i <= 12; i++)
		{
			if ((w + (a[i] % 7)) % 7 == 5) // ????
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

