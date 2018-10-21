public class student
{
	public int num;
	public int score1; //????
	public int score2; //????
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		   int i;
		   int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct student *p=stu;
		student[] p = new student(stu);
		for (i = 0;i < m;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p.num) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p.score1) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p.score2) = Integer.parseInt(tempVar4);
			}
			p.total = (p.score1 + p.score2);
		}
		int max1;
		int max2;
		int max3;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		max1 = stu[0].total;
		for (i = 0;i < m;i++)
		{
			if (stu[i].total > max1)
			{
				max1 = stu[i].total;
				a1 = i;
			}
		}
		max2 = stu[0].total;
		for (i = 0;i < m;i++)
		{

			if (stu[i].total > max2 && i != a1)
			{
				max2 = stu[i].total;
				a2 = i;
			}
		}
		max3 = stu[0].total;
		for (i = 0;i < m;i++)
		{

			if (stu[i].total > max3 && stu[i].total < max2)
			{
				max3 = stu[i].total;
				a3 = i;
			}
		}
		System.out.printf("%d %d\n",stu[a1].num,stu[a1].total);
		System.out.printf("%d %d\n",stu[a2].num,stu[a2].total);
		System.out.printf("%d %d",stu[a3].num,stu[a3].total);
		return 0;
	}
}

