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
	   char[][] B = new char[2][510];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   B[0] = tempVar2.charAt(0);
	   }
	   for (i = 0;B[0][i] != '\0';i++)
	   {
		   if (B[0][i] != 'A' && B[0][i] != 'T' && B[0][i] != 'C' && B[0][i] != 'G')
		   {
			   a = 1;
		   }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   B[1] = tempVar3.charAt(0);
	   }
		 for (i = 0;B[1][i] != '\0';i++)
		 {
		   if (B[1][i] != 'A' && B[1][i] != 'T' && B[1][i] != 'C' && B[1][i] != 'G')
		   {
			   a = 1;
		   }
		 }
		 if (String.valueOf(B[0]).length() != String.valueOf(B[1]).length() || a == 1)
		 {
			 System.out.print("error");
		 return 0;
		 }
		 l = String.valueOf(B[0]).length();
		 for (i = 0;i < l;i++)
		 {
			 if (B[0][i] == B[1][i])
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

