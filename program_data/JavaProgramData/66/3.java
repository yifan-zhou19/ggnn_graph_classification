package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yy;
		int mm;
		int dd;
		int i;
		int[] dm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] d = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dd = Integer.parseInt(tempVar3);
		}
		yy %= 400;
		if (yy == 0)
		{
			yy = 400;
		}
		day += (yy - 1) * 365;
		day += (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400;
		if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0)
		{
			dm[1]++;
		}
		for (i = 0;i < (mm - 1);i++)
		{
			day += dm[i];
		}
		day += dd;
		System.out.printf("%s\n",d[day % 7]);
		return 0;
	}
}

