package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int x;
		int c;
		x = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   k = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   m = Integer.parseInt(tempVar3);
		   }

	  if (k == 1 && m == 2)
	  {
		  x++;
	  }
		   else if (k == 0 && m == 2)
		   {
			   c++;
		   }
		   else if (k == 0 && m == 1)
		   {
			   x++;
		   }
		   else if (k == 2 && m == 1)
		   {
			   c++;
		   }
		   else if (k == 2 && m == 0)
		   {
			   x++;
		   }
		   else if (k == 1 && m == 0)
		   {
			   c++;
		   }

		}
	 if (x > c)
	 {
		 System.out.print("A");
	 }
	 else if (x == c)
	 {
		 System.out.print("Tie");
	 }
	 else if (x < c)
	 {
		 System.out.print("B");
	 }
	}


}

