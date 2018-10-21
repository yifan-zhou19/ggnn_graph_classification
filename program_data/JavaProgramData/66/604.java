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
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		int sum = 1;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p = 0;
		for (m = 1;m <= 400;m++)
		{
			if ((m % 4 == 0 && m % 100 != 0) || (m % 100 == 0 && m % 400 == 0))
			{
			p += 2;
			}
			else
			{
			p++;
			}
		}
		sum = (i - 1) / 400 * p + 1;
		q = (i - 1) % 400 + 1;
		for (m = 1;m < q;m++)
		{
			if ((m % 4 == 0 && m % 100 != 0) || (m % 100 == 0 && m % 400 == 0))
			{
			sum = sum + 2;
			}
			else
			{
			sum = sum + 1;
			}
		}
		n = (sum - 1) % 7 + 1;
		if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0))
		{
			if (j == 1)
			{
			l = (k - 1) % 7;
			}
			if (j == 2)
			{
			l = (31 + k - 1) % 7;
			}
			if (j == 3)
			{
			l = (60 + k - 1) % 7;
			}
			if (j == 4)
			{
			l = (91 + k - 1) % 7;
			}
			if (j == 5)
			{
			l = (121 + k - 1) % 7;
			}
			if (j == 6)
			{
			l = (152 + k - 1) % 7;
			}
			if (j == 7)
			{
			l = (182 + k - 1) % 7;
			}
			if (j == 8)
			{
			l = (213 + k - 1) % 7;
			}
			if (j == 9)
			{
			l = (244 + k - 1) % 7;
			}
			if (j == 10)
			{
			l = (274 + k - 1) % 7;
			}
			if (j == 11)
			{
			l = (305 + k - 1) % 7;
			}
			if (j == 12)
			{
			l = (335 + k - 1) % 7;
			}
		}
		else
		{
			if (j == 1)
			{
			l = (k - 1) % 7;
			}
			if (j == 2)
			{
			l = (31 + k - 1) % 7;
			}
			if (j == 3)
			{
			l = (59 + k - 1) % 7;
			}
			if (j == 4)
			{
			l = (90 + k - 1) % 7;
			}
			if (j == 5)
			{
			l = (120 + k - 1) % 7;
			}
			if (j == 6)
			{
			l = (151 + k - 1) % 7;
			}
			if (j == 7)
			{
			l = (181 + k - 1) % 7;
			}
			if (j == 8)
			{
			l = (212 + k - 1) % 7;
			}
			if (j == 9)
			{
			l = (243 + k - 1) % 7;
			}
			if (j == 10)
			{
			l = (273 + k - 1) % 7;
			}
			if (j == 11)
			{
			l = (304 + k - 1) % 7;
			}
			if (j == 12)
			{
			l = (334 + k - 1) % 7;
			}
		}
			l = l + n;
			if (l == 1)
			{
			System.out.print("Mon.");
			}
			if (l == 2)
			{
			System.out.print("Tue.");
			}
			if (l == 3)
			{
			System.out.print("Wed.");
			}
			if (l == 4)
			{
			System.out.print("Thu.");
			}
			if (l == 5)
			{
			System.out.print("Fri.");
			}
			if (l == 6)
			{
			System.out.print("Sat.");
			}
			if (l == 7)
			{
			System.out.print("Sun.");
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


