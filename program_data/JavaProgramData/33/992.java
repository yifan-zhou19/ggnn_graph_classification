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
		String s = new String(new char[256]);
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s = tempVar2.charAt(0);
		   }

		   for (j = 0;j < s.length();j++)
		   {
			   if (j < s.length() - 1)
			   {
				  if (s.charAt(j) == 'A')
				  {
					  System.out.print("T");
				  }
				  if (s.charAt(j) == 'T')
				  {
					  System.out.print("A");
				  }
				  if (s.charAt(j) == 'C')
				  {
					  System.out.print("G");
				  }
				  if (s.charAt(j) == 'G')
				  {
					  System.out.print("C");
				  }
			   }
			   else
			   {
				  if (s.charAt(j) == 'A')
				  {
					  System.out.print("T\n");
				  }
				  if (s.charAt(j) == 'T')
				  {
					  System.out.print("A\n");
				  }
				  if (s.charAt(j) == 'C')
				  {
					  System.out.print("G\n");
				  }
				  if (s.charAt(j) == 'G')
				  {
					  System.out.print("C\n");
				  }
			   }

		   }

		}
		return 0;
	}

}

