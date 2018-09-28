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
		  int t;
		  int i;
		  int j;
		  int k;
		  String c = new String(new char[100000]);
		  int[] a = new int[26];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
					   int[] a = new int[26];
					   c = new Scanner(System.in).nextLine();
					   for (j = 0;c.charAt(j) != '\0';j++)
					   {
											  switch (c.charAt(j))
											  {
													 case'a':
													 a[0]++;
													 break;
													 case'b':
													 a[1]++;
													 break;
													 case'c':
													 a[2]++;
													 break;
													 case'd':
													 a[3]++;
													 break;
													 case'e':
													 a[4]++;
													 break;
													 case'f':
													 a[5]++;
													 break;
													 case'g':
													 a[6]++;
													 break;
													 case'h':
													 a[7]++;
													 break;
													 case'i':
													 a[8]++;
													 break;
													 case'j':
													 a[9]++;
													 break;
													 case'k':
													 a[10]++;
													 break;
													 case'l':
													 a[11]++;
													 break;
													 case'm':
													 a[12]++;
													 break;
													 case'n':
													 a[13]++;
													 break;
													 case'o':
													 a[14]++;
													 break;
													 case'p':
													 a[15]++;
													 break;
													 case'q':
													 a[16]++;
													 break;
													 case'r':
													 a[17]++;
													 break;
													 case's':
													 a[18]++;
													 break;
													 case't':
													 a[19]++;
													 break;
													 case'u':
													 a[20]++;
													 break;
													 case'v':
													 a[21]++;
													 break;
													 case'w':
													 a[22]++;
													 break;
													 case'x':
													 a[23]++;
													 break;
													 case'y':
													 a[24]++;
													 break;
													 case'z':
													 a[25]++;
													 break;
											  }
					   }
					   for (j = 0,k = 0;c.charAt(j) != '\0';j++)
					   {
																	 if (a[c.charAt(j) - 97] == 1)
																	 {
																					  System.out.printf("%c\n",c.charAt(j));
																					  k++;
																					  break;
																	 }
					   }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


