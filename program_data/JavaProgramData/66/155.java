package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a,b,c,d,e,f,g,h,n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int n;
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
		d = a / 400;
		e = a / 4;
		f = a / 100;
		g = 0;
		if (a > 1e8)
		{
			a = a % 2800;
		}
		switch (b)
		{
		case 12:
			g += 30;
		case 11:
			g += 31;
		case 10:
			g += 30;
		case 9:
			g += 31;
		case 8:
			g += 31;
		case 7:
			g += 30;
		case 6:
			g += 31;
		case 5:
			g += 30;
		case 4:
			g += 31;
		case 3:
			g += 28;
		case 2:
			g += 31;
		case 1:
			g += 0;
			break;
		default:
			System.out.print("error\n");
		}
		if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && (b <= 2))
		{
		 e = e-1;
		}
		n = 365 * (a - 1) + g + c + e - f + d;
		h = n % 7;
		switch (h)
		{
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
		case 0:
			System.out.print("Sun.");
			break;
			default:
				System.out.print("error\n");
		}
	}

}

