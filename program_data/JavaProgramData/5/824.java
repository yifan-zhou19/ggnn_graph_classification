package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int y;
	  int i;
	  int sum = 0;
	  String a = new String(new char[505]);
	  String b = new String(new char[505]);
	  double n;
	  double m;
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
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = tempVar3.charAt(0);
		 }
		 x = a.length();
		 y = b.length();
			if (x != y)
			{
			   System.out.print("error");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto k;
			}
			 for (i = 0;i < x;i++)
			 {
				 if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T'))
				 {
					 System.out.print("error");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					 goto k;
				 }
				  else
				  {
					  if (a.charAt(i) == b.charAt(i))
					  {
						  sum++;
					  }
				  }
			 }
		  m = (1.0 * sum) / x;
		  if (m > n)
		  {
			System.out.print("yes");
		  }
			else
			{
			System.out.print("no");
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   k:
	   return 0;
	}
}

