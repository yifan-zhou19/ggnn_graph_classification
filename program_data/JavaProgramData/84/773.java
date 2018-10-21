package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int max;
		int imax;
		int i;
		int n;
		int temp;
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
	  max = 0;
	  for (i = 0;i < n;i++)
	  {
	  if (a[max] < a[i])
	  {
		  max = i;
		  //a[0]=a[i];  
	  }
	  }

	  //
	  temp = a[0];
	  a[0] = a[max];
	  a[max] = temp;

	imax = a[1];
	  for (i = 1;i < n;i++)
	  {
	   if (imax < a[i])
	   {
	  imax = a[i];
	   }
	  }
	System.out.printf("%d\n%d",a[0],imax);
		return 0;
	}
}

