package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] v = new int[50000];
	int[] w = new int[50000];
	int e;
	int f;
	int m;
	int a;
	int x;
	int r;
	for (int i = 0;i < n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (v[i]) = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (w[i]) = Integer.parseInt(tempVar3);
		 }
	}
	   for (int c = 0;c < n - 1;c++)
	   {
			 for (m = 0;m < n - 1 - c;m++)
			 {
			   if (v[m] > v[m + 1])
			   {
				 e = v[m];
			  v[m] = v[m + 1];
			  v[m + 1] = e;
			  f = w[m];
			  w[m] = w[m + 1];
			  w[m + 1] = f;
			   }
			 }
	   }


	for (int g = 0;g < n - 1;g++)
	{
	   if (v[g + 1] <= w[g])
	   {
		  if (w[g + 1] <= w[g])
		  {
			  w[g + 1] = w[g];
			  r = g;
		  }
	   }

	   else
	   {
		   System.out.print("no");
		   {
			   break;
		   }
	   }
	}

	if (r == n - 2)
	{
		System.out.printf("%d %d",v[0],w[n - 1]);
	}


	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		x = Integer.parseInt(tempVar4);
	}
	return 0;
	}

}

