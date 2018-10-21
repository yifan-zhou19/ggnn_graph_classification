package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id;
	//		float yuwen,shuxue,sum;
	//	}
	//	stu[100000],t;
		int n;
		int i;
		int j;
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
				  stu[i].id = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  stu[i].yuwen = tempVar3;
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  stu[i].shuxue = tempVar4;
			  }
		   stu[i].sum = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
		  for (j = n - 1;j > i;j--)
		  {
			   if (stu[j].sum > stu[j - 1].sum)
			   {
			   t = stu[j];
			   stu[j] = stu[j - 1];
			   stu[j - 1] = t;
			   }
		  }
		}
		for (i = 0;i < 3;i++)
		{
		 System.out.printf("%d %g\n",stu[i].id,stu[i].sum);
		}
	}
}

