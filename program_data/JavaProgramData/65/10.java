package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int s1 = 0;
		int s2 = 0;
		int n;
		int i;
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
		   if (a[i] == b[i])
		   {
			   s1++;
			   s2++;
		   }
		   if (a[i] == 0)
		   {
			   if (b[i] == 1)
			   {
				   s1++;
			   }
					   if (b[i] == 2)
					   {
						   s2++;
					   }
		   }
			if (a[i] == 1)
			{
				if (b[i] == 2)
				{
					s1++;
				}
					   if (b[i] == 0)
					   {
						   s2++;
					   }
			}
			if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					s1++;
				}
					   if (b[i] == 1)
					   {
						   s2++;
					   }
			}
	 }
		if (s1 > s2)
		{
			System.out.print("A");
		}
		if (s1 < s2)
		{
			System.out.print("B");
		}
		 if (s1 == s2)
		 {
			 System.out.print("Tie");
		 }
		 return 0;
	}
}

