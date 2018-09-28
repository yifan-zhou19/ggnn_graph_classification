package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int mark1;
	//		int mark2;
	//		int number;
	//		char a[2];
	//				  char b[2];
	//	};
		int i;
		int m;
		int[] n = new int[100];
		int p = 0;
		int q = 0;
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].mark1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].mark2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].number = tempVar7;
			}
		}
		for (i = 0;i < m;i++)
		{
			n[i] = 0;
			if (stu[i].mark1 > 80 && stu[i].number >= 1)
			{
				n[i] += 8000;
			}
			if (stu[i].mark1 > 85 && stu[i].mark2 > 80)
			{
				n[i] += 4000;
			}
			if (stu[i].mark1 > 90)
			{
				n[i] += 2000;
			}
			if (stu[i].mark1 > 85 && stu[i].b[0] == 'Y')
			{
				n[i] += 1000;
			}
			if (stu[i].mark2 > 80 && stu[i].a[0] == 'Y')
			{
				n[i] += 850;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (n[i] > p)
			{
				p = n[i];
				w = i;
			}
			q = q + n[i];
		}
		System.out.printf("%s\n",stu[w].name);
		System.out.printf("%d\n",n[w]);
			 System.out.printf("%d\n",q);
		return 0;
	}

}

