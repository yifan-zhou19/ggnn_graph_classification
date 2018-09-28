//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len1;
		int len2;
		int t;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < 100;i++)
			{
				a[i] = b[i] = 0;
				c = tangible.StringFunctions.changeCharacter(c, i, d[i] = '\0');
			}
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 c = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 d = tempVar3.charAt(0);
			 }
			len1 = c.length();
			len2 = d.length();
			for (i = 99;i > 99 - len1;i--)
			{
				switch (c.charAt(i + len1 - 100))
				{
				case'0':
				a[i] = 0;
				break;
				case'1':
				a[i] = 1;
				break;
				case'2':
				a[i] = 2;
				break;
				case'3':
				a[i] = 3;
				break;
				case'4':
				a[i] = 4;
				break;
				case'5':
				a[i] = 5;
				break;
				case'6':
				a[i] = 6;
				break;
				case'7':
				a[i] = 7;
				break;
				case'8':
				a[i] = 8;
				break;
				case'9':
				a[i] = 9;
				}
			}

			for (i = 99;i > 99 - len2;i--)
			{
				switch (d.charAt(i + len2 - 100))
				{
				case'0':
				b[i] = 0;
				break;
				case'1':
				b[i] = 1;
				break;
				case'2':
				b[i] = 2;
				break;
				case'3':
				b[i] = 3;
				break;
				case'4':
				b[i] = 4;
				break;
				case'5':
				b[i] = 5;
				break;
				case'6':
				b[i] = 6;
				break;
				case'7':
				b[i] = 7;
				break;
				case'8':
				b[i] = 8;
				break;
				case'9':
				b[i] = 9;
				}
			}

			for (i = 0;i < 100;i++)
			{
				a[i] = a[i] - b[i];
			}

			for (i = 99;i > 0;i--)
			{
				if (a[i] < 0)
				{
					a[i] = 10 + a[i];
					a[i - 1]--;
				}
			}
			 for (i = 0;;i++)
			 {
				 if (a[i] != 0)
				 {
					 break;
				 }
			 }

			for (t = i;t < 100;t++)
			{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


