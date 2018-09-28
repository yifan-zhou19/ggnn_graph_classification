package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int run(int year)
	public static int run(int year)
	{
		int p;
		if (year % 400 == 0)
		{
			p = 1;
		}
		else if ((year % 100 != 0) && (year % 4 == 0))
		{
			p = 1;
		}
		else
		{
			p = 0;
		}
		return (p);
	}

	public static int Main()
	{
		int[] mon = new int[13];
		mon[1] = 31;
		mon[2] = 28;
		mon[3] = 31;
		mon[4] = 30;
		mon[5] = 31;
		mon[6] = 30;
		mon[7] = 31;
		mon[8] = 31;
		mon[9] = 30;
		mon[10] = 31;
		mon[11] = 30;
		mon[12] = 31;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int i , yahr , monat , day , tag = 0 , zzz ;
		int i;
		int yahr;
		int monat;
		int day;
		int tag = 0;
		int zzz;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yahr = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			monat = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		yahr = yahr - (yahr / 2800 - 1) * 2800;

		for (i = 1 ; i <= yahr - 1 ; i = i++)
		{
			tag = tag + 365 + run(i);
		}
		for (i = 1 ; i <= monat - 1 ; i++)
		{
			tag = tag + mon[i];
		}
		tag = tag + day;
		if (monat > 2)
		{
			tag = tag + run(yahr);
		}

		zzz = tag % 7;


		switch (zzz)
		{
			case 1 :
				System.out.print("Mon.");
				break;
			case 2 :
				System.out.print("Tue.");
				break;
			case 3 :
				System.out.print("Wed.");
				break;
			case 4 :
				System.out.print("Thu.");
				break;
			case 5 :
				System.out.print("Fri.");
				break;
			case 6 :
				System.out.print("Sat.");
				break;
			case 0 :
				System.out.print("Sun.");
				break;
		}

		return (0);
	}

}

