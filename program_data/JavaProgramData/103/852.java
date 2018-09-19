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
		int count = 1;
		int flag = 1;
		char a;
		char last = '0';
		while ((a = System.in.read()) != '\n')
		{
			flag = 1;
			if (last >= 'a' && last <= 'z')
			{
				if (a == last || a == last - 32)
				{
					count++;
					flag = 0;
				}
			}
			if (last >= 'A' && last <= 'Z')
			{
				if (a == last || a == last + 32)
				{
					count++;
					flag = 0;
				}
			}
			if (flag != 0)
			{
				if (last != '0')
				{
					System.out.print(count);
					System.out.print(")");
				}
				switch (a)
				{
				case 'a':
					System.out.print("(A,");
					break;
				case 'A':
					System.out.print("(A,");
					break;
				case 'b':
					System.out.print("(B,");
					break;
				case 'B':
					System.out.print("(B,");
					break;
				case 'c':
					System.out.print("(C,");
					break;
				case 'C':
					System.out.print("(C,");
					break;
				case 'd':
					System.out.print("(D,");
					break;
				case 'D':
					System.out.print("(D,");
					break;
				case 'e':
					System.out.print("(E,");
					break;
				case 'E':
					System.out.print("(E,");
					break;
				case 'f':
					System.out.print("(F,");
					break;
				case 'F':
					System.out.print("(F,");
					break;
				case 'g':
					System.out.print("(G,");
					break;
				case 'G':
					System.out.print("(G,");
					break;
				case 'h':
					System.out.print("(H,");
					break;
				case 'H':
					System.out.print("(H,");
					break;
				case 'i':
					System.out.print("(I,");
					break;
				case 'I':
					System.out.print("(I,");
					break;
				case 'j':
					System.out.print("(J,");
					break;
				case 'J':
					System.out.print("(J,");
					break;
				case 'k':
					System.out.print("(K,");
					break;
				case 'K':
					System.out.print("(K,");
					break;
				case 'l':
					System.out.print("(L,");
					break;
				case 'L':
					System.out.print("(L,");
					break;
				case 'm':
					System.out.print("(M,");
					break;
				case 'M':
					System.out.print("(M,");
					break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
