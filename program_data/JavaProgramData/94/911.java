package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   int n;
	   int i;
	   int d;
	   int k;
	   int c;
	   int j;
	   int e;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[100];
	   d = 0;
	   c = 0;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (a[i] % 2 != 0)
		   {
			  d++;
		   }
	   }
	   for (k = 0;k < d;k++)
	   {
		   for (i = c;i < n;i++)
		   {
			  if (a[i] % 2 != 0)
			  {
				 b[k] = a[i];
				 c = i + 1;
				 break;
			  }
			  c = i + 1;
		   }
	   }
	   for (i = 0;i < d - 1;i++)
	   {
		  for (k = 0;k < d - i - 1;k++)
		  {
			 if (b[k] > b[k + 1])
			 {
			   e = b[k];
			   b[k] = b[k + 1];
			   b[k + 1] = e;
			 }
		  }
	   }
		for (i = 0;i < d;i++)
		{
		   if (i != d - 1)
		   {
		   System.out.printf("%d,",b[i]);
		   }
		   else
		   {
		   System.out.printf("%d",b[i]);
		   }
		}
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   n = Integer.parseInt(tempVar3);
		   }
		return 0;
	   }

}

