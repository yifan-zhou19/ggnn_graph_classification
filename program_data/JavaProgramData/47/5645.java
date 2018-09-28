package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] a = new int[100];
	int[] b = new int[100];
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
	   b[i] = a[i];
	}
	for (i = 0;i < n;i++)
	{
	   a[i] = b[n - i - 1];
	}
	System.out.printf("%d",a[0]);
	for (i = 1;i < n;i++)
	{
	   System.out.printf(" %d",a[i]);
	}

	return 0;
	}


}

