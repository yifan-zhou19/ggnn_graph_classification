package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int c;
		int d;
		int t;
		int z;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		int num;
	//		int b;
	//		int c;
	//		int d;
	//	}
	//	a[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].c = tempVar4;
			}
			a[i].d = a[i].b + a[i].c;
		}
		for (j = 0;j < 2;j++)
		{
			for (i = 0;i < 2 - j;i++)
			{
				if (a[i].d < a[i + 1].d)
				{
					t = a[i].d;
					z = a[i].num;
					a[i].d = a[i + 1].d;
					a[i].num = a[i + 1].num;
					a[i + 1].d = t;
					a[i + 1].num = z;
				}
			}
		}
		for (i = 3;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[3].num = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				a[3].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[3].c = tempVar7;
			}
			a[3].d = a[3].b + a[3].c;
					if (a[3].d > a[0].d)
					{
					a[2] = a[1];
					a[1] = a[0];
					a[0] = a[3];
					}
				else if (a[3].d > a[1].d)
				{
					a[2] = a[1];
					a[1] = a[3];
				}
				else if (a[3].d > a[2].d)
				{
					a[2] = a[3];
				}
		}
		System.out.printf("%d %d\n",a[0].num,a[0].d);
		System.out.printf("%d %d\n",a[1].num,a[1].d);
		System.out.printf("%d %d\n",a[2].num,a[2].d);
		return 0;
	}

}

