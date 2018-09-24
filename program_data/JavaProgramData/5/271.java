package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a;
	  String b = new String(new char[500]);
	  String c = new String(new char[500]);
	  double s = 0;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  c = tempVar3.charAt(0);
	  }
	  if (b.length() != c.length())
	  {
		  System.out.print("error");
		  return 0;
	  }
	  for (i = 0;i < b.length();i++)
	  {
		  if (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && c.charAt(i) != 'A' && c.charAt(i) != 'C' && c.charAt(i) != 'T' && c.charAt(i) != 'G')
		  {
			  s = 1;
		  }
	  }
	  if (s == 1)
	  {
		  System.out.print("error");
		  return 0;
	  }
	  s = 0;
	   for (i = 0;i < b.length();i++)
	   {
		   if (b.charAt(i) == c.charAt(i))
		   {
			   s++;
		   }
	   }
	   if (s / b.length() > a)
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

