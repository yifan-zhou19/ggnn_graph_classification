package <missing>;

public class GlobalMembers
{
	public static int lp(int x,int y)
	{
		int z = 0;
		if (x > 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0))
		{
			z = 1;
		}
		return (z);
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int year,month,day;
		int year;
		int month;
		int day;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int v=0,num=0;
		int v = 0;
		int num = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j,k,n[11]={3,0,3,2,3,2,3,3,2,3,2};
		int i;
		int j;
		int k;
		int[] n = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		j = (year - 1) / 400;
		k = year - j * 400;
		if (k >= 100)
		{
			if (k >= 200)
			{
				if (k >= 300)
				{
					i = 3;
				}
				else
				{
					i = 2;
				}
			}
			else
			{
				i = 1;
			}
		}
		else
		{
			i = 0;
		}
		v = (year - 1) / 4 - 3 * j - i;
		num = (year - 1 - v) + 2 * v;
		for (i = 0;i < month - 1;i++)
		{
			num += n[i];
		}
		if (lp(month, year) == 1)
		{
			num += 1;
		}
		num += day;
		switch (num % 7)
		{
			case 0:
				System.out.print("Sun.\n");
				break;
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
		}
		return 0;
	}

}

