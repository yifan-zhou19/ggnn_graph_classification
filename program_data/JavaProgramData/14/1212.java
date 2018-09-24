public class student
{
	public int num;
 public int score1;
 public int score2;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static void Main()
	{
		int n;
		int i;
		int[] sum = new int[100000];
		int max = 0;
		int j;
		int k;
		int l;
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
				stu[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].score2 = Integer.parseInt(tempVar4);
			}
		sum[i] = stu[i].score1 + stu[i].score2;
		}
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max)
			{
			max = sum[i];
			j = i;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max && i != j)
			{
			max = sum[i];
			k = i;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max && i != j && i != k)
			{
			max = sum[i];
			l = i;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[j].num,sum[j],stu[k].num,sum[k],stu[l].num,sum[l]);
	}
}

