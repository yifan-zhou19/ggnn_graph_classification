package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[500];
	 int[] b = new int[500];
	 int n;
	 int i;
	 int p = 0;
	 int r;
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
		   if (a[i] % 2 == 1)
		   {
			 b[i] = a[i];
		   }
		   else
		   {
			 b[i] = 0;
		   }
		}
	   for (i = 0;i < n;i++)
	   {
		 if (b[i] > p)
		 {
		  p = b[i];
		 }
	   }
	  for (r = 1;r <= p - 2;r += 2)
	  {
		for (i = 0;i < n;i++)
		{
		 if (b[i] == r)
		 {
		  System.out.printf("%d,",b[i]);
		 }
		}
	  }
	  System.out.printf("%d",p);
	 return 0;
	}

}

