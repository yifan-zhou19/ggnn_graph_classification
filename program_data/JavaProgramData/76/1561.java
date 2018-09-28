package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[10000];
	int[] b = new int[10000];
	int[] c = new int[10001];
	int i;
	int n;
	int m;
	int s;
	int p;
	int q = 1;
	for (i = 0;i < 10001;i++)
	{
		c[i] = 1;
	}
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		for (m = a[i];m < b[i];m++)
		{
		c[m] = 0;
		}
	}
	for (i = 0;i < 10001;i++)
	{
		if (c[i] == 0)
		{
		s = i;
		break;
		}
	}
	for (i = 10000;i >= 0;i--)
	{
		if (c[i] == 0)
		{
			p = i + 1;
		break;
		}
	}
	for (i = s;i < p;i++)
	{
		if (c[i] != 0)
		{
		 q = 0;
		break;
		}
	}
	if (q == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",s,p);
	}

			return 0;
	}
}

