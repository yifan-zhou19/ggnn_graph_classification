package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
	 int n;
	 int lengtha;
	 int lengthb;
	 int i;
	 int j;
	 int k;
	 int l;
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 String c = new String(new char[100]);
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
	   lengtha = a.length();
	   lengthb = b.length();
	   for (j = 1;j <= lengthb;j++)
	   {
		  if (a.charAt(lengtha - j) >= b.charAt(lengthb - j))
		  {
			c = tangible.StringFunctions.changeCharacter(c, lengtha - j, a.charAt(lengtha - j) - b.charAt(lengthb - j));
		  }
		  else
		  {
				c = tangible.StringFunctions.changeCharacter(c, lengtha - j, a.charAt(lengtha - j) - b.charAt(lengthb - j) + 10);
			 a = tangible.StringFunctions.changeCharacter(a, lengtha - j - 1, a.charAt(lengtha - j - 1) - 1);
		  }
	   }
		 if (a.charAt(lengtha - j) < 0)
		 {
			a = tangible.StringFunctions.changeCharacter(a, lengtha - j, a.charAt(lengtha - j) + 10);
			a = tangible.StringFunctions.changeCharacter(a, lengtha - j - 1, a.charAt(lengtha - j - 1) - 1);
		 }
		  for (k = lengtha - j;k >= 0;k--)
		  {
			 c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(k) - 48);
		  }
		  for (l = 0;l < lengtha;l++)
		  {
			System.out.printf("%d",c.charAt(l));
		  }
			System.out.print("\n");
	 }
	 }






}

