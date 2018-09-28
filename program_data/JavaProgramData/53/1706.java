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
	   int[] a = new int[400];
	   int[] b = new int[400];
	   int i;
	   int j;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   System.out.printf("%d",a[0]);
	   for (i = 1;i < n;i++)
	   {
		   for (j = 0;j < i;j++)
		   {
			   if (a[i] == a[j])
			   {
				   b[i]++;
			   }
		   }
	   }
	   for (i = 1;i < n;i++)
	   {
		   if (b[i] == 0)
		   {
			   System.out.printf(",%d",a[i]);
		   }
	   }
		return 0;
	}
}

