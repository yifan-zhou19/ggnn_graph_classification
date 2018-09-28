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
		int[] A = new int[4];
		int[] B = new int[4];
		int i;
		int j;
		int d;
		int d1;
		int[] d2 = new int[3];
		int d3;
		int d4;
		for (i = 1;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 1;i < 4;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				B[i] = Integer.parseInt(tempVar2);
			}
		}
		switch (A[2])
		{
			case 1:
				d2[1] = A[3];
				break;
			case 2:
				d2[1] = A[3] + 31;
				break;
			case 3:
				d2[1] = A[3] + 59;
				break;
			case 4:
				d2[1] = A[3] + 90;
				break;
			case 5:
				d2[1] = A[3] + 120;
				break;
			case 6:
				d2[1] = A[3] + 151;
				break;
			case 7:
				d2[1] = A[3] + 181;
				break;
			case 8:
				d2[1] = A[3] + 212;
				break;
			case 9:
				d2[1] = A[3] + 243;
				break;
			case 10:
				d2[1] = A[3] + 273;
				break;
			case 11:
				d2[1] = A[3] + 304;
				break;
			case 12:
				d2[1] = A[3] + 334;
				break;
		}
		if (A[1] % 4 == 0 && A[1] % 100 != 0 && A[2] > 2)
		{
			d2[1]++;
		}
		if (A[1] % 400 == 0 && A[2] > 2)
		{
			d2[1]++;
		}
		switch (B[2])
		{
			case 1:
				d2[2] = B[3];
				break;
			case 2:
				d2[2] = B[3] + 31;
				break;
			case 3:
				d2[2] = B[3] + 59;
				break;
			case 4:
				d2[2] = B[3] + 90;
				break;
			case 5:
				d2[2] = B[3] + 120;
				break;
			case 6:
				d2[2] = B[3] + 151;
				break;
			case 7:
				d2[2] = B[3] + 181;
				break;
			case 8:
				d2[2] = B[3] + 212;
				break;
			case 9 :
				d2[2] = B[3] + 243;
				break;
			case 10 :
				d2[2] = B[3] + 273;
				break;
			case 11 :
				d2[2] = B[3] + 304;
				break;
			case 12 :
				d2[2] = B[3] + 334;
				break;
		}
		if (B[1] % 4 == 0 && B[1] % 100 != 0 && B[2] > 2)
		{
			d2[2]++;
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


