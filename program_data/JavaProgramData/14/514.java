public class Student
{
	public int num;
	public int chi;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] person = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
	public static Student[] first =
	{
		new Student(0, 0, 0, 0),
		new Student(0, 0, 0, 0),
		new Student(0, 0, 0, 0)
	};
	public static int Main()
	{
		int n;
		int i;
		int j;
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
				person[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				person[i].chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				person[i].math = Integer.parseInt(tempVar4);
			}
			person[i].total = person[i].chi + person[i].math;
			if (person[i].total > first[0].total)
			{
				first[1] = first[0];
				first[0] = person[i];
			}
			else
			{
				if (person[i].total > first[1].total)
				{
				first[2] = first[1];
				first[1] = person[i];
				}
				else
				{
					if (person[i].total > first[2].total)
					{
					first[2] = person[i];
					}
				}
			}
		}
		for (j = 0;j < 3;j++)
		{
			System.out.printf("%ld %d\n",first[j].num,first[j].total);
		}
	}

}

