package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stud
	//	{
	//		char na[25];
	//		int ag,cg,l;
	//		int t;
	//		char gb,x;
	//	}
	//	st[101];
		int i;
		int n;
		int num = 0;
		int re;
		int max = 0;
		int total;
		total = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			st[i].t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].na = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				st[i].ag = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].cg = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				st[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				st[i].x = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				st[i].l = tempVar7;
			}
			if ((st[i].ag > 85) && (st[i].x == 'Y'))
			{
				st[i].t = st[i].t + 1000;
			}

			if ((st[i].ag > 85) && (st[i].cg > 80))
			{
				st[i].t = st[i].t + 4000;
			}

			if ((st[i].ag > 80) && (st[i].l >= 1))
			{
				st[i].t = st[i].t + 8000;
			}

			if ((st[i].gb == 'Y') && (st[i].cg > 80))
			{
				st[i].t = st[i].t + 850;
			}

			if (st[i].ag > 90)
			{
				st[i].t = st[i].t + 2000;
			}

			total = (int)(total + st[i].t);
		}

		for (i = 0;i < n;i++)
		{
			if (st[i].t >= max)
			{
			  max = st[i].t;
			  num++;
			  re = i;
			}
		}

		if (num == 1)
		{
			System.out.printf("%s\n%d\n%ld\n",st[re].na,st[re].t,total);
		}
		else
		{
			num = 0;
			for (i = 0;num < 1;i++)
			{
				if (st[i].t == max)
				{
					System.out.printf("%s\n%d\n%d\n",st[i].na,st[i].t,total);
					num++;
				}
			}
		}
		return 0;
	}
}

