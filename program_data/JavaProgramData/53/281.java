package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[300];
	   int i;
	   int n;
	   int j;
	   int s = 0;
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
	   }
	   System.out.printf("%d,",a[0]);
	   for (j = 1;j < n;j++)
	   {
		   for (i = 0;i < j;i++)
		   {
			   if (a[j] != a[i])
			   {
				   if (i == j - 1)
				   {
					   if (j > s)
					   {
						   s = j;
					   }
				   }
			   }
			   else
			   {
				   break;
			   }
		   }
	   }
	   for (j = 1;j <= s;j++)
	   {
	   for (i = 0;i < j;i++)
	   {
			   if (a[j] != a[i])
			   {
				 if (i == j - 1 && j < s)
				 {
					 System.out.printf("%d,",a[j]);
				 }
				 else if (i == j - 1 && j == s)
				 {
					 System.out.printf("%d",a[j]);
				 }
			   }
		   else
		   {
			   break;
		   }
	   }
	   }
	}
}

