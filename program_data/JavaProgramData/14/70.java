public class student
{
	public int number;
	public int score1;
	public int score2;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int first = 0;
		int second = 0;
		int third = 0;
		int[] a = new int[100000];
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
				stu[i].number = Integer.parseInt(tempVar2);
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
			a[i] = stu[i].score1 + stu[i].score2;
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[first] < a[i])
			{
				third = second;
				second = first;
				first = i;
			}
			else if (a[second] < a[i])
			{
				third = second;
				second = i;
			}
			else if (a[third] < a[i])
			{
				third = i;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[first].number,a[first],stu[second].number,a[second],stu[third].number,a[third]);
		return (0);
	}
}

