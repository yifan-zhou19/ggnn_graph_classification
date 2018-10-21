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
		int i;
		int zhen;
		int chu;
		int result;
		int x = 0;
		String n = new String(new char[32]);
		String m = new String(new char[32]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		result = n.length();

		for (i = 0;i < result;i++)
		{
			switch (n.charAt(i))
			{
			case '0':
				zhen = 0;
				break;
			case '1':
				zhen = 1;
				break;
			case '2':
				zhen = 2;
				break;
					  case '3':
						  zhen = 3;
						  break;
			case '4':
				zhen = 4;
				break;
			case '5':
				zhen = 5;
				break;
			case '6':
				zhen = 6;
				break;
			case '7':
				zhen = 7;
				break;
			case '8':
				zhen = 8;
				break;
			case '9':
				zhen = 9;
				break;
			case 'a':
			case 'A':
				zhen = 10;
				break;
			case 'b':
			case 'B':
				zhen = 11;
				break;
			case 'c':
			case 'C':
				zhen = 12;
				break;
			case 'd':
			case 'D':
				zhen = 13;
				break;
			case 'e':
			case 'E':
				zhen = 14;
				break;
			case 'f':
			case 'F':
				zhen = 15;
				break;
			}
			x += zhen * Math.pow(a,result - 1 - i);
		}
		for (i = 0;x > 0;i++)
		{
			chu = x % b;
			x = x / b;
			switch (chu)
			{
			case 0:
				m = tangible.StringFunctions.changeCharacter(m, i, '0');
				break;
			case 1:
				m = tangible.StringFunctions.changeCharacter(m, i, '1');
				break;
			case 2:
				m = tangible.StringFunctions.changeCharacter(m, i, '2');
				break;
			case 3:
				m = tangible.StringFunctions.changeCharacter(m, i, '3');
				break;
			case 4:
				m = tangible.StringFunctions.changeCharacter(m, i, '4');
				break;
			case 5:
				m = tangible.StringFunctions.changeCharacter(m, i, '5');

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


