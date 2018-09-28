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
	   int f;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[n];
	   f = 1;
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
	   for (i = 0;i < n - 1;i++)
	   {
		   for (k = 0;k < n - i - 1;k++)
		   {
			  if (a[k] > a[k + 1])
			  {
				 c = a[k];
				 d = b[k];
				 a[k] = a[k + 1];
				 b[k] = b[k + 1];
				 a[k + 1] = c;
				 b[k + 1] = d;
			  }
		   }
	   }
		e = b[0];
		for (i = 0;i < n - 1;i++)
		{
			if (e < a[i + 1])
			{
			   System.out.print("no");
			   f = 2;
			   break;
			}
			if (e >= a[i + 1] != 0 && e < b[i + 1])
			{
			   e = b[i + 1];
			}
		}
		if (f == 1)
		{
		System.out.printf("%d %d",a[0],e);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	   }

}

