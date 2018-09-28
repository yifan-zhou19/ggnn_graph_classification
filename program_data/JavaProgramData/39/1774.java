package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//	int average;
	//	int classeva;
	//	char leader;
	//	char western;
	//	int paper;
	//	};
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu[i].name = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 stu[i].average = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 stu[i].classeva = tempVar4;
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 stu[i].leader = tempVar5;
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 stu[i].western = tempVar6;
		 }
		 String tempVar7 = ConsoleInput.scanfRead();
		 if (tempVar7 != null)
		 {
			 stu[i].paper = tempVar7;
		 }
	 }
	 int[] sum = new int[100];
	 int max = 0;
	 int total = 0;
	 for (i = 0;i < n;i++)
	 {
			sum[i] = 0;
		 if (stu[i].average > 80 && stu[i].paper >= 1)
		 {
			 sum[i] += 8000;
		 }
		 if (stu[i].average > 85 && stu[i].classeva > 80)
		 {
			 sum[i] += 4000;
		 }
		 if (stu[i].average > 90)
		 {
			 sum[i] += 2000;
		 }
		 if (stu[i].average > 85 && stu[i].western == 'Y')
		 {
			 sum[i] += 1000;
		 }
		 if (stu[i].classeva > 80 && stu[i].leader == 'Y')
		 {
			 sum[i] += 850;
		 }
		 total += sum[i];
		 if (sum[i] > max)
		 {
			 max = sum[i];
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (sum[i] == max)
		 {
			 break;
		 }
	 }
	 System.out.printf("%s\n%d\n%ld",stu[i].name,max,total);
	}
}

