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
		int m;
		int j = 0;
		int c = 0;
		int d = 0;
		int k = 0;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		String x = new String(new char[100]);
		if (s.charAt(0) != 0)
		{
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == '9')
				{
				s = tangible.StringFunctions.changeCharacter(s, i, 9);
				}
			else if (s.charAt(i) == '8')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 8);
			}
			else if (s.charAt(i) == '7')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 7);
			}
			else if (s.charAt(i) == '6')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 6);
			}
			else if (s.charAt(i) == '5')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 5);
			}
			else if (s.charAt(i) == '4')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 4);
			}
			else if (s.charAt(i) == '3')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 3);
			}
			else if (s.charAt(i) == '2')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 2);
			}
			else if (s.charAt(i) == '1')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 1);
			}
			else if (s.charAt(i) == '0')
			{
				s = s.substring(0, i);
			}
			else if (s.charAt(i) == 'A' || s.charAt(i) == 'a')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 10);
			}
			else if (s.charAt(i) == 'B' || s.charAt(i) == 'b')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 11);
			}
			else if (s.charAt(i) == 'C' || s.charAt(i) == 'c')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 12);
			}
			else if (s.charAt(i) == 'D' || s.charAt(i) == 'd')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 13);
			}
			else if (s.charAt(i) == 'E' || s.charAt(i) == 'e')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 14);
			}
			else if (s.charAt(i) == 'F' || s.charAt(i) == 'f')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 15);
			}
			else if (s.charAt(i) == 'G' || s.charAt(i) == 'g')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 16);
			}
			else if (s.charAt(i) == 'H' || s.charAt(i) == 'h')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 17);
			}
			else if (s.charAt(i) == 'I' || s.charAt(i) == 'i')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 18);
			}
			else if (s.charAt(i) == 'J' || s.charAt(i) == 'j')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 19);
			}
			else if (s.charAt(i) == 'K' || s.charAt(i) == 'k')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 20);
			}
			else if (s.charAt(i) == 'L' || s.charAt(i) == 'l')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 21);
			}
			else if (s.charAt(i) == 'M' || s.charAt(i) == 'm')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 22);
			}
			else if (s.charAt(i) == 'N' || s.charAt(i) == 'n')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 23);
			}
			else if (s.charAt(i) == 'O' || s.charAt(i) == 'o')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 24);
			}
			else if (s.charAt(i) == 'P' || s.charAt(i) == 'p')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 25);
			}
			else if (s.charAt(i) == 'Q' || s.charAt(i) == 'q')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 26);
			}
			else if (s.charAt(i) == 'R' || s.charAt(i) == 'r')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 27);
			}
			else if (s.charAt(i) == 'S' || s.charAt(i) == 's')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 28);
			}
			else if (s.charAt(i) == 'T' || s.charAt(i) == 't')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 29);
			}
			else if (s.charAt(i) == 'U' || s.charAt(i) == 'u')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 30);
			}
			else if (s.charAt(i) == 'V' || s.charAt(i) == 'v')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 31);
			}
			else if (s.charAt(i) == 'W' || s.charAt(i) == 'w')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 32);
			}
			else if (s.charAt(i) == 'X' || s.charAt(i) == 'w')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 33);
			}
			else if (s.charAt(i) == 'Y' || s.charAt(i) == 'y')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 34);
			}
			else if (s.charAt(i) == 'Z' || s.charAt(i) == 'z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 35);
			}
			j++;
			}
		for (i = 0;i < j;i++)
		{
			m = Math.pow(a,j - i - 1);
			c = s.charAt(i) * m;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


