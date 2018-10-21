//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static char change(char a)
	{
		char x;
		switch (a)
		{
		case 'A':
			x = 'a';
			break;
		case 'B':
			x = 'b';
			break;
		case 'C':
			x = 'c';
			break;
		case 'D':
			x = 'd';
			break;
		case 'E':
			x = 'e';
			break;
		case 'F':
			x = 'f';
			break;
		case 'G':
			x = 'g';
			break;
		case 'H':
			x = 'h';
			break;
		case 'I':
			x = 'i';
			break;
		case 'J':
			x = 'j';
			break;
		case 'K':
			x = 'k';
			break;
		case 'L':
			x = 'l';
			break;
		case 'M':
			x = 'm';
			break;
		case 'N':
			x = 'n';
			break;
		case 'O':
			x = 'o';
			break;
		case 'P':
			x = 'p';
			break;
		case 'Q':
			x = 'q';
			break;
		case 'R':
			x = 'r';
			break;
		case 'S':
			x = 's';
			break;
		case 'T':
			x = 't';
			break;
		case 'U':
			x = 'u';
			break;
		case 'V':
			x = 'v';
			break;
		case 'W':
			x = 'w';
			break;
		case 'X':
			x = 'x';
			break;
		case 'Y':
			x = 'y';
			break;
		case 'Z':
			x = 'z';
			break;
		}
		return x;
	}
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		String p = new String(new char[100]);
		String q = new String(new char[100]);
		int i;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			p = tangible.StringFunctions.changeCharacter(p, i, change(s.charAt(i)));
		}
		p = tangible.StringFunctions.changeCharacter(p, i - 1, '\0');
		for (i = 0;t.charAt(i) != '\0';i++)
		{
			q = tangible.StringFunctions.changeCharacter(q, i, change(t.charAt(i)));
		}
		q = tangible.StringFunctions.changeCharacter(q, i - 1, '\0');
		if (strcmp(p,q) < 0)
		{
			System.out.print("<");
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


