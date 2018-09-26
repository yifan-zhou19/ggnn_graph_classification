//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		int num = new int(int year,int month,int day);
		int laf = new int(int a,int b);
		s1 = num(year1, month1, day1);
		s2 = num(year2, month2, day2);
		s3 = laf(year1, year2);
		System.out.printf("%d\n",s3 + s2 - s1);
	}
	public static int num(int year,int month,int day)
	{
		int z;
		int sum1 = new int(int a,int b);
		int sum2 = new int(int a,int b);
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
		{
		   z = sum1(month, day);
		}
		else
		{
			z = sum2(month, day);
		}
		return (z);
	}
	public static int sum1(int a,int b)
	{
		int z = 0;
		switch (a)
		{
			case 1:
				z = b;
				break;
			case 2:
				z = 31 + b;
				break;
			case 3:
				z = 60 + b;
				break;
			case 4:
				z = 91 + b;
				break;
			case 5:
				z = 121 + b;
				break;
			case 6:
				z = 152 + b;
				break;
			case 7:
				z = 182 + b;
				break;
			case 8:
				z = 213 + b;
				break;
			case 9:
				z = 244 + b;
				break;
			case 10:
				z = 274 + b;
				break;
			case 11:
				z = 305 + b;
				break;
			case 12:
				z = 335 + b;
		}
		return (z);
	}
	public static int sum2(int a,int b)
	{
		int z = 0;
		switch (a)
		{
			case 1:
				z = b;
				break;
			case 2:
				z = 31 + b;
				break;
			case 3:
				z = 59 + b;
				break;
			case 4:
				z = 90 + b;
				break;
			case 5:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


