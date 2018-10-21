package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j = 0;
	   int count1 = 0;
	   int count = 0;
	   String lian1 = new String(new char[501]);
	   String lian2 = new String(new char[501]);
	   double bi;
	   double xiang;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   bi = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   lian1 = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   lian2 = tempVar3.charAt(0);
	   }
	   for (i = 0;lian1.charAt(i) != '\0';i++)
	   {
		   count++;
	   }
	   for (i = 0;lian1.charAt(i) != '\0';i++)
	   {
	   if (lian2.charAt(i) == lian1.charAt(i))
	   {
	   count1++;
	   }
	   if (lian1.charAt(i) != 'A' && lian1.charAt(i) != 'T' && lian1.charAt(i) != 'C' && lian1.charAt(i) != 'G')
	   {
		   j = 1;
		   break;
	   }
	   if (lian2.charAt(i) != 'A' && lian2.charAt(i) != 'T' && lian2.charAt(i) != 'C' && lian2.charAt(i) != 'G')
	   {
		   j = 1;
		   break;
	   }
	   }

	   if (j == 1)
	   {
		   System.out.print("error");
	   }
	   if (j == 0)
	   {
	   xiang = count1 * 1.0 / count;

	   if (xiang > bi)
	   {
		   System.out.print("yes");
	   }
	   if (xiang <= bi)
	   {
		   System.out.print("no");
	   }
	   }

	   return 0;
	}
}

