public class Student
{
	public int num;
	public int chinese;
	public int math;
	public int score;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		Student[] student = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
		Student temp = new Student();
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
				student[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].math = Integer.parseInt(tempVar4);
			}
			student[i].score = student[i].chinese + student[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (student[j].score > student[k].score)
				{
					k = j;
				}
			}
			if (k != i)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=student[i];
				temp.copyFrom(student[i]);
				student[i] = student[k];
				student[k] = temp;
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",student[i].num,student[i].score);
		}
		return 0;
	}
}

