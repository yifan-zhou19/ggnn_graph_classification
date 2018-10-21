package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 scanf("\n");
	 String str = new String(new char[256]);
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  str = tempVar2.charAt(0);
	  }
	  for (j = 0;str.charAt(j);j++)
	  {
	   if (str.charAt(j) == 'A')
	   {
		System.out.print("T");
	   }
	   else if (str.charAt(j) == 'T')
	   {
	   System.out.print("A");
	   }
	   else if (str.charAt(j) == 'C')
	   {
	   System.out.print("G");
	   }
	   else if (str.charAt(j) == 'G')
	   {
	   System.out.print("C");
	   }
	  }
	  System.out.print("\n");
	 }
	  return 0;
	}
}

