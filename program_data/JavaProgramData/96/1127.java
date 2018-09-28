//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int div13(int A)
	{
	 int div;
	 if (A >= 13 * 9)
	 {
		div = 9;
	 }
	 else
	 {
	  if (A >= 13 * 8)
	  {
	   div = 8;
	  }
	  else
	  {
	   if (A >= 13 * 7)
	   {
		div = 7;
	   }
	   else
	   {
		if (A >= 13 * 6)
		{
		 div = 6;
		}
		else
		{
		 if (A >= 13 * 5)
		 {
		  div = 5;
		 }
		 else
		 {
		  if (A >= 13 * 4)
		  {
		   div = 4;
		  }
		  else
		  {
		   if (A >= 13 * 3)
		   {
			div = 3;
		   }
		   else
		   {
			if (A >= 13 * 2)
			{
			 div = 2;
			}
			else
			{
			 if (A >= 13 * 1)
			 {
			  div = 1;
			 }
			 else
			 {
			  div = 0;
			 }
			}
		   }
		  }
		 }
		}
	   }
	  }
	 }
	 return div;
	}

	public static int lev13(int A)
	{
	 int lev;
	 if (A >= 13 * 9)
	 {
		lev = A - 13 * 9;
	 }
	 else
	 {
	  if (A >= 13 * 8)
	  {
	   lev = A - 13 * 8;
	  }
	  else
	  {
	   if (A >= 13 * 7)
	   {
		lev = A - 13 * 7;
	   }
	   else
	   {
		if (A >= 13 * 6)
		{
		 lev = A - 13 * 6;
		}
		else
		{
		 if (A >= 13 * 5)
		 {
		  lev = A - 13 * 5;
		 }
		 else
		 {
		  if (A >= 13 * 4)
		  {
		   lev = A - 13 * 4;
		  }
		  else
		  {
		   if (A >= 13 * 3)
		   {
			lev = A - 13 * 3;
		   }
		   else
		   {
			if (A >= 13 * 2)
			{
			 lev = A - 13 * 2;
			}
			else
			{
			 if (A >= 13 * 1)
			 {
			  lev = A - 13 * 1;
			 }
			 else
			 {
			  lev = A;
			 }
			}
		   }
		  }
		 }
		}
	   }
	  }
	 }
	 return lev;
	}

	public static int Main()
	{
	 String dvdd = new String(new char[100]);
	 String ans = new String(new char[100]);
	 int N;
	 int div;
	 int lev;
	 int a;
	 int head;
	 int i;
	 for (i = 0; i < 100; i++)
	 {
		 ans = tangible.StringFunctions.changeCharacter(ans, i, '0');
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 dvdd = tempVar.charAt(0);
	 }
	 N = dvdd.length();
	 lev = 0;

	 for (i = 0; i <= N - 1; i++)
	 {
	  a = dvdd.charAt(i) - '0' + lev * 10;
	  div = div13(a);
	  lev = lev13(a);
	  ans = tangible.StringFunctions.changeCharacter(ans, i, div + '0');
	 }
	 if (N == 1)
	 {
		System.out.print("0\n");
		System.out.printf("%d\n", lev);
	 }
	 else
	 {
	  head = (dvdd.charAt(0) - '0') * 10 + (dvdd.charAt(1) - '0');
	  if (head < 13)
	  {
	   if (N == 2)
	   {
		  System.out.print("0\n");
	   }
	   else
	   {
		for (i = 2; i <= N - 1; i++)
		{
			System.out.printf("%c", ans.charAt(i));
		}
		System.out.print("\n");
	   }
	   System.out.printf("%d\n", lev);
	  }
	  else
	  {
	   for (i = 1; i <= N - 1; i++)
	   {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


