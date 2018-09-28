package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   String string = new String(new char[256]);

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0; i < n ; i++)
	   {
		   String = new Scanner(System.in).nextLine();
		   for (j = 0; j < String.length(); j++)
		   {
			  if (String[j] == 'A')
			  {
				System.out.print("T");
			  }
			  else if (String[j] == 'T')
			  {
				System.out.print("A");
			  }
			  else if (String[j] == 'G')
			  {
				System.out.print("C");
			  }
			  else if (String[j] == 'C')
			  {
				System.out.print("G");
			  }
		   }
		   System.out.print("\n");
	   }
	  return 0;
	}


}

