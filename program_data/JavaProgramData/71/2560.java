//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int cra;
		int crb;
		int rnd;
		int sdx;
		int year;
		int jy1;
		int nl1;
		int yue1;
		int month2;
		int l;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			yue1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			month2 = Integer.parseInt(tempVar4);
		}
		rnd = ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400) * (366 % 7);
		sdx = (year - 1 - ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400)) * (365 % 7);
		if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0))
		{
			if (yue1 == 1)
			{
				jy1 = 0;
			}
			if (yue1 == 2)
			{
				jy1 = 31;
			}
			if (yue1 == 3)
			{
				jy1 = 31 + 29;
			}
			if (yue1 == 4)
			{
				jy1 = 31 + 29 + 31;
			}
			if (yue1 == 5)
			{
				jy1 = 31 + 29 + 31 + 30;
			}
			if (yue1 == 6)
			{
				jy1 = 31 + 29 + 31 + 30 + 31;
			}
			if (yue1 == 7)
			{
				jy1 = 31 + 29 + 31 + 30 + 31 + 30;
			}
			if (yue1 == 8)
			{
				jy1 = 31 + 29 + 31 + 30 + 31 + 30 + 31;
			}
			if (yue1 == 9)
			{
				jy1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (yue1 == 10)
			{
				jy1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			if (yue1 == 11)
			{
				jy1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (yue1 == 12)
			{
				jy1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}

		}

		else
		{
			if (yue1 == 1)
			{
				jy1 = 0;
			}
			if (yue1 == 2)
			{
				jy1 = 31;
			}
			if (yue1 == 3)
			{
				jy1 = 31 + 28;
			}
			if (yue1 == 4)
			{
				jy1 = 31 + 28 + 31;
			}
			if (yue1 == 5)
			{
				jy1 = 31 + 28 + 31 + 30;
			}
			if (yue1 == 6)
			{
				jy1 = 31 + 28 + 31 + 30 + 31;
			}
			if (yue1 == 7)
			{
				jy1 = 31 + 28 + 31 + 30 + 31 + 30;
			}
			if (yue1 == 8)
			{
				jy1 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			}
			if (yue1 == 9)
			{
				jy1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			}
			if (yue1 == 10)
			{
				jy1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			if (yue1 == 11)
			{
				jy1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			if (yue1 == 12)
			{
				jy1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}
		}
		if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0))
		{
			if (month2 == 1)
			{
				nl1 = 0;
			}
			if (month2 == 2)
			{
				nl1 = 31;
			}
			if (month2 == 3)
			{
				nl1 = 31 + 29;
			}
			if (month2 == 4)
			{
				nl1 = 31 + 29 + 31;
			}
			if (month2 == 5)
			{
				nl1 = 31 + 29 + 31 + 30;
			}
			if (month2 == 6)
			{
				nl1 = 31 + 29 + 31 + 30 + 31;
			}
			if (month2 == 7)
			{
				nl1 = 31 + 29 + 31 + 30 + 31 + 30;
			}
			if (month2 == 8)
			{
				nl1 = 31 + 29 + 31 + 30 + 31 + 30 + 31;
			}
			if (month2 == 9)
			{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


