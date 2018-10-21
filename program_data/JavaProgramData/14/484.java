package <missing>;

public class GlobalMembers
{
		 public static int Main()
		 {
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Stu
	//	{
	//		   int num;
	//		   int sco[2];
	//		   int sum;
	//	};
	   Stu[] stu = tangible.Arrays.initializeWithDefaultStuInstances(5);
	   Stu temp = new Stu();
	   int i;
	   int j;
	   int n;
	   int m;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n >= 3)
	   {
	   for (i = 0;i < 3;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu[i].num = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 stu[i].sco[0] = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 stu[i].sco[1] = tempVar4;
		 }
		 stu[i].sum = stu[i].sco[0] + stu[i].sco[1];
	   }
		for (k = 1;k <= n - 3;k++)
		{
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  stu[3].num = tempVar5;
		  }
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  stu[3].sco[0] = tempVar6;
		  }
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  stu[3].sco[1] = tempVar7;
		  }
		  stu[3].sum = stu[3].sco[0] + stu[3].sco[1];
		  m = 0;
		  for (j = 1;j <= 2;j++)
		  {
			if (stu[m].sum > stu[j].sum || (stu[m].sum == stu[j].sum && stu[m].num < stu[j].num))
			{
			m = j;
			}
		  }
			if (stu[3].sum > stu[m].sum)
			{
			stu[m] = stu[3];
			}
		}
	   }
		for (i = 0;i < 2;i++)
		{
	   for (j = i + 1;j < 3;j++)
	   {
	   if (stu[i].num > stu[j].num)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
		 temp.copyFrom(stu[i]);
		 stu[i] = stu[j];
		 stu[j] = temp;
	   }
	   }
		}
	   for (i = 0;i < 2;i++)
	   {
	   for (j = i + 1;j < 3;j++)
	   {
	   if (stu[i].sum < stu[j].sum)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
		 temp.copyFrom(stu[i]);
		 stu[i] = stu[j];
		 stu[j] = temp;
	   }
	   }
	   }
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
		return 0;
		 }

}

