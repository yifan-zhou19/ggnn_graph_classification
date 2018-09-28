package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[1000];
	  int[] b = new int[500000];
	  int i;
	  int m;
	  int n;
	  int k;
	  int d = 0;
	  int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(a[i]) = Integer.parseInt(tempVar3);
		}
	  }
	  for (m = 1;m < n;m++)
	  {
	   for (i = 1;i <= n - m;i++)
	   {
		c = a[m] + a[i + m];
		d = d + 1;
		b[d] = c;
	   }
	  }
	  for (i = 1;i <= d;i++)
	  {
		if (b[i] == k)
		{
		 System.out.print("yes");
		 break;
		}
	   else if (i == d)
	   {
		System.out.print("no");
	   }
	  }
	 return 0;
	}



}

