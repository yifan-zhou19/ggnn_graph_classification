public class student
{
	public int id;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		int max_0 = 0;
		int max_1 = 0;
		int max_2 = 0;
		int max_0_id;
		int max_1_id;
		int max_2_id;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0; i < num; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(stu[i].id) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(stu[i].chinese) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(stu[i].math) = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].chinese + stu[i].math;
			if (stu[i].total > max_0)
			{
				// update second and third highest
				max_2 = max_1;
				max_2_id = max_1_id;
				max_1 = max_0;
				max_1_id = max_0_id;
				max_0 = stu[i].total;
				max_0_id = stu[i].id;
			}
			else if (stu[i].total > max_1)
			{
				// update third highest
				max_2 = max_1;
				max_2_id = max_1_id;
				max_1 = stu[i].total;
				max_1_id = stu[i].id;
			}
			else if (stu[i].total > max_2)
			{
				max_2 = stu[i].total;
				max_2_id = stu[i].id;
			}
		}

		System.out.printf("%d %d\n", max_0_id, max_0);
		System.out.printf("%d %d\n", max_1_id, max_1);
		System.out.printf("%d %d\n", max_2_id, max_2);

		return 0;
	}

}

