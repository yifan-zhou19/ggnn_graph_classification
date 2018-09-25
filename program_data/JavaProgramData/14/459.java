package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct student
	//   {
	//	   int ID,Chinese,math,sum;
	//   }
	//   stu[100000],temp1,temp2,temp3;
	   int n;
	   int i;
	   int j;
	   int k;
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
			   stu[i].ID = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   stu[i].Chinese = tempVar3;
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   stu[i].math = tempVar4;
		   }
		   stu[i].sum = stu[i].Chinese + stu[i].math;
	   }
	   temp1 = stu[0];
	   for (i = 1;i < n - 1;i++)
	   {
	   if (stu[i].sum > temp1.sum)
	   {
	   temp1 = stu[i];
	   }
	   }
	   System.out.printf("%d %d\n",temp1.ID,temp1.sum);
	   if (temp1.ID == stu[0].ID)
	   {
		   temp2 = stu[1];
	   }
	   else
	   {
		   temp2 = stu[0];
	   }
	   for (i = 1;i < n - 1;i++)
	   {
		   if (stu[i].ID == temp1.ID)
		   {
			   continue;
		   }
		else if (stu[i].sum > temp2.sum)
		{
			temp2 = stu[i];
		}
	   }
		System.out.printf("%d %d\n",temp2.ID,temp2.sum);
		for (i = 0;i < n;i++)
		{
		if (stu[i].ID == temp1.ID || stu[i].ID == temp2.ID)
		{
		stu[i].sum = 0;
		}
		}
		temp3 = stu[0];
		for (i = 1;i < n - 1;i++)
		{
	   if (stu[i].sum > temp3.sum)
	   {
	   temp3 = stu[i];
	   }
		}
	   System.out.printf("%d %d\n",temp3.ID,temp3.sum);
	   return 0;
	}

}

