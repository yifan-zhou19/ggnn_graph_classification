package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] a = new int[N];
	int[] b = new int[N];
	int i;
	int j;
	int flag = 0;
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
	System.out.print(" ");
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	b[i] = a[i];
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = i;j < n;j++)
	{
	if (a[i] + b[j] == k)
	{
	flag = 1;
	break;
	}
	}
	}
	System.out.print("\n");
	if (flag == 1)
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

