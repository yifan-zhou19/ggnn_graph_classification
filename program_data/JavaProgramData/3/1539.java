package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
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
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	b[i] = k - a[i];
	}
	int m = 0;
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[j] == a[i])
	{
		m++;
	}
	}
	}
	if (m > 0)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	}


}

