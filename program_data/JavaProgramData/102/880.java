package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double tmph;
		int count = 0;
		String tmp = new String(new char[10]);
		int state = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct info
	//	{
	//		char sex[10];
	//		double h;
	//	}
	//	stu[50];
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
				stu[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].h = tempVar3;
			}
			if (strcmp(stu[i].sex,"male") == 0)
			{
				count++;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (strcmp(stu[i].sex,stu[j].sex) < 0)
				{
					tmp = stu[i].sex;
					stu[i].sex = stu[j].sex;
					stu[j].sex = tmp;
					tmph = stu[i].h;
					stu[i].h = stu[j].h;
					stu[j].h = tmph;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			for (j = 0;j < count;j++)
			{
				if (stu[i].h < stu[j].h)
				{
					tmph = stu[i].h;
					stu[i].h = stu[j].h;
					stu[j].h = tmph;
				}
			}
		}
		for (i = count;i < n;i++)
		{
			for (j = count;j < n;j++)
			{
				if (stu[i].h > stu[j].h)
				{
					tmph = stu[i].h;
					stu[i].h = stu[j].h;
					stu[j].h = tmph;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (state != 0)
			{
				System.out.printf(" %.2lf",stu[i].h);
			}
			else
			{
				System.out.printf("%.2lf",stu[i].h);
				state = 1;
			}
		}
		return 0;
	}
}

