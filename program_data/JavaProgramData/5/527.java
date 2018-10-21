package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int s;
	 int i;
	 double p;
	 double l;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p = Double.parseDouble(tempVar);
	 }
	 String m = new String(new char[500]);
	 String n = new String(new char[500]);
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 n = tempVar3.charAt(0);
	 }
	 a = m.length();
	 b = n.length();
	 s = 0;
	 if (a == b)
	 {
	  for (i = 0;i < a;i++)
	  {
	   if ((m.charAt(i) != 'A' && m.charAt(i) != 'T' && m.charAt(i) != 'C' && m.charAt(i) != 'G') || (n.charAt(i) != 'A' && n.charAt(i) != 'T' && n.charAt(i) != 'C' && n.charAt(i) != 'G'))
	   {
		System.out.print("error");
		s = 1;
		break;
	   }
	  }
	 }
	 else
	 {
	  System.out.print("error");
	  s = 1;
	 }
	 if (s == 0)
	 {
	  for (i = 0;i < a;i++)
	  {
	   if (m.charAt(i) == n.charAt(i))
	   {
		s = s + 1;
	   }
	  }
	  l = s * 1.0 / a;
	  if (l > p)
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

