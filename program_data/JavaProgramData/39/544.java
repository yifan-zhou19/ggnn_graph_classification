package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qm;
	//		int bj;
	//		char xg;
	//		char xb;
	//		int lw;
	//		int jj;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].bj = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].xg = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lw = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].jj = 0;
			if (stu[i].qm > 80 && stu[i].lw > 0)
			{
			  stu[i].jj = stu[i].jj + 8000;
			}
			if (stu[i].qm > 85 && stu[i].bj > 80)
			{
			stu[i].jj = stu[i].jj + 4000;
			}
			if (stu[i].qm > 90)
			{
				stu[i].jj = stu[i].jj + 2000;
			}
			if (stu[i].qm > 85 && stu[i].xb == 'Y')
			{
				stu[i].jj = stu[i].jj + 1000;
			}
		   if (stu[i].bj > 80 && stu[i].xg == 'Y')
		   {
			   stu[i].jj = stu[i].jj + 850;
		   }
		}
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 0;j < n;j++)
			{
				if (stu[i].jj < stu[j].jj)
				{
				break;
				}
				else
				{
					k++;
				}
			}
			if (k == n)
			{
				System.out.printf("%s\n%d\n",stu[i].name,stu[i].jj);
			break;
			}
		}
		for (i = 0;i < n;i++)
		{
		m = m + stu[i].jj;
		}
		System.out.printf("%d\n",m);
	}




}

