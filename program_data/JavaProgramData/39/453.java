package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int r;
		int t;
		int m;
		int q = 0;
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int zong;
	//		int ban;
	//		char gan;
	//		char xi;
	//		int lun;
	//		int z;
	//	}
	//	stu[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					stu[i].name = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					stu[i].zong = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					stu[i].ban = tempVar4;
				}
				String tempVar5 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar5 != null)
				{
					stu[i].gan = tempVar5;
				}
				String tempVar6 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar6 != null)
				{
					stu[i].xi = tempVar6;
				}
				String tempVar7 = ConsoleInput.scanfRead(" ");
				if (tempVar7 != null)
				{
					stu[i].lun = tempVar7;
				}
		}
		for (i = 1;i <= n;i++)
		{
				stu[i].z = 0;
				if (stu[i].zong > 80 && stu[i].lun > 0)
				{
					stu[i].z = stu[i].z + 8000;
				}
				if (stu[i].zong > 85 && stu[i].ban > 80)
				{
					stu[i].z = stu[i].z + 4000;
				}
				if (stu[i].zong > 90)
				{
					stu[i].z = stu[i].z + 2000;
				}
				if (stu[i].zong > 85 && stu[i].xi == 'Y')
				{
					stu[i].z = stu[i].z + 1000;
				}
				if (stu[i].ban > 80 && stu[i].gan == 'Y')
				{
					stu[i].z = stu[i].z + 850;
				}
				a[i] = stu[i].z;
				q = q + stu[i].z;
		}
		for (j = n;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (stu[r].z > stu[r + 1].z)
				{
					t = stu[r + 1].z;
				stu[r + 1].z = stu[r].z;
				stu[r].z = t;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == stu[n].z)
			{
				m = i;
				break;
			}
		}

	System.out.printf("%s\n%d\n%d\n",stu[m].name,stu[n].z,q);
	return 0;
	}
}

