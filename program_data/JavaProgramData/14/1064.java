public class grade
{
	public int num;
	public int chinese;
	public int math;
	public int all;
}

package <missing>;

public class GlobalMembers
{
	public static grade[] stu = tangible.Arrays.initializeWithDefaultgradeInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int e;
		int f;
		int g;
		int a;
		int b;
		int c;
		e = 0;
		f = 0;
		g = 0;
		a = 0;
		b = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
			stu[i].all = stu[i].chinese + stu[i].math;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].all > e)
			{
				e = stu[i].all;
				a = i;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].all <= e != 0 && stu[i].all> f && i != a)
			{
				f = stu[i].all;
				b = i;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].all <= f != 0 && stu[i].all> g && i != a && i != b)
			{
				g = stu[i].all;
				c = i;
			}
		}
		System.out.printf("%d %d\n",stu[a].num,stu[a].all);
		System.out.printf("%d %d\n",stu[b].num,stu[b].all);
		System.out.printf("%d %d\n",stu[c].num,stu[c].all);
		return 0;
	}
}

