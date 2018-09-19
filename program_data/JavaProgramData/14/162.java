public class student
{
	public int num;
	public int score1;
	public int score2;
	public int total;
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
		int k;
		int t;
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
				stu[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score2 = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].score1 + stu[i].score2;
		}
		for (i = 0;i < 3;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (stu[j].total > stu[k].total)
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = stu[i].total;
				stu[i].total = stu[k].total;
				stu[k].total = t;
				t = stu[i].num;
				stu[i].num = stu[k].num;
				stu[k].num = t;
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].total);
		}
	}

}

