package <missing>;

public class GlobalMembers
{
	public static void com(String seq)
	{
		 int len = seq.length();
		 int i;

		 for (i = 0; i <= len - 1; i++)
		 {
			   switch (seq[i])
			   {
							 case 'A':
								  System.out.print("T");
								  break;
							 case 'T':
								  System.out.print("A");
								  break;
							 case 'G':
								  System.out.print("C");
								  break;
							 case 'C':
								  System.out.print("G");
								  break;
			   }
		 }

		 System.out.print("\n");
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String seq = new String(new char[256]);
		int i;
		for (i = 1; i <= n; i++)
		{
			  seq = new Scanner(System.in).nextLine();
			  com(seq);
		}

		return 0;
	}


}

