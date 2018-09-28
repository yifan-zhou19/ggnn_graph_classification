package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int max;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stus
	//	{
	//		char as[21],e,f;
	//		int a,b,c,mon;
	//	}
	//	stus[100];
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
				stus[i].as = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stus[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stus[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stus[i].e = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stus[i].f = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stus[i].c = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			stus[i].mon = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (stus[i].a > 80 && stus[i].c >= 1)
			{
				stus[i].mon += 8000;
			}
			if (stus[i].a > 85 && stus[i].b > 80)
			{
				stus[i].mon += 4000;
			}
			if (stus[i].a > 90)
			{
				stus[i].mon += 2000;
			}
			if (stus[i].a > 85 && stus[i].f == 'Y')
			{
				stus[i].mon += 1000;
			}
			if (stus[i].b > 80 && stus[i].e == 'Y')
			{
				stus[i].mon += 850;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (max < stus[i].mon)
			{
				max = stus[i].mon;
			}
			sum += stus[i].mon;
		}
		for (i = 0;i < n;i++)
		{
			if (max == stus[i].mon)
			{
				System.out.printf("%s\n",stus[i].as);
				System.out.printf("%d\n",max);
				System.out.printf("%d\n",sum);
				break;
			}
		}
		return 0;
	}
}

