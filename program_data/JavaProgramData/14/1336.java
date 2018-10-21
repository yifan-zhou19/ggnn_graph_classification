public class student
{
	public int num;
	public int yu;
	public int shu;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int n;
		int i;
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
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yu = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shu = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].shu + stu[i].yu;
		}
		int k;
		int e;
		for (k = 0;k < 3;k++)
		{
			for (i = n - 2;i >= k;i--)
			{
				if (stu[i].sum < stu[i + 1].sum)
				{
					e = stu[i].sum;
					stu[i].sum = stu[i + 1].sum;
					stu[i + 1].sum = e;
					e = stu[i].num;
					stu[i].num = stu[i + 1].num;
					stu[i + 1].num = e;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
		return 0;
	}

}

