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
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		int j;
		int k;
		int l1;
		int l2;
		int d;
		int x;
		int[] c = new int[500];
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		if (l1 > l2)
		{
			for (i = 0;i < l1;i++)
			{
			c[i] = 0;
			}
		 for (i = 1;i <= l2;i++)
		 {
			n1 = l1 - i;
			n2 = l2 - i;
			d = a.charAt(n1) - '0';
			x = b.charAt(n2) - '0';
			if (d + x + a.charAt(n1) < 10)
			{
				c[n1] = c[n1] + d + x;
			}
			else
			{
				c[n1 - 1] = c[n1 - 1] + 1;
				c[n1] = c[n1] + d + x - 10;
			}
		 }
		 for (i = l1 - l2 - 1;i > 0;i--)
		 {
			 d = a.charAt(i) - '0';
			 c[i] = c[i] + d;
			 if (c[i] == 10)
			 {
				 c[i] = 0;
				 c[i - 1] = c[i - 1] + 1;
			 }
		 }
		  d = a.charAt(0) - '0';
		  x = c[0] - '0';
			if (d + x + a.charAt(0) < 10)
			{
				   c[0] = c[0] + d;
				for (j = 0;j < l1;j++)
				{
					if (c[j] != 0)
					{
						k = j;
						break;
					}
				}
				for (j = k;j < l1;j++)
				{
					System.out.printf("%d",c[j]);
				}
				System.out.print("\n");
			}
			else
			{
				c[0] = 0;
				System.out.print("1");
				for (j = 0;j < l1;j++)
				{
					if (c[j] != 0)
					{
						k = j;
						break;
					}
				}
				for (j = k;j < l1;j++)
				{
					System.out.printf("%d",c[j]);
				}
				System.out.print("\n");
			}

		}
	if (l1 < l2)
	{
			for (i = 0;i < l2;i++)
			{
			c[i] = 0;
			}
		 for (i = 1;i <= l1;i++)
		 {
			n1 = l1 - i;
			n2 = l2 - i;
			d = a.charAt(n1) - '0';
			x = b.charAt(n2) - '0';
			if (d + x + c[n2] < 10)
			{
				c[n2] = c[n2] + d + x;
			}
			else
			{
				c[n2 - 1] = c[n2 - 1] + 1;
				c[n2] = c[n2] + d + x - 10;
			}
		 }
		 for (i = l2 - l1 - 1;i > 0;i--)
		 {
			 d = b.charAt(i) - '0';
			 c[i] = c[i] + d;
			 if (c[i] == 10)
			 {
				 c[i] = 0;
				 c[i - 1] = c[i - 1] + 1;
			 }
		 }
		  d = b.charAt(0) - '0';
		  x = c[0] - '0';
			if (d + x + c[0] < 10)
			{
				   c[0] = c[0] + d;
				for (j = 0;j < l2;j++)
				{
					if (c[j] != 0)
					{
						k = j;
						break;
					}
				}
				for (j = k;j < l2;j++)
				{
					System.out.printf("%d",c[j]);
				}
			}
			else
			{
				c[0] = 0;
				System.out.print("1");
				for (j = 0;j < l2;j++)
				{
					if (c[j] != 0)
					{
						k = j;
						break;
					}
				}
				for (j = k;j < l2;j++)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


