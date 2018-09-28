package <missing>;

public class GlobalMembers
{
	public static int getsu1(int getsu)
	{
		int b = 0;
		switch (getsu)
		{
		case 12:
			b = b + 30;
		case 11:
			b = b + 31;
		case 10:
			b = b + 30;
		case 9:
			b = b + 31;
		case 8:
			b = b + 31;
		case 7:
			b = b + 30;
		case 6:
			b = b + 31;
		case 5:
			b = b + 30;
		case 4:
			b = b + 31;
		case 3:
			b = b + 28;
		case 2:
			b = b + 31;
		case 1:
			b = b + 0;
		}
		return (b);
	}

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: void shuu(long unsigned int s)
	public static void shuu(int s)
	{
		switch (s % 7)
		{
		case 0:
			System.out.print("Sat");
			break;
		case 1:
			System.out.print("Sun");
			break;
		case 2:
			System.out.print("Mon");
			break;
		case 3:
			System.out.print("Tue");
			break;
		case 4:
			System.out.print("Wed");
			break;
		case 5:
			System.out.print("Thu");
			break;
		case 6:
			System.out.print("Fri");
			break;

		}
		System.out.print(".");
	}

	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: long unsigned int toshi,getsu,hi,l=0,s=0,a,b;
		 int toshi;
		 int getsu;
		 int hi;
		 int l = 0;
		 int s = 0;
		 int a;
		 int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			toshi = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			getsu = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			hi = Integer.parseInt(tempVar3);
		}
		if (getsu >= 3)
		{
			l = toshi / 4 - toshi / 100 + toshi / 400;
			b = toshi % 7;
			a = b * 365 + l;
		}
		else
		{
			l = (toshi - 1) / 4 - (toshi - 1) / 100 + (toshi - 1) / 400;
			b = toshi % 7;
			a = b * 365 + l;
		}
		s = s + a + getsu1(getsu) + hi;
		shuu(s);

	}

}

