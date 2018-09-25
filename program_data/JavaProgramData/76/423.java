package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[10000];
	   int[] b = new int[10000];
	   int i;
	   int c = 10000;
	   int d = 1;
	   double k;
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
		   if (a[i] <= c)
		   {
			   c = a[i];
		   }
	   }
		   for (i = 0;i < n;i++)
		   {
			   if (b[i] >= d)
			   {
				   d = b[i];
			   }
		   }
		   //printf("%d %d\n",c,d);
			   for (k = c;k < d;k = k + 0.5)
			   {
				 //printf("%f:",k);
				  for (i = 0;i < n;i++)
				  {
				   if (a[i] <= k != 0 && k <= b[i])
				   {
					  //printf("%d\n",i);                  
					  break;
				   }
				  }
				  if (i == n)
				  {
					   break;
				  }
			   }
			   if (k == d)
			   {
				   System.out.printf("%d %d",c,d);
			   }
			   else
			   {
				   System.out.print("no");
			   }
			   return 0;
	}


}

