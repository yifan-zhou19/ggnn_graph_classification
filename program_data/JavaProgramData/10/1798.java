package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[k];
	   int[] b = new int[k];
	   for (i = 0;i < k;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	   }
	   b[k - 1] = 1;
	   int d;
	   for (i = k - 2;i >= 0;i--)
	   {
		   d = 0;
		 b[i] = 1;
		 for (j = i + 1;j < k;j++)
		 {
			  if (a[i] >= a[j])
			  {
			if (d < b[j])
			{
			 d = b[j];
			}
			  }
		 }
		  b[i] = 1 + d;
	   }
	   for (i = 0;i < k;i++)
	   {
	   if (d < b[i])
	   {
	   d = b[i];
	   }
	   }
	   System.out.printf("%d",d);
	}
}

