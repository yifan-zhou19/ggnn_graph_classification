package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char name[20];
	//	int final;
	//	int classes;
	//	char duty;
	//	char west;
	//	int text;
	//};
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	int n;
	int i;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] num = new int[100];
	int all = 0;
	int[] a = new int[100];
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
		   stu[i].final = tempVar3;
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   stu[i].classes = tempVar4;
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   stu[i].duty = tempVar5;
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   stu[i].west = tempVar6;
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   stu[i].text = tempVar7;
	   }
	}

	for (i = 0;i < n;i++)
	{
		 if (stu[i].text > 0 && stu[i].final > 80)
		 {
			 num[i] = num[i] + 8000;
		 }
		 if (stu[i].classes > 80 && stu[i].final > 85)
		 {
			 num[i] = num[i] + 4000;
		 }
		 if (stu[i].final > 90)
		 {
			 num[i] = num[i] + 2000;
		 }
		 if (stu[i].west == 'Y' && stu[i].final > 85)
		 {
			 num[i] = num[i] + 1000;
		 }
		 if (stu[i].classes > 80 && stu[i].duty == 'Y')
		 {
			 num[i] = num[i] + 850;
		 }
	}
	for (i = 0;i < n;i++)
	{
		a[i] = num[i];
		all = all + num[i];
	}
	for (i = 0;i < n - 1;i++)
	{
		if (a[i] > a[i + 1])
		{
			a[i + 1] = a[i];
		}
	}
	for (i = 0;i < n;i++)
	{
		if (num[i] == a[n - 1])
		{
			t = i;
		break;
		}
	}
	System.out.printf("%s\n%d\n%d\n",stu[t].name,num[t],all);
	}
}

