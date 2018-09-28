package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   double a;
	   double f;
	   int d;
	   int e;
	   int k;
	   int i;
	   String b = new String(new char[505]);
	   String c = new String(new char[505]);
	   k = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Double.parseDouble(tempVar);
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
	   d = b.length();
	   e = c.length();
	   if (d != e)
	   {
		  System.out.print("error");
	   }
	   else
	   {
		  for (i = 0;i < d;i++)
		  {
			  if (((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')) || ((c.charAt(i) != 'A') && (c.charAt(i) != 'T') && (c.charAt(i) != 'C') && (c.charAt(i) != 'G')))
			  {
				 System.out.print("error");
				 k = 1;
				 break;
			  }
		  }
		   if (k == 0)
		   {
			  for (i = 0;i < d;i++)
			  {
				  if (b.charAt(i) == c.charAt(i))
				  {
					 k++;
				  }
			  }
			  f = k / (d * 1.0);
			  if (f > a)
			  {
				 System.out.print("yes");
			  }
			  else
			  {
				 System.out.print("no");
			  }
		   }
	   }
	   return 0;
	}


}

