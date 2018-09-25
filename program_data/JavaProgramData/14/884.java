package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int ID;
	//		int chinese;
	//		int math;
	//		int total;
	//	}
	//	stu1,stu2,stu3,temp;
		int i;
		int n;
		stu1.total = 0;
		stu2.total = 0;
		stu3.total = 0;
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
				temp.ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp.chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp.math = tempVar4;
			}
			temp.total = temp.chinese + temp.math;
			if (temp.total > stu1.total)
			{
				stu3 = stu2;
				stu2 = stu1;
				stu1 = temp;
			}
			else if (temp.total <= stu1.total && temp.total> stu2.total)
			{
				stu3 = stu2;
				stu2 = temp;
			}
			else if (temp.total <= stu2.total && temp.total> stu3.total)
			{
				stu3 = temp;
			}
		}
		System.out.printf("%d %d\n",stu1.ID,stu1.total);
		System.out.printf("%d %d\n",stu2.ID,stu2.total);
		System.out.printf("%d %d\n",stu3.ID,stu3.total);
	}
}

