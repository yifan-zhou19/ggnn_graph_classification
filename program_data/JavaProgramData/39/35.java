package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int i;
		int[] sum = new int[100];
		int total = 0;
		int order;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char name[20];
	//		int results;
	//		int dis;
	//		char iscadre;
	//		char iswest;
	//		int paper;
	//	}
	//	stu[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].results = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].dis = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].iscadre = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].iswest = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			sum[i] = 0;
			if (stu[i].results > 80 && stu[i].paper > 0)
			{
				sum[i] += 8000;
			}
			if (stu[i].results > 85 && stu[i].dis > 80)
			{
				sum[i] += 4000;
			}
			if (stu[i].results > 90)
			{
				sum[i] += 2000;
			}
			if (stu[i].results > 85 && stu[i].iswest == 'Y')
			{
				sum[i] += 1000;
			}
			if (stu[i].dis > 80 && stu[i].iscadre == 'Y')
			{
				sum[i] += 850;
			}
			else
			{
				sum[i] += 0;
			}
			total += sum[i];
		}
		order = 0;
		for (i = 0;i < N;i++)
		{
			if (sum[i] > sum[0])
			{
				order = i;
				sum[0] = sum[i];
			}
		}
		System.out.printf("%s\n",stu[order].name);
		System.out.printf("%d\n",sum[0]);
		System.out.printf("%d\n",total);
	}
}

