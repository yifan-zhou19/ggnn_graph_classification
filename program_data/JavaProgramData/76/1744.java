package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int e1;
	int e2;
	int t;
	int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//	int a;
	//	int b;
	//	}
	//	p[60000];
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
			p[i].a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[i].b = tempVar3;
		}
	}
	for (k = 1;k <= n;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			if (p[i].a > p[i + 1].a)
			{
				e1 = p[i + 1].a;
				p[i + 1].a = p[i].a;
				p[i].a = e1;
				e2 = p[i + 1].b;
				p[i + 1].b = p[i].b;
				p[i].b = e2;
			}
		}
	}
	for (i = 1;i < n;i++)
	{
		for (t = 0;t < i;t++)
		{
			if (p[i].a <= p[t].b)
			{
				break;
			}
			while (t == i - 1)
			{
				if (p[i].a > p[t].b)
				{
					System.out.print("no");
					return 0;
				}
			}
		}
	}
	max = 0;
	for (i = 0;i < n;i++)
	{
	if (p[i].b > max)
	{
	max = p[i].b;
	}
	}
	System.out.printf("%d %d",p[0].a,max);
	return 0;
	}
}

