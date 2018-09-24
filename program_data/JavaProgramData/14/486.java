package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int yu;
	//		int shu;
	//	}
	//	a[100000];
		int[] d = new int[100000];
		int i = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].yu = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].shu = tempVar4;
			}
			d[i] = a[i].yu + a[i].shu;
		}
		int q;
		int w;
		int e;
		int h;
		q = 0;
		w = 0;
		e = 0;
		for (i = 0;i < n;i++)
		{
			if (d[q] < d[i])
			{
				q = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (d[q] >= d[i] != 0 && i != q && d[w] < d[i])
			{
				w = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (d[w] >= d[i] != 0 && i != w && i != q && d[e] < d[i])
			{
				e = i;
			}
		}
		System.out.printf("%d %d\n",a[q].num,d[q]);
		System.out.printf("%d %d\n",a[w].num,d[w]);
		System.out.printf("%d %d\n",a[e].num,d[e]);
		return 0;
	}
}

