package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j = 0;
	   int k;
	   int p;
	   double[] b = new double[40];
	   double e;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct a
	//   {
	//	   char s[8];
	//	   double t;
	//   }
	//   a[40];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i].s = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   a[i].t = tempVar3;
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (strcmp(a[i].s,"male") == 0)
		   {
			   b[j] = a[i].t;
			   j++;
		   }
	   }
	   for (k = 1;k < j;k++)
	   {
			 for (p = 0;p < j - k;p++)
			 {
				   if (b[p] > b[p + 1])
				   {
					   e = b[p];
					   b[p] = b[p + 1];
					   b[p + 1] = e;
				   }
			 }
	   }
		System.out.printf("%.2lf",b[0]);
		for (i = 1;i < j;i++)
		{
		System.out.printf(" %.2lf",b[i]);
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
		   if (strcmp(a[i].s,"female") == 0)
		   {
			   b[j] = a[i].t;
			   j++;
		   }
		}
		for (k = 1;k < j;k++)
		{
			 for (p = 0;p < j - k;p++)
			 {
				   if (b[p] < b[p + 1])
				   {
					   e = b[p];
					   b[p] = b[p + 1];
					   b[p + 1] = e;
				   }
			 }
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf(" %.2lf",b[i]);
		}
		return 0;
	}












}

