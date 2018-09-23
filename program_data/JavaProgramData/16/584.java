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
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (0 <= a != 0 && a <= 9)
		{
			b = 1;
		}
		else
		{
			if (10 <= a != 0 && a <= 99)
			{
			b = 2;
			}
	else
	{
		if (100 <= a != 0 && a <= 999)
		{
			b = 3;
		}
		else
		{
			if (1000 <= a != 0 && a <= 9999)
			{
			b = 4;
			}
	else
	{
		if (10000 <= a != 0 && a <= 99999)
		{
			b = 5;
		}
	}
		}
	}
		}
	switch (b)
	{
			case 1:
			{
				System.out.printf("%d\n",a);
			}
			break;
		case 2:
		{
			c = a / 10;
			 d = a % 10;
				System.out.printf("%d%d\n",d,c);
		}
		break;
	case 3:
	{
		c = a / 100;
			 d = (a - c * 100) / 10;
				e = a - c * 100 - d * 10;
				System.out.printf("%d%d%d\n",e,d,c);
	}
	break;
	case 4:
	{
		c = a / 1000;
			 d = (a - c * 1000) / 100;
				e = (a - c * 1000 - d * 100) / 10;
				f = a - c * 1000 - d * 100 - e * 10;
				System.out.printf("%d%d%d%d\n",f,e,d,c);
	}
	break;
	case 5:
	{
		c = a / 10000;
			 d = (a - c * 10000) / 1000;
				e = (a - c * 10000 - d * 1000) / 100;
				f = (a - c * 10000 - d * 1000 - e * 100) / 10;
				g = a - c * 10000 - d * 1000 - e * 100 - f * 10;
				System.out.printf("%d%d%d%d%d\n",g,f,e,d,c);
	}
	}
				return 0;
	}

}

