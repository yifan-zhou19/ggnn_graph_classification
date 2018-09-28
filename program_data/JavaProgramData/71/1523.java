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
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int[] month11 = new int[200];
		int[] month22 = new int[200];
		int n;
		int i;
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
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (year[i] % 4 == 0 && year[i] % 100 != 0)
			{
				switch (month1[i])
				{
				case 1:
					month11[i] = 0;
					break;
				case 2:
					month11[i] = 0 + 31;
					break;
				case 3:
					month11[i] = 0 + 31 + 29;
					break;
				case 4:
					month11[i] = 0 + 31 + 29 + 31;
					break;
				case 5:
					month11[i] = 0 + 31 + 29 + 31 + 30;
					break;
				case 6:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31;
					break;
				case 7:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30;
					break;
				case 8:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31;
					break;
				case 9:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
					break;
				case 10:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
					break;
				case 11:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
					break;
				case 12:
					month11[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
					break;
				}
				switch (month2[i])
				{
				case 1:
					month22[i] = 0;
					break;
				case 2:
					month22[i] = 0 + 31;
					break;
				case 3:
					month22[i] = 0 + 31 + 29;
					break;
				case 4:
					month22[i] = 0 + 31 + 29 + 31;
					break;
				case 5:
					month22[i] = 0 + 31 + 29 + 31 + 30;
					break;
				case 6:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31;
					break;
				case 7:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30;
					break;
				case 8:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31;
					break;
				case 9:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
					break;
				case 10:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
					break;
				case 11:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
					break;
				case 12:
					month22[i] = 0 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
					break;
				}
				if ((month11[i] - month22[i]) % 7 == 0)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


