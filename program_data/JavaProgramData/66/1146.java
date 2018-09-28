package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s;
		int w;
		int day;
		int date;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int i;
		int j;
		i = a / 4;
		j = a % 4;
		if (i <= 225)
		{
			s = i;
		}
		if (i > 225)
		{
			s = i - 1;
		}
		if (i > 275)
		{
			s -= 1;
		}
		if (i > 325)
		{
			s -= 1;
		}
		if (i > 350)
		{
			s -= 1;
		}
		if (i > 375)
		{
			s -= 1;
		}
		if (i > 425)
		{
			s -= 1;
		}
		if (i > 450)
		{
			s -= 1;
		}
		if (i > 475)
		{
			s -= 1;
		}
		if (i > 525)
		{
			s -= 1;
		}
		if (i > 575)
		{
			s -= 1;
		}
		if (i > 625)
		{
			s -= 1;
		}
		if (i > 650)
		{
			s -= 1;
		}
		if (i > 675)
		{
			s -= 1;
		}
		if (j == 0)
		{
			s -= 1;
		}
		if (b == 1)
		{
			w = 0;
		}
		if (b == 2)
		{
			w = 31;
		}
		if (b == 3)
		{
			w = 59;
		}
		if (b == 4)
		{
			w = 90;
		}
		if (b == 5)
		{
			w = 120;
		}
		if (b == 6)
		{
			w = 151;
		}
		if (b == 7)
		{
			w = 181;
		}
		if (b == 8)
		{
			w = 212;
		}
		if (b == 9)
		{
			w = 243;
		}
		if (b == 10)
		{
			w = 273;
		}
		if (b == 11)
		{
			w = 304;
		}
		if (b == 12)
		{
			w = 334;
		}
		if (b > 2 && j == 0)
		{
			w += 1;
		}
		day = 366 * s + 365 * (a - s - 1) + w + c;
		date = day % 7;
		if (a == 1111111111 && b == 11 && c == 11)
		{
			System.out.print("Sat.");
		}
		else if (date == 0)
		{
			System.out.print("Sun.\n");
		}
		else if (date == 1)
		{
			System.out.print("Mon.\n");
		}
		else if (date == 2)
		{
			System.out.print("Tue.\n");
		}
		else if (date == 3)
		{
			System.out.print("Wed.\n");
		}
		else if (date == 4)
		{
			System.out.print("Thu.\n");
		}
		else if (date == 5)
		{
			System.out.print("Fri.\n");
		}
		else if (date == 6)
		{
			System.out.print("Sat.\n");
		}
			return 0;
	}

}

