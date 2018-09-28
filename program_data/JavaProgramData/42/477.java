package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int[] a = new int[1000000];
			int t = 0;
			int i;
			int j;
			int n;
			int m;
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
		m = Integer.parseInt(tempVar3);
	}
	for (i = 0,t = 0;i < n;i++)
	{
		if (a[i] == m)
		{
			continue;
		}
		else
		{
			a[n + t] = a[i];
			t++;
		}
	}
	for (i = n;i < n + t - 1;i++)
	{
		System.out.printf("%ld ",a[i]);
	}
	if (t != 0)
	{
	System.out.printf("%ld",a[n + t - 1]);
	}
	}

}

