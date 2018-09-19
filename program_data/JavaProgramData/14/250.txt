public class student
{
	public int num;
	public int yuwen;
	public int shuxue;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		int[] score = new int[m];
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
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
			score[i] = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (score[j] >= score[j + 1])
				{
					t = score[j];
					score[j] = score[j + 1];
					score[j + 1] = t;
					k = stu[j].num;
					stu[j].num = stu[j + 1].num;
					stu[j + 1].num = k;
				}
			}
		}
		for (i = n - 1;i >= n - 3;i--)
		{
			System.out.printf("%d %d\n",stu[i].num,score[i]);
		}
		stu = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(score);
		return 0;
	}
}

