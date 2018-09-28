package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int a;
	//		int b;
	//		char c;
	//		char d;
	//		int e;
	//		int sum;
	//	};
		student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int n;
		int i;
		int am = 0;
		int max;
		String f = new String(new char[20]);
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
				st[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				st[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				st[i].c = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				st[i].d = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				st[i].e = tempVar7;
			}
			st[i].sum = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (st[i].a > 80 && st[i].e > 0)
			{
			st[i].sum = st[i].sum + 8000;
			}
			if (st[i].a > 85 && st[i].b > 80)
			{
			st[i].sum = st[i].sum + 4000;
			}
			if (st[i].a > 90)
			{
			st[i].sum = st[i].sum + 2000;
			}
			if (st[i].a > 85 && st[i].d == 'Y')
			{
			st[i].sum = st[i].sum + 1000;
			}
			if (st[i].b > 80 && st[i].c == 'Y')
			{
			st[i].sum = st[i].sum + 850;
			}
			am = am + st[i].sum;
		}
		max = st[0].sum;
		for (i = 0;i < n;i++)
		{
		   if (max < st[i].sum)
		   {
			   max = st[i].sum;
			   f = st[i].name;
		   }
		}
		System.out.printf("%s\n%d\n%d",f,max,am);
		return 0;
	}
}

