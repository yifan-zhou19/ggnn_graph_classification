public class student
{
	public int num;
	public int chi;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e = 0;
		int f = 0;
		int g = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(3 * n);
		int[] sz = new int[n];
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
				stu[i].chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			sz[i] = stu[i].chi + stu[i].math;
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] > sz[a])
			{
				a = i;
				e = stu[i].num;
			}
		}
		System.out.printf("%d %d\n",e,sz[a]);
		for (i = 0;i < n;i++)
		{
			if (i == a)
			{
				continue;
			}
			if (sz[i] > sz[b])
			{
				b = i;
				f = stu[i].num;
			}
		}
		System.out.printf("%d %d\n",f,sz[b]);
		for (i = 0;i < n;i++)
		{
			if (i == a || i == b)
			{
				continue;
			}
			if (sz[i] > sz[c])
			{
				c = i;
				g = stu[i].num;
			}
		}
		System.out.printf("%d %d",g,sz[c]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
		return 0;
	}
}

