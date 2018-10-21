package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int sum;
	int flag;
	int[] a = new int[1000];
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[0] = Integer.parseInt(tempVar3);
	}
	flag = 0;
	for (i = 1;i <= n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		a[i] = Integer.parseInt(tempVar4);
	}
	for (j = 0;j < i;j++)
	{
	sum = a[i] + a[j];
	if (sum == k)
	{
	System.out.print("yes");
	flag = 1;
	break;
	}
	if (flag == 1)
	{
	break;
	}
	}
	if (flag == 1)
	{
	break;
	}
	}
	if (flag == 0)
	{
	System.out.print("no");
	}
	}
}

