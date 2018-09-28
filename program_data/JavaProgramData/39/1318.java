package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//		int end;
	//		int cls;
	//		char lead;
	//		char west;
	//		int pap;
	//		int sum;
	//	}
	//	std[100];
		int n;
		int i;
		int j;
		int summ = 0;
		int k = 0;
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
				std[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				std[i].end = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				std[i].cls = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				std[i].lead = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				std[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				std[i].pap = tempVar7;
			}
			std[i].sum = 0;
			if ((std[i].end > 80) && (std[i].pap >= 1))
			{
				SS = SS + 8000;
			}
			if ((S.end > 85) && (S.cls > 80))
			{
				SS = SS + 4000;
			}
			if (S.end > 90)
			{
				SS = SS + 2000;
			}
			if ((S.end > 85) && (S.west == 'Y'))
			{
				SS = SS + 1000;
			}
			if ((S.cls > 80) && (S.lead == 'Y'))
			{
				SS = SS + 850;
			}
			summ = summ + SS;
		}
		for (i = 0;i < n;i++)
		{
			if (SS > k)
			{
				k = SS;
				j = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",std[j].name,std[j].sum,summ);
	}
}

