package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
	   String word = new String(new char[40]);

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (i = 0,t = 81;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   word = tempVar2.charAt(0);
		   }
		 k = word.length();
		 if (t - k - 1 >= 0)
		 {
			  if (t == 81)
			  {
				  System.out.printf("%s",word);
			  }
			 else
			 {
				 System.out.printf(" %s",word);
			 }
		   t = t - k - 1;
		 }
		 else
		 {
			 System.out.print("\n");
				t = 81 - k - 1;
				System.out.printf("%s",word);
		 }
	   }
		 System.out.print("\n");
		return 0;
	}
}

