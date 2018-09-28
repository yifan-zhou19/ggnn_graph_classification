package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int t;
		int k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}

	p = a[n - m];
	for (i = n - m;i < n;i++)
	{
		b[i - n + m] = (p++);
	}

	for (j = 0;j < m;j++)
	{
		for (i = j,t = a[i];i < n;i++)
		{
			k = a[i + 1];
			a[i + 1] = t;
			t = k;
		}
	}

	for (i = 0;i < m;i++)
	{
		a[i] = b[i];
	}

	System.out.printf("%d",a[0]);
	for (p = a[1], i = 1;i < n;i++)
	{
		System.out.printf(" %d",*(p++));
	}
	System.out.print("\n");
	return 0;
	}
}

