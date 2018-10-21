package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int ay;
		int am;
		int ad;
		int by;
		int bm;
		int bd;
		int day = 0;
		int[] moutha = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mouthb = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		ay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		am = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ad = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		by = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = ay ; i < by; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				day += 366;
			}
			else
			{
				day += 365;
			}
		}
		for (i = 0; i < bm - 1;i++)
		{
			if ((by % 4 == 0 && by % 100 != 0) || (by % 400 == 0))
			{
				day += mouthb[i];
			}
			else
			{
				day += moutha[i];
			}
		}
		day += bd;
		for (i = 0; i < am - 1; i++)
		{
			if ((ay % 4 == 0 && ay % 100 != 0) || (ay % 400 == 0))
			{
				day -= mouthb[i];
			}
			else
			{
				day -= moutha[i];
			}
		}
		day -= ad;
		System.out.print(day);
		System.out.print("\n");
		return 0;
	}
}

