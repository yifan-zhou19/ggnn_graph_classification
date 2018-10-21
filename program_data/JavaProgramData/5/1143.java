package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j = 0;
	   double g;
	   double t;
	   String a = new String(new char[501]);
	   String b = new String(new char[501]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   g = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   scanf("\n");
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b = tempVar3.charAt(0);
	   }
	   n = a.length();
	   m = b.length();
	   if (n != m)
	   {
		   System.out.print("error");
	   }
	   else
	   {
		   for (i = 0;i < n;i++)
		   {
			   if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G'))
			   {
				   if (a.charAt(i) == b.charAt(i))
				   {
					   j++;
				   }
				   else
				   {
					   ;
				   }
			   }
			   else
			   {
				   j = -1;
				   System.out.print("error");
				   break;
			   }
		   }
		   t = 1.0 * j / n;
		   if (t > g)
		   {
			   System.out.print("yes");
		   }
		   else if (t <= g != 0 && j != -1)
		   {
			   System.out.print("no");
		   }
	   }
	return 0;
	}
}

