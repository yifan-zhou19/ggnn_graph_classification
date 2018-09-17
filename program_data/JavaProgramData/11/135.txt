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
	int y;
	int m;
	int d;
	int[] f = new int[22];
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
	f[0] = 31 + d;
	f[1] = 60 + d;
	f[2] = 91 + d;
	f[3] = 121 + d;
	f[4] = 152 + d;
	f[5] = 182 + d;
	f[6] = 213 + d;
	f[7] = 244 + d;
	f[8] = 274 + d;
	f[9] = 305 + d;
	f[10] = 335 + d;
	f[11] = 31 + d;
	f[12] = 59 + d;
	f[13] = 90 + d;
	f[14] = 120 + d;
	f[15] = 151 + d;
	f[16] = 181 + d;
	f[17] = 212 + d;
	f[18] = 243 + d;
	f[19] = 273 + d;
	f[20] = 304 + d;
	f[21] = 334 + d;
	if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
	{
		switch (m)
		{
	case 1:
		System.out.printf("%d",d);
		break;
	case 2:
		System.out.printf("%d",f[0]);
		break;
	case 3:
		System.out.printf("%d",f[1]);
		break;
	case 4:
		System.out.printf("%d",f[2]);
		break;
	case 5:
		System.out.printf("%d",f[3]);
		break;
	case 6:
		System.out.printf("%d",f[4]);
		break;
	case 7:
		System.out.printf("%d",f[5]);
		break;
	case 8:
		System.out.printf("%d",f[6]);
		break;
	case 9:
		System.out.printf("%d",f[7]);
		break;
	case 10:
		System.out.printf("%d",f[8]);
		break;
	case 11:
		System.out.printf("%d",f[9]);
		break;
	case 12:
		System.out.printf("%d",f[10]);
		break;
		}
	}
	else
	{
		switch (m)
		{
	case 1:
		System.out.printf("%d",d);
		break;
	case 2:
		System.out.printf("%d",f[11]);
		break;
	case 3:
		System.out.printf("%d",f[12]);
		break;
	case 4:
		System.out.printf("%d",f[13]);
		break;
	case 5:
		System.out.printf("%d",f[14]);
		break;
	case 6:
		System.out.printf("%d",f[15]);
		break;
	case 7:
		System.out.printf("%d",f[16]);
		break;
	case 8:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


