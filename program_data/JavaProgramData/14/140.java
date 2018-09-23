public class student
{
	public int a;
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] g = new int[100000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].y = Integer.parseInt(tempVar4);
			}
			g[i] = stu[i].x + stu[i].y;
		}
		for (i = 1;i < 4;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (g[j - 1] < g[j])
				{
					m = g[j - 1];
					g[j - 1] = g[j];
					g[j] = m;
					p = stu[j - 1].a;
					stu[j - 1].a = stu[j].a;
					stu[j].a = p;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%ld %d\n",stu[i].a,g[i]);
		}
	}

}

