//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static char chufa1(char a, char b)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned char n,d;
		byte n;
		byte d;
		n = 10 * a + b;
		d = n / 13;
		return (d);
	}
	public static char chufa2(char a, char b)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned char n,e;
		byte n;
		byte e;
		n = 10 * a + b;
		e = n % 13;
		return (e);
	}
	public static char chufa3(char a, char b, char c)
	{
		char n;
		char d;
		n = 100 * a + 10 * b + c;
		d = n / 13;
		return (d);
	}
	public static char chufa4(char a, char b, char c)
	{
		char n;
		char e;
		n = 100 * a + 10 * b + c;
		e = n % 13;
		return (e);
	}

	public static int Main()
	{
		String a = new String(new char[100]);
		char d;
		char e;
		char f;
		char g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i = 0;
		int j = 0;
		int k = 0;
		j = a.length();
		if (j == 1 || (j == 2 && a.charAt(0) == '1' && (a.charAt(1) == '0' || a.charAt(1) == '1' || a.charAt(1) == '2')))
		{
			System.out.printf("0\n%s",a);
			System.in.read();
			System.in.read();
			return 0;
		}
		for (i = 0;i < j;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
		}

		if (a.charAt(0) == 1 && a.charAt(1) < 3)
		{
			k = 1;
			d = chufa3(a.charAt(0), a.charAt(1), a.charAt(2));
			e = chufa4(a.charAt(0), a.charAt(1), a.charAt(2));
			a = tangible.StringFunctions.changeCharacter(a, 1, d);
			a = tangible.StringFunctions.changeCharacter(a, 2, e);
			i++;
			for (i = 2;i < j - 1;)
			{
				if (a.charAt(i) > 1 || (a.charAt(i + 1) > 2 && a.charAt(i) == 1))
				{
					 d = chufa1(a.charAt(i), a.charAt(i + 1));
					 e = chufa2(a.charAt(i), a.charAt(i + 1));
					 a = tangible.StringFunctions.changeCharacter(a, i, d);
					 a = tangible.StringFunctions.changeCharacter(a, i + 1, e);
					 i++;
				}
				else
				{
					 if (i + 2 == j)
					 {
					 break;
					 }
					 d = chufa3(a.charAt(i), a.charAt(i + 1), a.charAt(i + 2));
					 e = chufa4(a.charAt(i), a.charAt(i + 1), a.charAt(i + 2));
					 a = a.substring(0, i);
					 a = tangible.StringFunctions.changeCharacter(a, i + 1, d);
					 a = tangible.StringFunctions.changeCharacter(a, i + 2, e);
					 i = i + 2;
				}
				d = 0;
				e = 0;
			}
		}
		else
		{
		for (i = 0;i < j - 1;)
		{
			if (a.charAt(i) > 1 || (a.charAt(i + 1) > 2 && a.charAt(i) == 1))
			{
				d = chufa1(a.charAt(i), a.charAt(i + 1));
				e = chufa2(a.charAt(i), a.charAt(i + 1));
				a = tangible.StringFunctions.changeCharacter(a, i, d);
				a = tangible.StringFunctions.changeCharacter(a, i + 1, e);
				i++;
			}
			else
			{
				 if (i + 2 == j)
				 {
				 break;
				 }
				 d = chufa3(a.charAt(i), a.charAt(i + 1), a.charAt(i + 2));
				 e = chufa4(a.charAt(i), a.charAt(i + 1), a.charAt(i + 2));
				 a = a.substring(0, i);
				 a = tangible.StringFunctions.changeCharacter(a, i + 1, d);
				 a = tangible.StringFunctions.changeCharacter(a, i + 2, e);
				 i = i + 2;
			}
			d = 0;
			e = 0;
		}
		}
		if (k == 0)
		{
			for (i = 0;i < j - 1;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + '0');
				System.out.printf("%c",a.charAt(i));
			}
			if (a.charAt(i) < 10)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + '0');
				System.out.printf("\n%c",a.charAt(i));
			}
			else
			{
				f = a.charAt(i) / 10;
				g = a.charAt(i) % 10;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


