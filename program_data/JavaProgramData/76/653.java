package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int e;
		int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct qujian
	//{
	//	int a;
	//	int b;
	//}
	//q[n],h;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
	q[i].a = a;
	q[i].b = b;
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n - 1;j++)
		{
			if (q[j].a > q[j + 1].a)
			{
				h = q[j];
				q[j] = q[j + 1];
				q[j + 1] = h;
			}
		}
	}
	e = q[1].b;
	for (i = 0;i <= n;i++)
	{
		for (j = 0;j < i;j++)
		{
		if (e < q[j].b)
		{
			e = q[j].b;
		}
	sz[i] = e;
		}
	}
	for (i = 0;i < n;i++)
	{
		if (sz[i] < q[i].a)
		{
			k = k + 1;
		}
	}
	if (k != 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",q[0].a,sz[n]);
	}
		return 0;
	}



}

