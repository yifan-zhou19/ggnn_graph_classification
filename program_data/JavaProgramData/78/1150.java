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
		char h1;
		char h2;
		char h3;
		char h4;
		int zhao;
		int qian;
		int sun;
		int li;
		int a;
		int b;
		int c;
		int m1;
		int m2;
		int m3;
		int m4;
		for (int z = 1; z <= 5; z++)
		{
			for (int q = 1; q <= 5; q++)
			{
				for (int s = 1; s <= 5; s++)
				{
					for (int l = 1; l <= 5; l++)
					{
						zhao = z * 10;
						qian = q * 10;
						sun = s * 10;
						li = l * 10;
						a = (zhao + qian) == (sun + li);
						b = (zhao + li) > (sun + qian);
						c = (zhao + sun) < qian;
						if (a == 1 && b == 1 && c == 1)
						{
							if (li > qian)
							{
								h1 = 'l';
								h2 = 'q';
								m1 = li;
								m2 = qian;
								if (zhao > sun)
								{
									h3 = 'z';
									h4 = 's';
									m3 = zhao;
									m4 = sun;
								}
								else
								{
									h3 = 's';
									h4 = 'z';
									m3 = sun;
									m4 = zhao;
								}
							}
							else
							{
								h1 = 'q';
								m1 = qian;
								if ((zhao > sun) && (zhao > li))
								{
									h2 = 'z';
									m2 = zhao;
									if (sun > li)
									{
										h3 = 's';
										h4 = 'l';
										m3 = sun;
										m4 = li;
									}
									else
									{
										h3 = 'l';
										h4 = 's';
										m3 = li;
										m4 = sun;
									}
								}
								if ((sun > zhao) && (sun > li))
								{
									h2 = 's';
									m2 = sun;
									if (zhao > li)
									{
										h3 = 'z';
										h4 = 'l';
										m3 = zhao;
										m4 = li;
									}
									else
									{
										h3 = 'l';
										h4 = 'z';
										m3 = li;
										m4 = zhao;
									}
								}
								if ((li > zhao) && (li > sun))
								{
									h2 = 'l';
									m2 = li;
									if (zhao > sun)
									{
										h3 = 'z';
										h4 = 's';
										m3 = zhao;
										m4 = sun;
									}
									else
									{
										h3 = 's';
										h4 = 'z';
										m3 = sun;
										m4 = zhao;
									}
								}
							}
							System.out.print(h1);
							System.out.print(" ");
							System.out.print(m1);
							System.out.print("\n");
							System.out.print(h2);
							System.out.print(" ");
							System.out.print(m2);
							System.out.print("\n");
							System.out.print(h3);
							System.out.print(" ");
							System.out.print(m3);
							System.out.print("\n");
							System.out.print(h4);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
