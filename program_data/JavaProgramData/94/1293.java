package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int li;
		int ri;
		int[] a = new int[501];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	j = -1;
	a[0] = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (m % 2 == 1)
	{
	j++;
	a[j] = m;
	if (j > 0)
	{
		li = j - 1;
		ri = j;
		while ((a[li] > a[ri]) && (li >= 0))
		{
		k = a[ri];
		a[ri] = a[li];
		a[li] = k;
		ri--;
		li--;
		}
	}
	}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",a[j]);
	return 0;
	}
}

