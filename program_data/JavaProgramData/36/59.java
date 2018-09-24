package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[80]);
	 String b = new String(new char[80]);
	 char c;
	 char k;
	 int la;
	 int lb;
	 int i;
	 int j;
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
	 la = a.length();
	 lb = b.length();
	 if (la != lb)
	 {
		 System.out.print("NO");
	 }
	 else if (la = lb)
	 {
	   for (i = 0;i < la;i++)
	   {
		 for (j = i;j < la;j++)
		 {
		   if (a.charAt(j) < a.charAt(i))
		   {
			   c = a.charAt(i);
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
			   a = tangible.StringFunctions.changeCharacter(a, j, c);
		   }
		 }
	   }
	   for (i = 0;i < la;i++)
	   {
		 for (j = i;j < la;j++)
		 {
		   if (b.charAt(j) < b.charAt(i))
		   {
			   c = b.charAt(i);
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
			   b = tangible.StringFunctions.changeCharacter(b, j, c);
		   }
		 }
	   }
	 for (i = 0;i < la;i++)
	 {
	  if (a[i] = b.charAt(i) != null)
	  {
		  k = k + 1;
	  }
	 }
	 if (k = la)
	 {
		 System.out.print("YES");
	 }
	 else if (k != la)
	 {
		 System.out.print("NO");
	 }
	 }
	}
}

