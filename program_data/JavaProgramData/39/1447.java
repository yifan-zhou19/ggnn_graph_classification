package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		int max;
		double[] A = new double[200];
		double sum;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[50];
	//		int AP;
	//		int EP;
	//		char L;
	//		char D;
	//		int paper;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(200);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].AP = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].EP = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].L = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].D = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			if (stu[i].AP > 80 && stu[i].paper > 0)
			{
				s = s + 8000;
			}
			if (stu[i].AP > 85 && stu[i].EP > 80)
			{
				s = s + 4000;
			}
			if (stu[i].AP > 90)
			{
				s = s + 2000;
			}
			if (stu[i].AP > 85 && stu[i].D == 'Y')
			{
				s = s + 1000;
			}
			if (stu[i].EP > 80 && stu[i].L == 'Y')
			{
				s = s + 850;
			}
			A[i] = s;
		}
		for (i = 0,max = 0,sum = 0;i < n;i++)
		{
			if (A[i] > A[max])
			{
				max = i;
			}
			sum = sum + A[i];

		}
		System.out.printf("%s\n%.lf\n%.lf\n",stu[max].name,A[max],sum);
	}

}

