public class student
{
	public int id;
	public int word;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int n;
		int i = 1;
		int maxi;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].word = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].word + stu[i].math;
			i = i + 1;
		}
		i = n;
		stu[n + 1].sum = 0;
		stu[n + 2].sum = 0;
		stu[n + 3].sum = 0;
		stu[n + 1].id = 0;
		stu[n + 2].id = 0;
		stu[n + 3].id = 0;
		stu[n + 1].math = 0;
		stu[n + 2].math = 0;
		stu[n + 3].math = 0;
		stu[n + 1].word = 0;
		stu[n + 2].word = 0;
		stu[n + 3].word = 0;
		while (i >= 1)
		{
			if (stu[i].sum >= stu[n + 1].sum)
			{
				stu[n + 1] = stu[i];
			maxi = i;
			}
			i = i - 1;
		}
		System.out.printf("%d %d\n",stu[n + 1].id,stu[n + 1].sum);
		stu[maxi].sum = 0;
		i = n;
		while (i >= 1)
		{
			if (stu[i].sum >= stu[n + 2].sum)
			{
				stu[n + 2] = stu[i];
			maxi = i;
			}
			i = i - 1;
		}
		System.out.printf("%d %d\n",stu[n + 2].id,stu[n + 2].sum);
		stu[maxi].sum = 0;
		i = n;
		while (i >= 1)
		{
			if (stu[i].sum >= stu[n + 3].sum)
			{
				stu[n + 3] = stu[i];
			}
			i = i - 1;
		}
		System.out.printf("%d %d\n",stu[n + 3].id,stu[n + 3].sum);
	}

}

