public class student
{
public int ID;
public int chi;
public int math;
public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000000);

	public static void Main()
	{
		int STUDENT_NUM;
		int i;
		int j;
		int temp1;
		int temp2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			STUDENT_NUM = Integer.parseInt(tempVar);
		}
		for (i = 0;i < STUDENT_NUM;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].ID = Integer.parseInt(tempVar2);
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
			stu[i].total = stu[i].chi + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < STUDENT_NUM;j++)
			{
				if (stu[i].total < stu[j].total)
				{
					temp1 = stu[i].ID;
					stu[i].ID = stu[j].ID;
					stu[j].ID = temp1;
					temp2 = stu[i].total;
					stu[i].total = stu[j].total;
					stu[j].total = temp2;
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[0].ID,stu[0].total,stu[1].ID,stu[1].total,stu[2].ID,stu[2].total);
	}

}

