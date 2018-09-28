package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 int n;
	 int m;
	 int k;
	 int i;
	 int j;
	 int l;
	 int o;
	 int p;
	 int c;
	 int d;
	 int b1;
	 int b2;
	 int h = 1;
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
	 n = a.length();
	 m = b.length();
	 if (n != m)
	 {
	  System.out.printf("%s","NO");
	 }
	 else
	 {
	   for (i = 0;i < n;i++)
	   {
		(int)a.charAt(i);
	   }
	   for (j = 0;j < m;j++)
	   {
		(int)b.charAt(j);
	   }
	   for (c = 0;c < n - 1;c++)
	   {
		  for (d = 0;d < n - 1 - c;d++)
		  {
		   if (a.charAt(d) >= a.charAt(d + 1))
		   {
			 b1 = a.charAt(d);
			 a = tangible.StringFunctions.changeCharacter(a, d, a.charAt(d + 1));
			 a = tangible.StringFunctions.changeCharacter(a, d + 1, b1);
		   }
		  }
	   }
	   for (o = 0;o < m - 1;o++)
	   {
		 for (p = 0;p < m - 1 - o;p++)
		 {
		  if (b.charAt(p) >= b.charAt(p + 1))
		  {
			b2 = b.charAt(p);
			b = tangible.StringFunctions.changeCharacter(b, p, b.charAt(p + 1));
			b = tangible.StringFunctions.changeCharacter(b, p + 1, b2);
		  }
		 }
	   }
	   for (k = 0;k < n;k++)
	   {
		 if (a.charAt(k) != b.charAt(k))
		 {
		  h = 0;
		 }
	   }
	   if (h == 0)
	   {
		System.out.printf("%s","NO");
	   }
	   else
	   {
		   System.out.printf("%s","YES");
	   }
	 }
	}
}

