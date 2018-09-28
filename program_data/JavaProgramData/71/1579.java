package <missing>;

public class GlobalMembers
{
	/*??5 ??
	  ?? ???
	  ?? ??? ?? 1300012989*/
	public static int Main()
	{
		int n; //n?????
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int year; //year????mon1,mon2????days??????m??????
		int mon1;
		int mon2;
		int days;
		int m;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //???????
		for (i = 1;i <= n;i++) //n???????
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			days = 0; //?????????0
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) //???????????????
			{
				a[2] = 29;
			}
			else
			{
				a[2] = 28;
			}
			if (mon1 > mon2) //????????
			{
				m = mon1,mon1 = mon2,mon2 = m;
			}
			else
			{
				mon1 = mon1,mon2 = mon2;
			}
			for (j = 0;j < (mon2 - mon1);j++) //??????
			{
				days += a[mon1 + j];
			}
			if (days % 7 == 0) //??????????????
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
		return 0;
	}




}

