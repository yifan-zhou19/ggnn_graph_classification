package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		double y;
		double[] c = new double[40];
		double[] d = new double[40];
		int j = 0;
		int k = 0;
		final String t = "male";
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	   char a[10];
	//	   double b;
	//	};
		student[] x = tangible.Arrays.initializeWithDefaultstudentInstances(100);
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
				x[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i].b = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
				   if (strcmp(x[i].a,t) == 0)
				   {
					c[j] = x[i].b;
					j++;
				   }
				else
				{
					  d[k] = x[i].b;
					  k++;
				}
		}
		for (i = 0;i <= j - 1;i++)
		{
				   for (p = i;p <= j - 1;p++)
				   {
					 if (c[i] < c[p])
					 {
						y = c[i];
					c[i] = c[p];
					c[p] = y;
					 }
				   }
		}
		for (i = 0;i <= k - 1;i++)
		{
				   for (p = i;p <= k - 1;p++)
				   {
					 if (d[i] < d[p])
					 {
						y = d[i];
					d[i] = d[p];
					d[p] = y;
					 }
				   }
		}
		 for (i = j - 1;i >= 0;i--)
		 {
		 System.out.printf("%.2f ",c[i]);
		 }
		 for (i = 0;i < k - 1;i++)
		 {
		 System.out.printf("%.2f ",d[i]);
		 }
		 System.out.printf("%.2f",d[k - 1]);
		 return 0;
	}
}

