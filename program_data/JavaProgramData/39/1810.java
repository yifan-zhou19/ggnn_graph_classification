package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[100];
	//		int num1,num2;
	//		char c1,c2;
	//		int paper;
	//	}
	//	stu[100];
		int N;
		int sum = 0;
		int i;
		int m;
		int[] b = new int[100];
		int max = 0;
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
				stu[i].num1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].num2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c1 = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].c2 = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			b[i] = 0;
			if (stu[i].num1 > 80 && stu[i].paper > 0)
			{
				b[i] += 8000;
			}
			if (stu[i].num1 > 85 && stu[i].num2 > 80)
			{
				b[i] += 4000;
			}
			if (stu[i].num1 > 90)
			{
				b[i] += 2000;
			}
			if (stu[i].num1 > 85 && stu[i].c2 == 'Y')
			{
				b[i] += 1000;
			}
			if (stu[i].num2 > 80 && stu[i].c1 == 'Y')
			{
				b[i] += 850;
			}
			sum += b[i];
			if (b[i] > max)
			{
				max = b[i];
				m = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[m].name,b[m],sum);
	}



}

