package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int len1;
	   int len2;
	   int i;
	   int j = 0;
	   int flag1 = 0;
	   int flag2 = 0;
	   String dna1 = new String(new char[501]);
	   String dna2 = new String(new char[501]);
	   double b;
	   double b2;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   b = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   dna1 = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   dna2 = tempVar3.charAt(0);
	   }
	   len1 = dna1.length();
	   len2 = dna2.length();
	   for (i = 0;i < len1;i++)
	   {
		   if ((dna1.charAt(i) == 'A') || (dna1.charAt(i) == 'T') || (dna1.charAt(i) == 'C') || (dna1.charAt(i) == 'G'))
		   {
			  continue;
		   }
		   else
		   {
			   flag1 = 1;
			   break;
		   }

	   }
	   for (i = 0;i < len2;i++)
	   {
		   if ((dna2.charAt(i) == 'A') || (dna2.charAt(i) == 'T') || (dna2.charAt(i) == 'C') || (dna2.charAt(i) == 'G'))
		   {
			  continue;
		   }
		   else
		   {
			   flag2 = 1;
			   break;
		   }

	   }
	   if ((len1 != len2) || (flag1 == 1) || (flag2 == 1))
	   {
		  System.out.print("error");
	   }
	   else
	   {
		   for (i = 0;i < len1;i++)
		   {
			   if (dna1.charAt(i) == dna2.charAt(i))
			   {
				  j++;
			   }
		   }
		   b2 = 1.0 * j / len1;
		   if (b2 > b)
		   {
			  System.out.print("yes");
		   }
		   else
		   {
			  System.out.print("no");
		   }
	   }



	return 0;
	}
}

