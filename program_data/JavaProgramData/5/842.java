package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double k;
	 double m;
	 double n;
	 double s = 0;
	 int i;
	 String a = new String(new char[501]);
	 String b = new String(new char[501]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Double.parseDouble(tempVar);
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
	 m = a.length();
	 n = b.length();
	 if (m != n)
	 {
	   System.out.print("error");
	 }
	 else
	 {
	   for (i = 0;i < m;i++)
	   {
		 if (((a.charAt(i) == 'A') || (a.charAt(i) == 'G') || (a.charAt(i) == 'C') || (a.charAt(i) == 'T')) && ((b.charAt(i) == 'A') || (b.charAt(i) == 'G') || (b.charAt(i) == 'C') || (b.charAt(i) == 'T')))
		 {
		   if (a.charAt(i) == b.charAt(i))
		   {
			   s++;
		   }
		   else
		   {
			   s = s;
		   }
		 }
	   else
	   {
		   s = -1;
		   break;
	   }
	   }
	  s = s / m;
	  if (s < 0)
	  {
		  System.out.print("error");
	  }
	  else if (s >= 0 && s <= k)
	  {
		  System.out.print("no");
	  }
	  else
	  {
		  System.out.print("yes");
	  }
	 }
	 return 0;
	}


}

