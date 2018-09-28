package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[305];
	int i = 0;
	int j;
	int[] y = new int[305];
	int k = 0;
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

	i = 0;
	for (i = 0;i < n;i++)
	{
	   if (y[i] == 0)
	   {
		  k++;
		  if (k == 1)
		  {
			  System.out.printf("%d",a[i]);
		  }
		  else
		  {
			  System.out.printf(",%d",a[i]);
		  }
	   }
	   j = i;
	   for (j = i;j < n;j++)
	   {
		  if (a[i] == a[j])
		  {
		  y[j] = 1;
		  }
	   }
	}
	return 0;
	}
}

