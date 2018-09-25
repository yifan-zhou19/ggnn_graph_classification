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
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int y;
		int d;
		int m;
		int c;
		int b;
		int e;
		int f;
		int g;
		int h;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 d1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 y2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 m2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ");
	 if (tempVar6 != null)
	 {
		 d2 = Integer.parseInt(tempVar6);
	 }
	 int[] a = new int[13];
	 f = 0;
	 b = 0;
	 c = 0;
	 a[1] = 31;
	 a[3] = 31;
	 a[5] = 31;
	 a[7] = 31;
	 a[8] = 31;
	 a[10] = 31;
	 a[12] = 31;
	 a[4] = 30;
	 a[6] = 30;
	 a[9] = 30;
	 a[11] = 30;
	y = y1;
	m = 1;
	d = 1;
	if (y % 4 != 0)
	{
		a[2] = 28;
	}
	else if (y % 100 != 0)
	{
		a[2] = 29;
	}
	else if (y % 400 != 0)
	{
		a[2] = 28;
	}
	else
	{
		a[2] = 29;
	}
	while (m < m1)
	{
	b = b + a[m];
	m = m + 1;
	}
	while (d < d1)
	{
	b = b + 1;
	d = d + 1;
	}
	m = 1;
	d = 1;
	while (m < m2)
	{
	c = c + a[m];
	m = m + 1;
	}
	while (d < d2)
	{
	c = c + 1;
	d = d + 1;
	}
	f = c - b;
	y = y1;
	while (y < y2)
	{
	e = y + 1;
	if (m < 2)
	{
		if (y % 4 != 0)
		{
			g = 365;
		}
		else if (y % 100 != 0)
		{
			g = 366;
		}
		else if (y % 400 != 0)
		{
			g = 365;
		}
		else
		{
			g = 366;
		}
	}
	else if (e % 4 != 0)
	{
		g = 365;
	}
	else if (e % 100 != 0)
	{
		g = 366;
	}
	else if (e % 400 != 0)
	{
		g = 365;
	}
	else
	{
		g = 366;
	}
	y = y + 1;
	f = f + g;
	}
	System.out.printf("%d",f);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


