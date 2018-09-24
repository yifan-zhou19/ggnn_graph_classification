package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a = 0;
	   int i;
	   int l;
	   int b = 0;
	   double n;
	   String B = new String(new char[510]);
	   String A = new String(new char[510]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   B = tempVar2.charAt(0);
	   }
	   for (i = 0;B.charAt(i) != '\0';i++)
	   {
		   if (B.charAt(i) != 'A' && B.charAt(i) != 'T' && B.charAt(i) != 'C' && B.charAt(i) != 'G')
		   {
			   a = 1;
		   }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   A = tempVar3.charAt(0);
	   }
		 for (i = 0;A.charAt(i) != '\0';i++)
		 {
		   if (A.charAt(i) != 'A' && A.charAt(i) != 'T' && A.charAt(i) != 'C' && A.charAt(i) != 'G')
		   {
			   a = 1;
		   }
		 }
		 if (B.length() != A.length() || a == 1)
		 {
			 System.out.print("error");
		 return 0;
		 }
		 l = B.length();
		 for (i = 0;i < l;i++)
		 {
			 if (B.charAt(i) == A.charAt(i))
			 {
				 b++;
			 }
		 }
			  if (1.0 * b / l > n)
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

