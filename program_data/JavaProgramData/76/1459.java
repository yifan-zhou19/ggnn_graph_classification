package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int s;
	int e;
	int m;
	int flag;
	int[] a = new int[10001];
	int[] b = new int[10001];
	int[] c = new int[10001];
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
			(a[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(b[i]) = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (s = a[i];s < b[i];s++)
		{
			c[s] = 1;
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a[0] >= a[i])
		{
			a[0] = a[i];
		}
		if (b[0] <= b[i])
		{
			b[0] = b[i];
		}
	}
	for (s = a[0];s < b[0];s++)
	{
		if (c[s] != 1)
		{
			flag = 0;
			break;
		}
		else
		{
			flag = 1;
		}
	}
	if (flag == 0)
	{
		System.out.print("no");
	}
	if (flag == 1)
	{
		System.out.printf("%d %d",a[0],b[0]);
	}
	return 0;
	}



}

