package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 A:
	 for (n1 = 1;n1 <= n;n1++)
	 {
	  String a = new String(new char[21]);
	  int i;
	  int z = 0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }



	  for (i = 0;i <= a.length() - 1;i++)
	  {
		   if ((a.charAt(i) < 48 || (a.charAt(i)>57 && a.charAt(i) < 65) || (a.charAt(i) >= 91 && a.charAt(i) <= 96) || a.charAt(i)>122) && a.charAt(i) != '_')
		   {
								 z = 1;
								 System.out.print("no\n");
								 break;
		   }
	  }
	   if (a.charAt(0) < 65)
	   {
		   if (z == 0)
		   {
			   System.out.print("no\n");
			   z = 1;
		   }
	   }
	  if (z == 0)
	  {
		  System.out.print("yes\n");
	  }
	 }
	}
}

