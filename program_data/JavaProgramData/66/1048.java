package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int w;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			b = 1;
		}
		else
		{
			b = 0;
		}

		switch (m)
		{
		   case 1:
			   a = 0;
		   break;
		   case 2:
			   a = 31;
		   break;
		   case 3:
			   a = 59 + b;
		   break;
		   case 4:
			   a = 90 + b;
		   break;
		   case 5:
			   a = 120 + b;
		   break;
		   case 6:
			   a = 151 + b;
		   break;
		   case 7:
			   a = 181 + b;
		   break;
		   case 8:
			   a = 212 + b;
		   break;
		   case 9:
			   a = 243 + b;
		   break;
		   case 10:
			   a = 273 + b;
		   break;
		   case 11:
			   a = 304 + b;
		   break;
		   case 12:
			   a = 334 + b;
		   break;
		   default:
			   ;
		}

		w = y - 1 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + a + d;
		switch (w % 7)
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
				System.out.print("Wen.");
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
		}

		return 0;
	}
}

