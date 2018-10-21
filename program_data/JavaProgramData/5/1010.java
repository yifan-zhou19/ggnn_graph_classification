package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int len1;
	   int len2;
	   int i;
	   int j = 0;
	   int flag = 0;
	   double rate;
	   String a = new String(new char[500]);
	   String b = new String(new char[500]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   rate = Double.parseDouble(tempVar);
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
	   len1 = a.length();
	   len2 = b.length();
	   if (len1 != len2)
	   {
		   System.out.print("error\n");
		   return 0;
	   }
	   for (i = 0;i < len1;i++)
	   {
		   if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
		   {
			   System.out.print("error\n");
			   flag = 1;
			   break;
		   }
		   if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
		   {
			   System.out.print("error\n");
			   flag = 1;
			   break;
		   }
		   if (a.charAt(i) == b.charAt(i))
		   {
			   j++;
		   }
	   }
	   if (flag == 1)
	   {
		   return 0;
	   }
	   if ((double)j / len1 > rate)
	   {
		   System.out.print("yes\n");
	   }
	   else
	   {
		   System.out.print("no\n");
	   }
	   return 0;
	}




}

