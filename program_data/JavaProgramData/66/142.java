package <missing>;

public class GlobalMembers
{
	public static int rn(int year)
	{ //?????????? 1?true 0?false
		if (year % 4 == 0 && year % 100 != 0)
		{
			return 1;
		}
		if (year % 100 == 0 && year % 400 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static int dn(int year, int month, int day)
	{ //  ????????????
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int sum;
		sum = 0;
		for (i = 0;i < (month - 1);i++)
		{
			sum += a[i];
		}
		sum += day;
		if (rn(year) == 1 && month >= 3)
		{
			sum += 1;
		}
		return sum;
	}
	public static int rns(int year)
	{
		int x;
		x = year / 100 * 24 + (year % 100) / 4 + year / 400;
		return x;
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		int xq;
		int daysum;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//rns=0;
		//for(i=1;i<y;i++) {if(rn(i)==1) rns++;}
		daysum = ((y - 1) * (365 % 7)) % 7 + rns(y - 1) + dn(y, m, d);
		xq = daysum % 7;

		switch (xq)
		{
		case 0:
			System.out.print("Sun.");
			break;
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		default:
			;
		}
		return 0;
	}
}

