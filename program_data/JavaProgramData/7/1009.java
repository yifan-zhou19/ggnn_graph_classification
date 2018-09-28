package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[256]);
	   String b = new String(new char[256]);
	   String c = new String(new char[256]);
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   c = tempVar3.charAt(0);
	   }
	   int x;
	   int y;
	   int i;
	   int j;
	   int p;
	   int q;
	   int k;
	   int r;
	   int t;
	   int z;
	   x = a.length();
	   y = b.length();
	   q = 0;
	   for (i = 0;q == 0 && i < x;i++)
	   {
		   if (b.charAt(0) == a.charAt(i))
		   {
			   p = i;
			   for (j = 0;b.charAt(j) == a.charAt(p) && b.charAt(j) != '\0' && a.charAt(p) != '\0';j++)
			   {
				   p++;
			   }
			   if (j == y)
			   {
				   q = q + 1;
			   }
		   }
	   }
	   if (q == 0)
	   {
		   for (z = 0;z < x;z++)
		   {
			   System.out.printf("%c",a.charAt(z));
		   }
	   }
	   if (q != 0)
	   {
		   for (k = 0;k < i - 1;k++)
		   {
			  System.out.printf("%c",a.charAt(k));
		   }
		   for (r = 0;r < y;r++)
		   {
			  System.out.printf("%c",c.charAt(r));
		   }
		   for (t = i + y - 1;t < x;t++)
		   {
			  System.out.printf("%c",a.charAt(t));
		   }
	   }
	}
}

