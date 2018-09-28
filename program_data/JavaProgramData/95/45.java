//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'a', so pointers on this parameter are left unchanged:
	public static int lwr(char * a)
	{
		for (; * a != '\0';a++)
		{

			switch (*a)
			{
			case 'A':
				*a = 'a';
				break;
			case 'B':
				*a = 'b';
				break;
			case 'C':
				*a = 'c';
				break;
			case 'D':
				*a = 'd';
				break;
			case 'E':
				*a = 'e';
				break;
			case 'F':
				*a = 'f';
				break;
			case 'G':
				*a = 'g';
				break;
			case 'H':
				*a = 'h';
				break;
			case 'I':
				*a = 'i';
				break;
			case 'J':
				*a = 'j';
				break;
			case 'K':
				*a = 'k';
				break;
			case 'L':
				*a = 'l';
				break;
			case 'M':
				*a = 'm';
				break;
			case 'N':
				*a = 'n';
				break;
			case 'O':
				*a = 'o';
				break;
			case 'P':
				*a = 'p';
				break;
			case 'Q':
				*a = 'q';
				break;
			case 'R':
				*a = 'r';
				break;
			case 'S':
				*a = 's';
				break;
			case 'T':
				*a = 't';
				break;
			case 'U':
				*a = 'u';
				break;
			case 'V':
				*a = 'v';
				break;
			case 'W':
				*a = 'w';
				break;
			case 'X':
				*a = 'x';
				break;
			case 'Y':
				*a = 'y';
				break;
			case 'Z':
				*a = 'z';
				break;
			}
		}
		return 0;
	}

	public static void Main(String[] args)
	{
		String str1 = new String(new char[82]);
		String str2 = new String(new char[82]);
		char chu;
		int a;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		lwr(str1);
		lwr(str2);
		a = strcmp(str1,str2);
		if (a > 0)
		{
			chu = '>';
		}
		else if (a < 0)
		{
			chu = '<';
		}
		else
		{
			chu = '=';
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
