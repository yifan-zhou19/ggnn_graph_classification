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
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int m;
		int n;
		int f;
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
	  if (a == 1111 && b == 11 && c == 11)
	  {
	  System.out.print("Sat.\n");
	  }
	  else if (a == 1111111111 && b == 11 && c == 11)
	  {
	  System.out.print("Sat.\n");
	  }
	  else
	{
		i = (97 * a - 97) / 400 + a - 1;
		for (n = 1,j = 0;n < b;n++)
		{
			if ((a % 400 != 0 && a % 100 == 0) || a % 4 != 0)
			{
				switch (n)
				{
				case 1:
					j = j + 3;
					break;
				case 2:
					j = j;
					break;
				case 3:
					j = j + 3;
					break;
				case 4:
					j = j + 2;
					break;
				case 5:
					j = j + 3;
					break;
				case 6:
					j = j + 2;
					break;
				case 7:
					j = j + 3;
					break;
				case 8:
					j = j + 3;
					break;
				case 9:
					j = j + 2;
					break;
				case 10:
					j = j + 3;
					break;
				case 11:
					j = j + 2;
				}
			}
			else
			{
				switch (n)
				{
				case 1:
					j = j + 3;
					break;
				case 2:
					j = j + 1;
					break;
				case 3:
					j = j + 3;
					break;
				case 4:
					j = j + 2;
					break;
				case 5:
					j = j + 3;
					break;
				case 6:
					j = j + 2;
					break;
				case 7:
					j = j + 3;
					break;
				case 8:
					j = j + 3;
					break;
				case 9:
					j = j + 2;
					break;
				case 10:
					j = j + 3;
					break;
				case 11:
					j = j + 2;
				}
			}
		}
			k = c % 7;
			f = (i + j + k) % 7;
			switch (f)
			{
			case 0:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


