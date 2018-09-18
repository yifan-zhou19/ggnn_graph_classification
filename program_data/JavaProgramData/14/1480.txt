package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int e = 0;
		int max;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//		int a;
	//		int z;
	//		int c;
	//		int d;
	//	}
	//	b[100000];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i].a = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i].z = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i].c = tempVar4;
	}
	b[i].d = b[i].z + b[i].c;
	}
		for (i = 0;i < n;i++)
		{
			max = 0;
	for (j = 0;j < n;j++)
	{
		if (b[j].d > max)
		{
			max = b[j].d;
			y = j;
		}
	}
		System.out.printf("%d %d\n",b[y].a,b[y].d);
		e++;
		b[y].d = 0;
		if (e == 3)
		{
			break;
		}
		}

	}
}

