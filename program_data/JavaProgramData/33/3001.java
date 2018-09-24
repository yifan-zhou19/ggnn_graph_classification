package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int n;
		  int i;
		  int k;
		  String a = new String(new char[256]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = tempVar2.charAt(0);
		   }
		   for (k = 0;a.charAt(k) != '\0';k++)
		   {
				  if (a.charAt(k) == 'A')
				  {
					  System.out.print("T");
					  continue;
				  }
				 if (a.charAt(k) == 'G')
				 {
					  System.out.print("C");
					  continue;
				 }
				 if (a.charAt(k) == 'C')
				 {
					  System.out.print("G");
					  continue;
				 }

				 if (a.charAt(k) == 'T')
				 {
					  System.out.print("A");
					  continue;
				 }
		   }
			  System.out.print("\n");
		  }
		  return 0;
	  }




}

