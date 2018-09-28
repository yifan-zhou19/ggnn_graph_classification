package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int day;
		int mon;
		int i;
		int sum;
		int xingqiji;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = day + 12;
		for (mon = 1; mon <= 12; mon++)
		{
			switch (mon)
			{
				case 1 :
					i = 0;
					break;
				case 2 :
				case 4 :
				case 6 :
				case 8 :
				case 9 :
				case 11 :
					i = 31;
					break;
				case 3 :
					i = 28;
					break;
				case 5 :
				case 7 :
				case 10 :
				case 12 :
					i = 30;
					break;
			}
			sum = sum + i;
			xingqiji = sum % 7;
			if (xingqiji == 5)
			{
				System.out.print(mon);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

