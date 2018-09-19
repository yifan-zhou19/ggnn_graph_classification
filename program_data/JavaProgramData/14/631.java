public class student
{
	public int num;
	public int s1;
	public int s2;
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
		int p;
		int q;
		int r;
		int max;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].s2 = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].s1 + stu[i].s2;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > max)
			{
				max = stu[i].sum;
				p = i;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (i != p)
			{
				if (stu[i].sum > max)
				{
					max = stu[i].sum;
					q = i;
				}
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if ((i != p) && (i != q))
			{
				if (stu[i].sum > max)
				{
					max = stu[i].sum;
					r = i;
				}
			}
		}
		System.out.printf("%d %d\n",stu[p].num,stu[p].sum);
		System.out.printf("%d %d\n",stu[q].num,stu[q].sum);
		System.out.printf("%d %d\n",stu[r].num,stu[r].sum);
		return 0;
	}

}

