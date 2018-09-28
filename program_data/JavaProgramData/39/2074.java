package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[21];
	//		int qm;
	//		int cm;
	//		char xs[21];
	//		char west[21];
	//		int paper;
	//		int sp;
	//	};
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(101);
		int i;
		int n;
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
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].cm = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i].xs = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].paper = tempVar7;
			}
			a[i].sp = 0;
			if ((a[i].qm > 80) && (a[i].paper > 0))
			{
				a[i].sp += 8000;
			}
			if ((a[i].qm > 85) && (a[i].cm > 80))
			{
				a[i].sp += 4000;
			}
			if (a[i].qm > 90)
			{
				a[i].sp += 2000;
			}
			if ((a[i].qm > 85) && (a[i].west[0] == 'Y'))
			{
				a[i].sp += 1000;
			}
			if ((a[i].cm > 80) && (a[i].xs[0] == 'Y'))
			{
				a[i].sp += 850;
			}
		}
		int max;
		int total;
		max = 0;
		total = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i].sp > a[max].sp)
			{
				max = i;
			}
			total = total + a[i].sp;
		}
		System.out.printf("%s\n",a[max].name);
		System.out.printf("%d\n",a[max].sp);
		System.out.printf("%d\n",total);
		return 0;
	}

}

