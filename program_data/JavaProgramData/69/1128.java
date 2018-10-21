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
		  String X = new String(new char[260]);
		  String Y = new String(new char[260]);
		  String Z = new String(new char[260]);
		  String P = new String(new char[260]);
		  String K = new String(new char[260]);
		  String O = new String(new char[260]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  K = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  O = tempVar2.charAt(0);
		  }
		  int m;
		  int n;
		  int s;
		  m = K.length();
		  n = O.length();
		  int v;
		  int d;
		  v = 0;
		  d = 0;
		   for (int i = 0;i < m;i++)
		   {
						  if (K.charAt(i) == '0')
						  {
							  v++;
						  }
						  else
						  {
							  break;
						  }
		   }

		   for (int i = 0;i < m - v;i++)
		   {
			X = tangible.StringFunctions.changeCharacter(X, i, K.charAt(i + v));
		   }
		   X = tangible.StringFunctions.changeCharacter(X, m - v, '\0');
		   m = m - v;
			for (int i = 0;i < n;i++)
			{
						  if (O.charAt(i) == '0')
						  {
							  d++;
						  }
						  else
						  {
							  break;
						  }
			}

		   for (int i = 0;i < n - d;i++)
		   {
			Y = tangible.StringFunctions.changeCharacter(Y, i, O.charAt(i + d));
		   }
		   Y = tangible.StringFunctions.changeCharacter(Y, n - v, '\0');
		   n = n - d;
		   if (n == 0 && m != 0)
		   {
			   System.out.printf("%s",X);
		   }
		   else if (m == 0 && n != 0)
		   {
			   System.out.printf("%s",Y);
		   }
		   else if (n == 0 && m == 0)
		   {
			   System.out.printf("%d",0);
		   }
		   else
		   {
		  if (m > n)
		  {
		  int i;
		  int p;
			  p = 0;

		  for (i = 0;i < m;i++)
		  {
			  X = tangible.StringFunctions.changeCharacter(X, m - i - 1, X.charAt(m - i - 1) + p);
			  if (i == m - 1)
			  {
				  break;
			  }
			  if (i < n)
			  {
		  if (X.charAt(m - i - 1) + Y.charAt(n - i - 1) - '0'>'9')
		  {
		  p = 1;
		  Z = tangible.StringFunctions.changeCharacter(Z, i, X.charAt(m - i - 1) + Y.charAt(n - i - 1) - '0' - 10);
		  }
		  else
		  {
			  p = 0;
			   Z = tangible.StringFunctions.changeCharacter(Z, i, X.charAt(m - i - 1) + Y.charAt(n - i - 1) - '0');
		  }
			  }
			 else
			 {
				  if (X.charAt(m - i - 1) > '9')
				  {
		  p = 1;
		  Z = tangible.StringFunctions.changeCharacter(Z, i, X.charAt(m - i - 1) - 10);

				  }
		  else
		  {
			  p = 0;
			   Z = tangible.StringFunctions.changeCharacter(Z, i, X.charAt(m - i - 1));
		  }
			 }
		  }

			 if (X.charAt(0) == '9' + 1)
			 {
				 s = m + 1;
			 }

		  else
		  {
			  s = m;
		  }
		  int t;
		  for (t = 0;t < m - 1;t++)
		  {
		  if (t <= (n - 1))
		  {
			  P = tangible.StringFunctions.changeCharacter(P, s - 1 - t, Z.charAt(t));
		  }
		  else
		  {
			  P = tangible.StringFunctions.changeCharacter(P, s - 1 - t, Z.charAt(t));
		  }
		  }
		  if (X.charAt(0) == '9' + 1)
		  {
		  P = tangible.StringFunctions.changeCharacter(P, 0, '1');
		  P = tangible.StringFunctions.changeCharacter(P, 1, '0');
		  }
		  else
		  {
			  P = tangible.StringFunctions.changeCharacter(P, 0, X.charAt(0));
		  }
		  P = tangible.StringFunctions.changeCharacter(P, s, '\0');
		  System.out.printf("%s",P);
		  }
			   if (n > m)
		  {
		  int i;
		  int p;
			  p = 0;

		  for (i = 0;i < n;i++)
		  {
			  Y = tangible.StringFunctions.changeCharacter(Y, n - i - 1, Y.charAt(n - i - 1) + p);
			  if (i == n - 1)
			  {
				  break;
			  }
			  if (i < m)
			  {
		  if (Y.charAt(n - i - 1) + X.charAt(m - i - 1) - '0'>'9')
		  {
		  p = 1;
		  Z = tangible.StringFunctions.changeCharacter(Z, i, Y.charAt(n - i - 1) + X.charAt(m - i - 1) - '0' - 10);
		  }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


