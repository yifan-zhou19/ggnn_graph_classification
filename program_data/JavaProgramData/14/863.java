package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int max = 0;
		int smax = 0;
		int tmax = 0;
		int[] id = new int[3];
		int a;
		int b;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct student
	//{
	//int No;
	//int yuwen;
	//int math;
	//}
	//stu[100000];
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
			stu[i].No = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			stu[i].yuwen = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stu[i].math = tempVar4;
		}
	}
	for (i = 0;i < n;i++)
	{

			if (max < stu[i].yuwen + stu[i].math)
			{
				max = stu[i].yuwen + stu[i].math;
			id[0] = stu[i].No;
			}
	}
	for (i = 0;i < n;i++)
	{
		if (smax < stu[i].yuwen + stu[i].math && i != id[0] - 1)
		{
				smax = stu[i].yuwen + stu[i].math;
		   id[1] = stu[i].No;
		}
	}

	for (i = 0;i < n;i++)
	{
		if (tmax < stu[i].yuwen + stu[i].math && i != id[0] - 1 && i != id[1] - 1)
		{
				tmax = stu[i].yuwen + stu[i].math;
		   id[2] = stu[i].No;
		}
	}

	a = id[0];
	b = id[1];
	c = id[2];




	System.out.printf("%d %d\n",a,max);
	System.out.printf("%d %d\n",b,smax);
	System.out.printf("%d %d\n",c,tmax);

	}
}

