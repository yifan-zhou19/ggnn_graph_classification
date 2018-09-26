package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int year,month,day,a,b,c,A,B,w,i;
	public static int year;
	public static int month;
	public static int day;
	public static int a;
	public static int b;
	public static int c;
	public static int A;
	public static int B;
	public static int w;
	public static int i;


	public static int Main()
	{
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
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			int[] m = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
			a = year / 4 + year / 400 - year / 100 - 1;
			A = a % 7;
			b = year - a - 1;
			B = b % 7;
			c = 366 * A + 365 * B;
			for (i = 0;i < month;i++)
			{
				c += m[i];
			}
			w = (day + c) % 7;
		}
		else
		{
			int[] n = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
			a = year / 4 + year / 400 - year / 100;
			A = a % 7;
			b = year - a - 1;
			B = b % 7;
			c = 366 * A + 365 * B;
			for (i = 0;i < month;i++)
			{
				c += n[i];
			}
			w = (c + day) % 7;
		}
		switch (w)
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
		   default:
			   System.out.print("Sun.\n");
		}
		return 0;
	}


}

