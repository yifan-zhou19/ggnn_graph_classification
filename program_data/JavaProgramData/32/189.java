package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int la;
	int lb;
	int m;
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	String c = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 for (i = 1;i <= n;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = tempVar3.charAt(0);
	 }
	  la = a.length();
	  lb = b.length();
		 for (j = la - 1;j >= 0;j--)
		 {
			 if (j >= la - lb)
			 {
			   if (a.charAt(j) >= b.charAt(j - la + lb))
			   {
				   c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) - b.charAt(j - la + lb) + 48);
			   }
			   else if (a.charAt(j) < b.charAt(j - la + lb))
			   {
				  c = tangible.StringFunctions.changeCharacter(c, j, 10 + a.charAt(j) - b.charAt(j - la + lb) + 48);
				  a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
			   }
			 }
			 else
			 {
				 c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
			 }
		 }
		 c = c.substring(0, la);
		 for (j = 0;j < la;j++)
		 {
			 if (c.charAt(j) != 48)
			 {
			 m = j;
			 break;
			 }
		 }
			 for (j = m;j < la;j++)
			 {
				 System.out.printf("%c",c.charAt(j));
			 }
	System.out.print("\n");
	 }
	}

}

