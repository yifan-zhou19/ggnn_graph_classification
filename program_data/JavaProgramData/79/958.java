package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int l = 0;
		int i;
		int j;
		int k;
		int t;
	p = m[0],q = n[0];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		q = Integer.parseInt(tempVar2);
	}
	while (*p != 0 || *q != 0)
	{
		p++,q++;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			q = Integer.parseInt(tempVar4);
		}
		l++;
	}
	l--;

	for (j = 0;j < l;j++)
	{
		k = 0,t = 0;
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;t < m[j] - 1;i++)
		{
			if (a[i] == 0)
			{
				k++;
			}
			if (k >= n[j])
			{
				a[i]++;
				k = 0;
				t++;
			}
			if (i >= m[j] - 1)
			{
				i = -1;
			}
		}
		i = 0;
		while (a[i] != 0 && i < m[j])
		{
			i++;
		}
		System.out.printf("%d\n",i + 1);
	}
	return 0;
	}
}

