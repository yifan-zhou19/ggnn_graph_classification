public class student
{
	public int num;
	public int chn;
	public int math;
	public int score;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
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
				stu[i].chn = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].score = stu[i].chn + stu[i].math;
		}

		if (stu[0].score >= stu[1].score)
		{
			if (stu[1].score >= stu[2].score)
			{
				a = 0;
				b = 1;
				c = 2;
			}
			else if (stu[0].score >= stu[2].score)
			{
				a = 0;
				b = 2;
				c = 1;
			}
			else
			{
				a = 2;
				b = 0;
				c = 1;
			}
		}
		else
		{
			if (stu[0].score >= stu[2].score)
			{
				a = 1;
				b = 0;
				c = 2;
			}
			else if (stu[1].score >= stu[2].score)
			{
				a = 1;
				b = 2;
				c = 0;
			}
			else
			{
				a = 2;
				b = 1;
				c = 0;
			}
		}
		for (i = 3;i < n;i++)
		{
			if (stu[i].score > stu[a].score)
			{
				c = b;
				b = a;
				a = i;
			}
			else if (stu[i].score > stu[b].score)
			{
				c = b;
				b = i;
			}
			else if (stu[i].score > stu[c].score)
			{
				c = i;
			}
		}

		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[a].num,stu[a].score,stu[b].num,stu[b].score,stu[c].num,stu[c].score);
	}
}

