package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y;
		int z;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		if ((x % 100 != 0 && x % 4 == 0) || (x % 100 == 0 && x % 400 == 0))
		{
			switch (y)
			{
			case 1:
				d = z;
				break;
			case 2:
				d = z + 31;
				break;
			case 3:
				d = z + 31 + 29;
				break;
			case 4:
				d = z + 31 + 29 + 31;
				break;
			case 5:
				d = z + 31 + 29 + 31 + 30;
				break;
			case 6:
				d = z + 31 + 29 + 31 + 30 + 31;
				break;
			case 7:
				d = z + 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 8:
				d = z + 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				d = z + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				d = z + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				d = z + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				d = z + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			default:
				;
			}
		}
		else
		{
			switch (y)
			{
			case 1:
				d = z;
				break;
			case 2:
				d = z + 31;
				break;
			case 3:
				d = z + 31 + 28;
				break;
			case 4:
				d = z + 31 + 28 + 31;
				break;
			case 5:
				d = z + 31 + 28 + 31 + 30;
				break;
			case 6:
				d = z + 31 + 28 + 31 + 30 + 31;
				break;
			case 7:
				d = z + 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8:
				d = z + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				d = z + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				d = z + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				d = z + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				d = z + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			default:
				;
			}
		}
		System.out.printf("%d\n",d);
	}
}

