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
		int z;
		int q;
		int s;
		int l;
		int a;
		int b;
		int c;
		int d;
		char A;
		char B;
		char C;
		char D;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if (z + q == s + l)
						{
							if (z + l > s + q && z + s < q)
							{
								a = z;
								if (a < q)
								{
									b = a;
									a = q;
								}
								else
								{
									b = q;
								}
								if (a < s)
								{
									c = b;
									b = a;
									a = s;
								}
								else
								{
									if (b < s)
									{
										c = b;
										b = s;
									}
									else
									{
										c = s;
									}
								}
								if (a < l)
								{
									d = c;
									c = b;
									b = a;
									a = l;
								}
								else
								{
									if (b < l)
									{
										d = c;
										c = b;
										b = l;
									}
									else
									{
										if (c < l)
										{
											d = c;
											c = l;
										}
										else
										{
											d = l;
										}
									}
								}
								if (a != b && b != c && c != d && a != c && a != d && b != d)
								{
									if (z == a)
									{
										A = 'z';
									}
									if (z == b)
									{
										B = 'z';
									}
									if (z == c)
									{
										C = 'z';
									}
									if (z == d)
									{
										D = 'z';
									}
									if (q == a)
									{
										A = 'q';
									}
									if (q == b)
									{
										B = 'q';
									}
									if (q == c)
									{
										C = 'q';
									}
									if (q == d)
									{
										D = 'q';
									}
									if (s == a)
									{
										A = 's';
									}
									if (s == b)
									{
										B = 's';
									}
									if (s == c)
									{
										C = 's';
									}
									if (s == d)
									{
										D = 's';
									}
									if (l == a)
									{
										A = 'l';
									}
									if (l == b)
									{
										B = 'l';
									}
									if (l == c)
									{
										C = 'l';
									}
									if (l == d)
									{
										D = 'l';
									}
									System.out.print(A);
									System.out.print(' ');
									System.out.print(a);
									System.out.print('\n');
									System.out.print(B);
									System.out.print(' ');
									System.out.print(b);
									System.out.print('\n');
									System.out.print(C);
									System.out.print(' ');
									System.out.print(c);
									System.out.print('\n');
									System.out.print(D);
									System.out.print(' ');

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
