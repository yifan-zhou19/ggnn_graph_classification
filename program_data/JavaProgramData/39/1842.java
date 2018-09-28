package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct student
	//{
	//	char name[20];
	// int g1;
	// int g2;
	// char c;
	// char w;
	// int p;
	//}
	//stu[100];
	 int n;
	 int[] s = new int[100];
	 int total = 0;
	 int max = 0;
	 int i;
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
		 stu[i].name = tempVar2;
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 stu[i].g1 = tempVar3;
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 stu[i].g2 = tempVar4;
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar5 != null)
	 {
		 stu[i].c = tempVar5;
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar6 != null)
	 {
		 stu[i].w = tempVar6;
	 }
	 String tempVar7 = ConsoleInput.scanfRead(" ");
	 if (tempVar7 != null)
	 {
		 stu[i].p = tempVar7;
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
		if (stu[i].g1 > 80 && stu[i].p >= 1)
		{
			s[i] = s[i] + 8000;
		}
	 if (stu[i].g1 > 85 && stu[i].g2 > 80)
	 {
		 s[i] = s[i] + 4000;
	 }
	 if (stu[i].g1 > 90)
	 {
		 s[i] = s[i] + 2000;
	 }
	 if (stu[i].g1 > 85 && stu[i].w == 'Y')
	 {
		 s[i] = s[i] + 1000;
	 }
	 if (stu[i].g2 > 80 && stu[i].c == 'Y')
	 {
		 s[i] = s[i] + 850;
	 }
	 total = total + s[i];
	 }
	 for (i = 1;i < n;i++)
	 {
	 if (s[i] > s[max])
	 {
		 max = i;
	 }
	 }
	 System.out.printf("%s\n",stu[max].name);
	 System.out.printf("%d\n",s[max]);
	 System.out.printf("%d\n",total);
	 return 0;
	}

}

