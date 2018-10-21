package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int as = 0;
		int bs = 0;
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int j;
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
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (a[i] == b[i])
		   {
			   as++;
			   bs++;
		   }
		   else
		   {
			   if (a[i] == 1 && b[i] == 0)
			   {
				   bs++;
			   }
		   else
		   {
			   if (a[i] == 1 && b[i] == 2)
			   {
				   as++;
			   }
		   else
		   {
			   if (a[i] == 0 && b[i] == 1)
			   {
				   as++;
			   }
		   else
		   {
			   if (a[i] == 0 && b[i] == 2)
			   {
				   bs++;
			   }
		   else
		   {
			   if (a[i] == 2 && b[i] == 0)
			   {
				   as++;
			   }
		   else
		   {
			   if (a[i] == 2 && b[i] == 1)
			   {
				   bs++;
			   }
		   }
		   }
		   }
		   }
		   }
		   }
		}
		if (as == bs)
		{
			System.out.print("Tie");
		}
		else
		{
			if (as > bs)
			{
				System.out.print("A");
			}
		else
		{
			System.out.print("B");
		}
		}
		return 0;
	}

}

