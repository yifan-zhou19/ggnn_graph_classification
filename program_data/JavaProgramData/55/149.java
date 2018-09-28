//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int i;
		int j;
		int c = 0; //c????n???
		String n = new String(new char[20]);
		int num = 0; //10????????

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

		int k; //k??????(??a????????)

		//????n???
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			c++;
		}

		//???n???10???
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			k = 1;
			for (j = c - i - 1;j > 0;j--)
			{
				k *= a;
			}

			switch (n.charAt(i))
			{
			case 'a':
				num += 10 * k;
				break;
			case 'A':
				num += 10 * k;
				break;
			case 'b':
				num += 11 * k;
				break;
			case 'B':
				num += 11 * k;
				break;
			case 'c':
				num += k * 12;
				break;
			case 'C':
				num += k * 12;
				break;
			case 'd':
				num += k * 13;
				break;
			case 'D':
				num += k * 13;
				break;
			case 'e':
				num += k * 14;
				break;
			case 'E':
				num += k * 14;
				break;
			case 'f':
				num += k * 15;
				break;
			case 'F':
				num += k * 15;
				break;
			case 'g':
				num += k * 16;
				break;
			case 'G':
				num += k * 16;
				break;
			case 'h':
				num += k * 17;
				break;
			case 'H':
				num += k * 17;
				break;
			case 'i':
				num += k * 18;
				break;
			case 'I':
				num += k * 18;
				break;
			case 'j':
				num += k * 19;
				break;
			case 'J':
				num += k * 19;
				break;
			case 'k':
				num += k * 20;
				break;
			case 'K':
				num += k * 20;
				break;
			case 'l':
				num += k * 21;
				break;
			case 'L':
				num += k * 21;
				break;
			case 'm':

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


