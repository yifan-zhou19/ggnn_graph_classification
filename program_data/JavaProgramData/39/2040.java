package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct info
	//	{
	//		char name[20];
	//		int s;
	//	};
		info[] p;

		p = tangible.Arrays.initializeWithDefaultinfoInstances(n);


		char r;
		char q;
		int f1;
		int f2;
		int f3;
		int sum = 0;
		int t = 0;
		int max = 0;


		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i).name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				f1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				f2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				r = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				q = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				f3 = Integer.parseInt(tempVar7);
			}
			p[i].s = 0;
			if (f1 > 80 && f3 > 0)
			{
				p[i].s += 8000;
			}
			if (f1 > 85 && f2 > 80)
			{
				p[i].s += 4000;
			}
			if (f1 > 90)
			{
				p[i].s += 2000;
			}
			if (f1 > 85 && q == 'Y')
			{
				p[i].s += 1000;
			}
			if (f2 > 80 && r == 'Y')
			{
				p[i].s += 850;
			}
			sum += p[i].s;
		}

		for (i = 0;i < n;i++)
		{
			if (max < (p[i].s))
			{
				max = p[i].s;
				t = i;

			}


		}
		System.out.printf("%s\n%d\n%d\n",p[t].name,max,sum);
		return 0;
	}
}

