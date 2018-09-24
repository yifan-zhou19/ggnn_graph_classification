package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct stu
	//   {
	//	   char a[20];
	//	int chj;
	//	int pin;
	//	char gb;
	//	char xb;
	//	int lunwen;
	//	int reward;
	//	};
	  stu[] student = tangible.Arrays.initializeWithDefaultstuInstances(100);
	  int i;
	  int n;
	  int jishu;
	  int sum = 0;
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
		   student[i].a = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   student[i].chj = tempVar3;
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   student[i].pin = tempVar4;
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   student[i].gb = tempVar5;
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   student[i].xb = tempVar6;
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   student[i].lunwen = tempVar7;
	   }
	 }
	for (i = 0;i < n;i++)
	{
	 student[i].reward = 0;
	}
	for (i = 0;i < n;i++)
	{
		  if (student[i].chj > 80 && student[i].lunwen > 0)
		  {
		 student[i].reward = student[i].reward + 8000;
		  }

		 if (student[i].chj > 85 && student[i].pin > 80)
		 {
			student[i].reward = student[i].reward + 4000;
		 }

		 if (student[i].chj > 90)
		 {
			student[i].reward = student[i].reward + 2000;
		 }

		 if (student[i].chj > 85 && student[i].xb == 'Y')
		 {
			student[i].reward = student[i].reward + 1000;
		 }

		 if (student[i].pin > 80 && student[i].gb == 'Y')
		 {
			student[i].reward = student[i].reward + 850;
		 }
	}
	   jishu = 0;
	for (i = 0;i < n;i++)
	{
		  if (student[i].reward > student[jishu].reward)
		  {
		 jishu = i;
		  }
	}
	   for (i = 0;i < n;i++)
	   {
			sum = sum + student[i].reward;
	   }
	System.out.printf("%s\n%d\n%d\n",student[jishu].a,student[jishu].reward,sum);

	}
}

