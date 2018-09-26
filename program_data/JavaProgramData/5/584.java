package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int a;
	   int b;
	   int c = 0;
	   double n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String A = new String(new char[500]);
	   String B = new String(new char[500]);

		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   A = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   B = tempVar3.charAt(0);
		   }
	   a = A.length();
	   b = B.length();
	   if (a != b)
	   {
		   System.out.print("error");
	   return 0;
	   }
	   for (j = 0;j < a;j++)
	   {

		  if (A.charAt(j) == B.charAt(j))
		  {
			 c++;
		  }
		  if (A.charAt(j) != 'A' && A.charAt(j) != 'G' && A.charAt(j) != 'C' && A.charAt(j) != 'T')
		  {
			  System.out.print("error");
			   return 0;
		  }
		  if (B.charAt(j) != 'A' && B.charAt(j) != 'G' && B.charAt(j) != 'C' && B.charAt(j) != 'T')
		  {
			  System.out.print("error");
			   return 0;
		  }

	   }
	   if ((1.0 * c / a) >= n)
	   {
		   System.out.print("yes");
	   }
	   else
	   {
		   System.out.print("no");
	   }


		return 0;
	}




}

