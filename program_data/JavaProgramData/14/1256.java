package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[3][2];
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	int num;
	//	int s1;
	//	int s2;
	//	int l;
	//	}
	//	stu[100000];
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
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].s1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].s2 = tempVar4;
			}
			stu[i].l = stu[i].s1 + stu[i].s2;
		}
		for (i = 0;i < 3;i++)
		{
			for (m = 0,j = 0;j < n;j++)
			{
				if (m < stu[j].l)
				{
					m = stu[j].l;
					k = j;
				}
			}
			a[i][0] = k;
			a[i][1] = m;
			stu[k].l = 0;
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",a[i][0] + 1,a[i][1]);
		}
	}

}

