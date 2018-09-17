package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			d = 29;
		}
		else
		{
			d = 28;
		}
		switch (b)
		{
		case 1:
				e = c;
				break;
		case 2:
				e = 31 + c;
				break;
		case 3:
				e = 31 + d + c;
				break;
		case 4:
				e = 62 + d + c;
				break;
		case 5:
				e = 92 + d + c;
				break;
		case 6:
				e = 123 + d + c;
				break;
		case 7:
				e = 153 + d + c;
				break;
		case 8:
				e = 184 + d + c;
				break;
		case 9:
				e = 215 + d + c;
				break;
		case 10:
				e = 245 + d + c;
				break;
		case 11:
				e = 276 + d + c;
				break;
		case 12:
				e = 306 + d + c;
				break;
		}
		System.out.printf("%d",e);
		return 0;
	}

}

