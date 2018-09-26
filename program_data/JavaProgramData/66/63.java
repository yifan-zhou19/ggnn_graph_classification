package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int y,m,d,i,n=0,temp,p;
		int y;
		int m;
		int d;
		int i;
		int n = 0;
		int temp;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		n += (y - 1) / 4 * (1 * 4 + 1) - (y - 1) / 100 + (y - 1) / 400;
		n += (y - 1) % 4 * 1;
		if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
		{
			p = 29;
		}
		else
		{
			p = 28;
		}
		for (i = 1;i < m;i++)
		{
			switch (i)
			{
			case 1:
				n += 31;
				break;
			case 2:
				n += p;
				break;
			case 3:
				n += 31;
				break;
			case 4:
				n += 30;
				break;
			case 5:
				n += 31;
				break;
			case 6:
				n += 30;
				break;
			case 7:
				n += 31;
				break;
			case 8:
				n += 31;
				break;
			case 9:
				n += 30;
				break;
			case 10:
				n += 31;
				break;
			case 11:
				n += 30;
				break;
			default :
				break;
			}
		}
		n += d;
		temp = n % 7;
		switch (temp)
		{
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
			break;
		}
		return 0;
	}

}

