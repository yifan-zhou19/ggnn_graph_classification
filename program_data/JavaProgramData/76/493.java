package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (a[i]) = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   (b[i]) = Integer.parseInt(tempVar3);
		   }
		}
		for (k = 0;k < n;k++)
		{
		   for (i = 0;i < n - k - 1;i++)
		   {
			  if (a[i] > a[i + 1])
			  {
				t = a[i + 1];
				a[i + 1] = a[i];
				a[i] = t;
			  }
			  if (b[i] > b[i + 1])
			  {
				t = b[i + 1];
				b[i + 1] = b[i];
				b[i] = t;
			  }
		   }
		}
		 for (i = 0;i < n - 1;i++)
		 {
			 if (b[i] >= a[i + 1])
			 {
				  e++;
			 }
		 }
		 if (e < n - 1)
		 {
		   System.out.print("no");
		 }
		   else
		   {
		  System.out.printf("%d %d",a[0],b[n - 1]);
		   }
		  return 0;
	}
}

