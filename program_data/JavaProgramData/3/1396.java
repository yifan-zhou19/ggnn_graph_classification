package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1000];
	int n;
	int k;
	int l;
	l = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int j;
	int e;
	int ok;
	int i;
	ok = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 1;j < n;j++)
		{
			if ((a[0] + a[j]) == k)
			{
				ok = 1;
			}
		}
		e = a[0];
		a[0] = a[l];
		a[l] = e;
		l++;
	}
	if (ok == 1)
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

