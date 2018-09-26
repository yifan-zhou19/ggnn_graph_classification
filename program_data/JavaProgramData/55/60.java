//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int chf(int x,int y)
	{
		int j;
		int z;
		for (z = 1,j = 0;j < y;j++)
		{
			z = z * x;
		}
		return z;
	}

	public static void Main(String[] args)
	{
		String c1 = new String(new char[50]);
		int a1;
		int a2;
		int i;
		int l;
		int k;
		int sh = 0;
		int count = 0;
		int[] b = new int[50];
		int[] d = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a2 = Integer.parseInt(tempVar3);
		}
		l = c1.length();
		for (i = 0;i < l;i++)
		{
			if (c1.charAt(i) == '0')
			{
				b[i] = 0;
			}
			if (c1.charAt(i) == '1')
			{
				b[i] = 1;
			}
			if (c1.charAt(i) == '2')
			{
				b[i] = 2;
			}
			if (c1.charAt(i) == '3')
			{
				b[i] = 3;
			}
			if (c1.charAt(i) == '4')
			{
				b[i] = 4;
			}
			if (c1.charAt(i) == '5')
			{
				b[i] = 5;
			}
			if (c1.charAt(i) == '6')
			{
				b[i] = 6;
			}
			if (c1.charAt(i) == '7')
			{
				b[i] = 7;
			}
			if (c1.charAt(i) == '8')
			{
				b[i] = 8;
			}
			if (c1.charAt(i) == '9')
			{
				b[i] = 9;
			}
			if (c1.charAt(i) == 'a' || c1.charAt(i) == 'A')
			{
				b[i] = 10;
			}
			if (c1.charAt(i) == 'b' || c1.charAt(i) == 'B')
			{
				b[i] = 11;
			}
			if (c1.charAt(i) == 'c' || c1.charAt(i) == 'C')
			{
				b[i] = 12;
			}
			if (c1.charAt(i) == 'd' || c1.charAt(i) == 'D')
			{
				b[i] = 13;
			}
			if (c1.charAt(i) == 'e' || c1.charAt(i) == 'E')
			{
				b[i] = 14;
			}
			if (c1.charAt(i) == 'f' || c1.charAt(i) == 'F')
			{
				b[i] = 15;
			}
			if (c1.charAt(i) == 'g' || c1.charAt(i) == 'G')
			{
				b[i] = 16;
			}
			if (c1.charAt(i) == 'h' || c1.charAt(i) == 'H')
			{
				b[i] = 17;
			}
			if (c1.charAt(i) == 'i' || c1.charAt(i) == 'I')
			{
				b[i] = 18;
			}
			if (c1.charAt(i) == 'j' || c1.charAt(i) == 'J')
			{
				b[i] = 19;
			}
			if (c1.charAt(i) == 'k' || c1.charAt(i) == 'K')
			{
				b[i] = 20;
			}
			if (c1.charAt(i) == 'l' || c1.charAt(i) == 'L')
			{
				b[i] = 21;
			}
			if (c1.charAt(i) == 'm' || c1.charAt(i) == 'M')
			{
				b[i] = 22;
			}
			if (c1.charAt(i) == 'n' || c1.charAt(i) == 'N')
			{
				b[i] = 23;
			}
			if (c1.charAt(i) == 'o' || c1.charAt(i) == 'O')
			{
				b[i] = 24;
			}


		}
		for (i = 0;i < l;i++)
		{
			  sh = sh + b[i] * chf(a1, l - 1 - i);
		}
		if (sh == 0)
		{
			System.out.print("0");
		}
		for (i = 0;;i++)
		{
			d[i] = sh % a2;
			sh = sh / a2;
			count++;
			if (sh < a2)
			{

				d[i + 1] = sh;
				break;
			}
		}
		for (k = i + 1;k >= 0;k--)
		{
			if (d[k] == 17)
			{
				System.out.print("H");
			}
			if (d[k] == 16)
			{
				System.out.print("G");
			}
			if (d[k] == 15)
			{
				System.out.print("F");
			}
			if (d[k] == 14)
			{
				System.out.print("E");
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


