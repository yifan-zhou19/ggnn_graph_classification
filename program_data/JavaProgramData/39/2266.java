package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct scholarship
	//{
	//	   char name[200];
	//	   int gpa,mate,paper;
	//	   char official,west;
	//	   }
	//	   stu[100];
	int n;
	int[] sch = new int[100];
	int i;
	int max;
	int sum = 0;
	String num = new String(new char[4]);
	for (i = 0;i < 100;i++)
	{
	   sch[i] = 0;
	}
	num = new Scanner(System.in).nextLine();
	n = Integer.parseInt(num);
	for (i = 0;i < n;i++)
	{
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   stu[i].name = tempVar;
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   stu[i].gpa = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   stu[i].mate = tempVar3;
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar4 != null)
	   {
		   stu[i].official = tempVar4;
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   stu[i].west = tempVar5;
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ");
	   if (tempVar6 != null)
	   {
		   stu[i].paper = tempVar6;
	   }
	}
	for (i = 0;i < n;i++)
	{
	   if (stu[i].gpa > 80 && stu[i].paper >= 1)
	   {
		 sch[i] += 8000;
	   }
	   if (stu[i].gpa > 85 && stu[i].mate > 80)
	   {
		  sch[i] += 4000;
	   }
	   if (stu[i].gpa > 90)
	   {
		  sch[i] += 2000;
	   }
	   if (stu[i].gpa > 85 && stu[i].west == 'Y')
	   {
		 sch[i] += 1000;
	   }
	   if (stu[i].mate > 80 && stu[i].official == 'Y')
	   {
		 sch[i] += 850;
	   }
	}
	max = 0;
	for (i = 0;i < n;i++)
	{
	   if (sch[i] > max)
	   {
		  max = sch[i];
	   }
	}
	for (i = 0;i < n;i++)
	{
	   sum += sch[i];
	}
	for (i = 0;i < n;i++)
	{
	   if (sch[i] == max)
	   {
	   break;
	   }
	}
	System.out.printf("%s\n%d\n%ld\n",stu[i].name,sch[i],sum);
	return 0;
	}

}

