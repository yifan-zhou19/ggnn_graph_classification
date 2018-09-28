package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int q;
	 String a = new String(new char[255]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 q = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i <= q - 1;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   for (int j = 0;j <= a.length() - 1;j++)
	   {
			if (a.charAt(j) == 65)
			{
				System.out.print("T");
			}
			else if (a.charAt(j) == 84)
			{
				System.out.print("A");
			}
			else if (a.charAt(j) == 71)
			{
				System.out.print("C");
			}
			else if (a.charAt(j) == 67)
			{
				System.out.print("G");
			}
	   }
	  System.out.print("\n");
	 }
	  int y;
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  y = Integer.parseInt(tempVar3);
	  }
		return 0;
	}


}

