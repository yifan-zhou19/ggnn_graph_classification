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
		String a = new String(new char[501]);
		char x;
		char y;
		char z;
		char h;
		int n;
		int[] c = new int[501];
		int i;
		int m;
		int r;
		int max;
		int j;
		int t;
		int[] b = new int[501];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
	m = a.length();

	for (r = 0;r < m;r++)
	{
	b[r] = 0;
	}

		if (n == 2)
		{
			for (i = 0;i < m - 1;i++)
			{
				x = a.charAt(i);
				y = a.charAt(i + 1);
				c[i] = 0;
			for (j = 0;j < m - 1;j++)
			{
				if (a.charAt(j) == x && a.charAt(j + 1) == y)
				{
				c[i]++;
				b[j] = i;
				}
			}
			}
		}
	   else if (n == 3)
	   {
		   for (i = 0;i < m - 2;i++)
		   {
				x = a.charAt(i);
				y = a.charAt(i + 1);
				z = a.charAt(i + 2);
				c[i] = 0;
			for (j = 0;j < m - 1;j++)
			{
				if (a.charAt(j) == x && a.charAt(j + 1) == y && a.charAt(j + 2) == z)
				{
				c[i]++;
				b[j] = i;
				}
			}
		   }
	   }
	   else if (n == 4)
	   {
		   for (i = 0;i < m - 2;i++)
		   {
				x = a.charAt(i);
				y = a.charAt(i + 1);
				z = a.charAt(i + 2);
				h = a.charAt(i + 3);
				c[i] = 0;
			for (j = 0;j < m - 1;j++)
			{
				if (a.charAt(j) == a.charAt(i) && a.charAt(j + 1) == a.charAt(i + 1) && a.charAt(j + 2) == a.charAt(i + 2) && a.charAt(j + 3) == a.charAt(i + 3))
				{
				c[i]++;
				b[j] = i;
				}
			}
		   }
	   }


	max = 0;

		if (n == 2)
		{
				for (i = 0;i < m - 1;i++)
				{
				if (c[i] > max)
				{
				max = c[i];
				t = i;
				}
				}
				if (max == 1)
				{
					System.out.print("NO");
				}
				else
				{
				System.out.printf("%d\n",c[t]);
				for (i = 0;i < m - 1;i++)
				{
					if (c[i] == max && b[i] != 0)
					{
						System.out.printf("%c%c\n",a.charAt(i),a.charAt(i + 1));
						for (r = i + 1;r < m;r++)
						{
							if (b[r] == b[i])
							{
								b[r] = 0;
							}
						}
					}
				}
				}

		}
		else if (n == 3)
		{
				for (i = 0;i < m - 2;i++)
				{
				if (c[i] > max)
				{
				max = c[i];
				t = i;
				}
				}
				if (max == 1)
				{
					System.out.print("NO");
				}
				else
				{
				System.out.printf("%d\n",c[t]);

				for (i = 0;i < m - 2;i++)
				{
					if (c[i] == max && b[i] != 0)
					{
						System.out.printf("%c%c%c\n",a.charAt(i),a.charAt(i + 1),a.charAt(i + 2));
						for (r = i + 1;r < m;r++)
						{
							if (b[r] == b[i])
							{
								b[r] = 0;
							}
						}
					}
				}
				}

		}
		  else if (n == 4)
			  {
				  for (i = 0;i < m - 3;i++)
				  {
				if (c[i] > max)
				{
				max = c[i];
				t = i;
				}
				  }
				if (max == 1)
				{
					System.out.print("NO");
				}
				else
				{
				System.out.printf("%d\n",c[t]);
				for (i = 0;i < m - 3;i++)
				{
					if (c[i] == max && b[i] != 0)
					{
						System.out.printf("%c%c%c%c\n",a.charAt(i),a.charAt(i + 1),a.charAt(i + 2),a.charAt(i + 3));
						for (r = i + 1;r < m;r++)
						{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


