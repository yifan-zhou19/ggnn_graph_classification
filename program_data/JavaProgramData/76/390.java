package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int min;
		int max;
		int i;
		int j;
		int s;
		int t;
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
	  s = a[0];
	  t = b[0];
	  for (i = 1;i < n;i++)
	  {
		  if (a[i] < s)
		  {
			  s = a[i];
		  }
		  if (b[i] > t)
		  {
			  t = b[i];
		  }
	  }
	 min = a[0];
	 max = b[0];
	 for (j = 0;j < n - 1;j++)
	 {
		for (i = 1;i < n;i++)
		{
		   if (a[i] <= min)
		   {
			   if (b[i] >= max)
			   {
				   max = b[i];
				   min = a[i];
			   }
						   else if (b[i] >= min != 0 && b[i] < max)
						   {
							 min = a[i];
						   }
		   }
		   else if (a[i] > min && a[i] <= max)
		   {
			   if (b[i] > max)
			   {
				   max = b[i];
			   }
		   }
		}
	 }
	if (min == s && max == t)
	{
		System.out.printf("%d %d",s,t);
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}
}

