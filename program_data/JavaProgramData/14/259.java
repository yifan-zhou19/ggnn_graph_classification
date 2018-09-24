public class student
{
	public int num;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(4 * n);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
		}


		for (i = 0;i < n;i++)
		{
			stu[i].total = stu[i].chinese + stu[i].math;
		}

		int t_1;
		int t_2;
		int j;
		int k;
		for (k = 1;k < 4;k++)
		{
			for (j = 0;j < n - k;j++)
			{
				if (stu[j].total >= stu[j + 1].total)
				{
							 t_1 = stu[j + 1].total;
						 stu[j + 1].total = stu[j].total;
						 stu[j].total = t_1;
					t_2 = stu[j + 1].num;
					stu[j + 1].num = stu[j].num;
					stu[j].num = t_2;
				}
			}
		}

		for (i = n - 1;i > n - 4;i--)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].total);
		}

		return 0;
	}

}

