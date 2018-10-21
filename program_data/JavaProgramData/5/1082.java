package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   double n;
	   String a = new String(new char[500]);
	   String b = new String(new char[500]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
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
	   int len1 = a.length();
	   int len2 = b.length();
	   int i;
	   int j = 0;
	   double t;
	   for (i = 0;i < len1;i++)
	   {
		   if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
		   {
			   System.out.print("error");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto q;
		   }
	   }
	   for (i = 0;i < len2;i++)
	   {
		   if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
		   {
			   System.out.print("error");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto q;
		   }
	   }
	   if (len1 != len2)
	   {
		   System.out.print("error");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		   goto q;
	   }
	   if (len1 == len2)
	   {
	   for (i = 0;i < len1;i++)
	   {
		   if (a.charAt(i) == b.charAt(i))
		   {
			   j++;
		   }
	   }
	   t = 1.0 * j / len1;
	   if (t > n)
	   {
		   System.out.print("yes");
	   }
	   else
	   {
		   System.out.print("no");
	   }
	   }
	   else
	   {
		   System.out.print("no");
	   }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	q:
	return 0;
	}
}

