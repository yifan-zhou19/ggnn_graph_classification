package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	for (int i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i - 1] = Integer.parseInt(tempVar3);
	}
	b[i - 1] = a[i - 1];
	}
	int c = 0;
	for (int i = 1;i <= n;i++)
	{
	   for (int t = i + 1;t <= n;t = t++)
	   {
	  if ((a[i - 1] + b[t - 1]) == k)
	  {
		  c = 1;
	  }
	   }
	}
	if (c == 1)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}
}

