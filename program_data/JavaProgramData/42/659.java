package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100000];
	int i;
	int j;
	int n;
	int k;
	int[] p = a;
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
	p = a;
	for (i = n - 1;i >= 0;i--)
	{
		if (p[i] == k) //????????????????????
		{
			for (j = i;j < n;j++)
			{
				p[j] = (p + j + 1);
			}
			n--;
		}
														   //??????????????????
	}
	p = a;
	for (i = 0;i < n - 1;i++)
	{
		System.out.printf("%d ",p[i]);
	}
	System.out.printf("%d",p[n - 1]);
	return 0;
	}
}

