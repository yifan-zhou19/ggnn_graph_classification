package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		   int l1;
		   int l2;
		   int i;
		   int sum = 0;
		   int w = 0;
		   float rate;
		   float result;
		   String zfc_1 = new String(new char[600]);
		   String zfc_2 = new String(new char[600]);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   rate = Float.parseFloat(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   zfc_1 = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   zfc_2 = tempVar3.charAt(0);
		   }
		   l1 = zfc_1.length();
		   l2 = zfc_2.length();
		   for (i = 0;i < l1;i++)
		   {
		   if ((l1 != l2) || (zfc_1.charAt(i) != 'A' && zfc_1.charAt(i) != 'T' && zfc_1.charAt(i) != 'G' && zfc_1.charAt(i) != 'C') || (zfc_2.charAt(i) != 'A' && zfc_2.charAt(i) != 'T' && zfc_2.charAt(i) != 'G' && zfc_2.charAt(i) != 'C'))
		   {
			 System.out.print("error");
			 w = 1;
			 break;
		   }
		   else
		   {
			 if (zfc_1.charAt(i) == zfc_2.charAt(i))
			 {
			   sum++;
			 }
			 else
			 {
				 continue;
			 }
		   }
		   }
		   result = 1.00 * sum / l1;
		   if (result > rate)
		   {
			 System.out.print("yes");
		   }
		   else if ((result <= rate) && (w == 0))
		   {
			 System.out.print("no");
		   }
		   return 0;
	   }
}

