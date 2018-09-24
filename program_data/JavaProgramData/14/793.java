public class student
{
	public int No;
	public int Chinese;
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
		int j;
		int a;
		int b;
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
				stu[i].No = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].Chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].score = stu[i].Chinese + stu[i].math;
			 }

		for (j = n - 1;j > n - 4;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (stu[i + 1].score < stu[i].score || stu[i + 1].score == stu[i].score)
				{
				a = stu[i + 1].score;
				stu[i + 1].score = stu[i].score;
				stu[i].score = a;
				b = stu[i + 1].No;
				stu[i + 1].No = stu[i].No;
				stu[i].No = b;
				}
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
			System.out.printf("%d %d\n",stu[i].No,stu[i].score);
		}


		return 0;
	}
}

