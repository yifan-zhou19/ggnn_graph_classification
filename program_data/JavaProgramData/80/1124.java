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
		int m1;
		int d1;
		int s1;
		int y2;
		int m2;
		int d2;
		int s2;
		int i;
		int s = 0;
		int[] a = new int[5000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (i = y1;i <= y2;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				a[i] = 1;
			}
			else
			{
				a[i] = 0;
			}
		}
		switch (m1)
		{
		case 1:
			s1 = d1;
			break;
		case 2:
			s1 = 31 + d1;
			break;
		case 3:
			s1 = d1 + 31 + 28 + a[y1];
			break;
		case 4:
			s1 = d1 + 31 + 28 + 31 + a[y1];
			break;
		case 5:
			s1 = d1 + 31 + 28 + 31 + 30 + a[y1];
			break;
		case 6:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + a[y1];
			break;
		case 7:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + 30 + a[y1];
			break;
		case 8:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + a[y1];
			break;
		case 9:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + a[y1];
			break;
		case 10:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + a[y1];
			break;
		case 11:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + a[y1];
			break;
		case 12:
			s1 = d1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + a[y1];
			break;
		}
		switch (m2)
		{
		case 1:
			s2 = d2;
			break;
		case 2:
			s2 = 31 + d2;
			break;
		case 3:
			s2 = d2 + 31 + 28 + a[y2];
			break;
		case 4:
			s2 = d2 + 31 + 28 + 31 + a[y2];
			break;
		case 5:
			s2 = d2 + 31 + 28 + 31 + 30 + a[y2];
			break;
		case 6:
			s2 = d2 + 31 + 28 + 31 + 30 + 31 + a[y2];
			break;
		case 7:
			s2 = d2 + 31 + 28 + 31 + 30 + 31 + 30 + a[y2];
			break;
		case 8:
			s2 = d2 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + a[y2];
			break;
		case 9:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


