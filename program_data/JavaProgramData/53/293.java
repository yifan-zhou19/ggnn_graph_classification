package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] b = new int[301];
	  int[] a = new int[301];
	  int i;
	  int n;
	  int j;
	  int k;
	  int count;
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
	  /*for (i=0;i<n;i++)
	  {
	    printf("%d ",a[i]);
	  }*/
	  b[0] = a[0];
	  for (i = 1,j = 1;i < n;i++)
	  {
		for (k = 0,count = 0;k < i;k++)
		{
			   if (a[k] != a[i])
			   {
			  count++;
			   }
		}
		if (count == i)
		{
			b[j] = a[i];
			j++;
		}
	  }
	   for (i = 0;i < j;i++)
	   {
		 System.out.printf("%d",b[i]);
		 if (i != j - 1)
		 {
		 System.out.print(",");
		 }
	   }

	   return 0;
	}
}

