package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[300];
	int i;
	int k;
	int q;
	int w;
	int[] b = new int[300];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	q = 0;
	w = 0;
	b[0] = a[0];
	for (i = 1;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	w = 0;
	for (k = 0;k < i;k++)
	{
		if (a[i] == a[k])
		{
			w = 1;
		}
	}
	if (w == 0)
	{
	q++;
	b[q] = a[i];
	}
	}

	for (i = 0;i < q;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[q]);
		return 0;
	}

}

