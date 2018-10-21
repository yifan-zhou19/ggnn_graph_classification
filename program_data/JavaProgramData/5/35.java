package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[501]);
	   String b = new String(new char[501]);
	   double c;
	   double d;
	   int j = 0;
	   int n;
	   int i;
	   int e = 0;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   c = Double.parseDouble(tempVar);
	   }
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
	   n = a.length();
	   m = b.length();
	   if (n != m)
	   {
			e = 1;
	   }
	   else
	   {
	   for (i = 0;i < n;i++)
	   {
			 if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			 {
				 e = 1;
			 }
	   }
	   }
	   if (e == 1)
	   {
		   System.out.print("error");
	   }
	   while (e == 0)
	   {
		for (i = 0;i < n;i++)
		{
			 if (a.charAt(i) == b.charAt(i))
			 {
				  j++;
			 }
		}
	   d = 1.0 * j / n;
	   if (d >= c)
	   {
		   System.out.print("yes");
	   }
	   else
	   {
		   System.out.print("no");
	   }
		e = 1;
	   }
	   return 0;
	}
}

