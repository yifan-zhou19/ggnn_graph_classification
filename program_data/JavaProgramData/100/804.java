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
		String b = new String(new char[300]);
	int l;
	int i;
	int[] a = new int[26];
	int p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b = tempVar.charAt(0);
	}
	l = b.length();
	for (i = 0;i < l;i++)
	{
	switch (b.charAt(i))
	{
	case 'a':
		a[0]++;
		break;
	case 'b':
		a[1]++;
		break;
	case 'c':
		a[2]++;
		break;
	case 'd':
		a[3]++;
		break;
	case 'e':
		a[4]++;
		break;
	case 'f':
		a[5]++;
		break;
	case 'g':
		a[6]++;
		break;
	case 'h':
		a[7]++;
		break;
	case 'i':
		a[8]++;
		break;
	case 'j':
		a[9]++;
		break;
	case 'k':
		a[10]++;
		break;
	case 'l':
		a[11]++;
		break;
	case 'm':
		a[12]++;
		break;
	case 'n':
		a[13]++;
		break;
	case 'o':
		a[14]++;
		break;
	case 'p':
		a[15]++;
		break;
	case 'q':
		a[16]++;
		break;
	case 'r':
		a[17]++;
		break;
	case 's':
		a[18]++;
		break;
	case 't':
		a[19]++;
		break;
	case 'u':
		a[20]++;
		break;
	case 'v':
		a[21]++;
		break;
	case 'w':
		a[22]++;
		break;
	case 'x':
		a[23]++;
		break;
	case 'y':
		a[24]++;
		break;
	case 'z':
		a[25]++;
		break;
	}
	}
	for (i = 0;i < 26;i++)
	{
	if (a[i] != 0)
	{
		p = 1;
	}
	}
	if (p == 0)
	{
		System.out.print("No");
	}

	if (p == 1)
	{
	if (a[0] != 0)
	{
		System.out.printf("a=%d\n",a[0]);
	}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


