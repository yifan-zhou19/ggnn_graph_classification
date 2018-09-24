package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[501]);
	   String b = new String(new char[501]);
	   int i;
	   int time = 0;
	   double n;
	   double p;
	   double l;
	   double j;
	   double k;
	   double same = 0;
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
	   j = a.length();
	   k = b.length();
	   for (i = 0;i < j;i++)
	   {
		   if (!(a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G'))
		   {
			   System.out.print("error");
			   time++;
			   break;
		   }
	   }
	   for (i = 0;i < k;i++)
	   {
		   if ((!(b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G')) && time == 0)
		   {
			   System.out.print("error");
			   time++;
			   break;
		   }
	   }
	   if (j != k && time == 0)
	   {
		   System.out.print("error");
		   time++;
	   }
	   if (time == 0)
	   {
		   for (i = 0;i < j;i++)
		   {
			   if (a.charAt(i) == b.charAt(i))
			   {
				   same++;
			   }
		   }
		   l = a.length();
		   p = same / l;
		   if (p > n)
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

