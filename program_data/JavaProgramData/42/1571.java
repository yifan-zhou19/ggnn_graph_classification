package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100000];
	int i;
	int n;
	int k;
	int b;
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] != k)
	{
	b = a[0];
	a[0] = a[i];
	a[i] = b;
	break;
	}
	}
	System.out.printf("%d",a[0]);
	for (i = 1;i < n;i++)
	{
		if (a[i] != k)
		{
			System.out.printf(" %d",a[i]);
		}
	}
	return 0;
	}


}

