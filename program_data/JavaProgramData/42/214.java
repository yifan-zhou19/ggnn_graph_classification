package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int l;
	int k;
	int j;
	l = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100001];
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
	if (a[i] == k)
	{
		for (j = i;j < n;j++)
		{
	a[j] = a[j + 1];
		}
	l += 1;
	i--;
	}
	}
	n -= l + 1;
	for (i = 0;i < n;i++)
	{
	System.out.printf("%d ",a[i]); //????????????
	}
					  System.out.printf("%d",a[n]); //????????
	}
}

