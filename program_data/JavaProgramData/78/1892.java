//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[4];
	public static int[] b = new int[6];
	public static final char[] c = {'z', 'q', 's', 'l'};
	public static int Main()
	{
		int i = 1; //????
		int j = 1;
		int k = 1;
		int m = 1;
		int z; //????
		int q;
		int s;
		int l;
		int sum1;
		int sum2;
		int sum3;
		for (i = 1; i <= 5; i++) //???????
		{
			for (j = 1; j <= 5; j++)
			{
				for (k = 1; k <= 5; k++)
				{
					for (m = 1; m <= 5; m++)
					{
						if (i != j && i != m && i != k && j != k && j != m && m != k)
					{ //???????????
							a[0] = z = 10 * i; //????
							a[1] = q = 10 * j; //????
							a[2] = s = 10 * k; //????
							a[3] = l = 10 * m; //????
							sum1 = ((z + q) == (s + l));
							sum2 = ((z + l) > (s + q));
							sum3 = ((z + s) < q);
							if (sum1 == 1 && sum2 == 1 && sum3 == 1)
							{ //???????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
								memset(b,-1,(Integer.SIZE / Byte.SIZE));
								for (int l = 0;l < 4;l++)
								{
									b[a[l]] = l;
								}
								for (int l = 5;l > 0;l--)
								{
									if (b[l] > -1)
									{
										System.out.print(c[b[l]]);
										System.out.print(' ');
										System.out.print(l * 10);
										System.out.print("\n");
									}
								}
								if (q > l)
								{ //??????
									if (z > s) //?????????

									{
										System.out.print("q");
										System.out.print(" ");
										System.out.print(q);
										System.out.print("\n");
										System.out.print("l");
										System.out.print(" ");
										System.out.print(l);
										System.out.print("\n");
										System.out.print("z");
										System.out.print(" ");
										System.out.print(z);
										System.out.print("\n");
										System.out.print("s");
										System.out.print(" ");
										System.out.print(s);
										System.out.print("\n");
									}
									else
									{ //?????????
										System.out.print("q");
										System.out.print(" ");
										System.out.print(q);
										System.out.print("\n");
										System.out.print("l");
										System.out.print(" ");
										System.out.print(l);
										System.out.print("\n");
										System.out.print("s");
										System.out.print(" ");
										System.out.print(s);
										System.out.print("\n");
										System.out.print("z");
										System.out.print(" ");
										System.out.print(z);
										System.out.print("\n");
									}
								}

								if (q < l)
								{ //??????
									if (z > s)
									{ //?????????
									}
									System.out.print("l");
									System.out.print(" ");
									System.out.print(l);
									System.out.print("\n");
									System.out.print("q");
									System.out.print(" ");
									System.out.print(q);
									System.out.print("\n");
									System.out.print("z");
									System.out.print(" ");
									System.out.print(z);
									System.out.print("\n");
									System.out.print("s");
									System.out.print(" ");
									System.out.print(s);
									System.out.print("\n");
								}
								else
								{ //?????????

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
