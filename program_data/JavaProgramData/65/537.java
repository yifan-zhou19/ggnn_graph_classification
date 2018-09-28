package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int as = 0;
		int bs = 0;
		int p = 0;
		int[] a = new int[200];
		int[] b = new int[200];
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (a[i] == 0 && b[i] != 0)
		   {
			   if (b[i] == 1)
			   {
				  as++;
			   }
			   else
			   {
				  bs++;
			   }
		   }
		   else if (a[i] == 2 && b[i] != 2)
		   {
			   if (b[i] == 0)
			   {
				  as++;
			   }
			   else
			   {
				  bs++;
			   }
		   }
		   else if (a[i] == 1 && b[i] != 1)
		   {
			   if (b[i] == 2)
			   {
				  as++;
			   }
			   else
			   {
				  bs++;
			   }
		   }
		}
		if (as > bs)
		{
		   System.out.print("A");
		}
		else if (bs > as)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
	 return 0;
	}

}

