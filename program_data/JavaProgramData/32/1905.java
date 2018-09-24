package <missing>;

public class GlobalMembers
{
	public static String n1 = new String(new char[100]);
	public static String n2 = new String(new char[100]);
	public static String n3 = new String(new char[101]);
	public static int w;
	public static int i;

	public static void do_sub()
	{
	 int iLen1;
	 int iLen2;
	 int iBorrow = 0;
	 int n = 0;
	 int sign = 0;

	 iLen1 = n1.length();
	 iLen2 = n2.length();
	 if ((iLen2 > iLen1) || (iLen2 == iLen1) && (strcmp(n2, n1) > 0))
	 {
	  n3 = n1;
	  n1 = n2;
	  n2 = n3;
	  sign = -1;
	 }

	 for (iLen1 = n1.length() - 1, iLen2 = n2.length() - 1; (iLen1 >= 0) && (iLen2 >= 0); iLen1--, iLen2--)
	 {
	  n3 = tangible.StringFunctions.changeCharacter(n3, n, n1.charAt(iLen1) - n2.charAt(iLen2) - iBorrow);
	  iBorrow = (n3.charAt(n) >= 0) ? 0 : 1;
	  if (n3.charAt(n) < 0)
	  {
	   n3.charAt(n) += 10;
	  }
	  n++;
	 }
	 for (; iLen1 >= 0; iLen1--)
	 {
	  n3 = tangible.StringFunctions.changeCharacter(n3, n, n1.charAt(iLen1) - '0' - iBorrow);
	  iBorrow = (n3.charAt(n) >= 0) ? 0 : 1;
	  if (n3.charAt(n) < 0)
	  {
	   n3.charAt(n) += 10;
	  }
	  n++;
	 }

	 if (sign == -1)
	 {
	  System.out.print("-");
	 }
	 for (n--; n >= 0; n--)
	 {
	  System.out.printf("%d", n3.charAt(n));
	 }
	 System.out.print("\n");
	}

	public static void Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	for (i = 0;i < w;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n1 = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 n2 = tempVar3.charAt(0);
	 }
	 do_sub();
	}
	}
}

