package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct student
	//	{
	//	   int ID;
	//	   int math;
	//	   int chinese;
	//	   int sum;
	//	};
		 int n;
		 int i;
		 int t;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		 for (i = 0;i < n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].math = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].chinese = tempVar4;
			}
		 }
		 for (i = 0;i < n;i++)
		 {
			stu[i].sum = stu[i].math + stu[i].chinese;
		 }
		 for (i = 0;i < 3;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {

			   if (stu[j].sum > stu[i].sum)
			   {
				   t = stu[i].sum;
				   stu[i].sum = stu[j].sum;
				   stu[j].sum = t;
				t = stu[i].ID;
				stu[i].ID = stu[j].ID;
				stu[j].ID = t;
			   }
			 }

		 }
		 for (i = 0;i < 3;i++)
		 {
		 System.out.printf("%d %d\n",stu[i].ID,stu[i].sum);
		 }

	}

}

