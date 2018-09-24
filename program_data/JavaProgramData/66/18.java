//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_d = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_d = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_d = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}

		int i;
		int sum = 0;

		if (a < 400)
		{
			for (i = 1;i < a;i++)
			{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
			}

	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int d[13]={0,31,0,31,30,31,30,31,31,30,31,30,31};
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			Main_d[2] = 29;
		}
		else
		{
			Main_d[2] = 28;
		}

		for (i = 1;i < b;i++)
		{
			sum += Main_d[i];
		}

		sum += c;

		int e;
		e = sum % 7;

		switch (e)
		{
		case 0:
			System.out.print("Sun.\n");
		break;
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
		}
		}

		if (a % 400 == 0)
		{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int d[13]={0,31,29,31,30,31,30,31,31,30,31,30,31};
		for (i = 1;i < b;i++)
		{
			sum += Main_d[i];
		}

		sum += c;
		sum += 5;

		int e;
		e = sum % 7;

		switch (e)
		{
		case 0:
			System.out.print("Sun.\n");
		break;
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
		}
		}


		if (a % 400 != 0 && a > 400)
		{
			while (a > 400)
			{
				a -= 400;
			}
			for (i = 1;i < a;i++)
			{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
			}

	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int d[13]={0,31,0,31,30,31,30,31,31,30,31,30,31};
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			Main_d[2] = 29;
		}
		else
		{
			Main_d[2] = 28;
		}

		for (i = 1;i < b;i++)
		{
			sum += Main_d[i];
		}


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


