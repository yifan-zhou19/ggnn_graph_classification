package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int flag = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i < n;i++)
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
		a[n] = Integer.parseInt(tempVar3);
	}
	System.out.printf("%d",a[1]);
	for (i = 2;i <= n;i++)
	{
		for (j = 1;j < i;j++)
		{
	if (a[j] == a[i])
	{
		flag = 0;
	}
		}
	if (flag == 1)
	{
		System.out.printf(",%d",a[i]);
	}
	flag = 1;
	}
	}
}

