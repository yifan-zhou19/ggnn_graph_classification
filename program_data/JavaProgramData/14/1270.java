public class Student
{
	public int Id;
	public int yuwen;
	public int shuxue;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		Student[] student = tangible.Arrays.initializeWithDefaultStudentInstances(NUM);
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
				student[i].Id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].shuxue = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < (3 - i - 1);j++)
			{
				if ((student[j + 1].yuwen + student[j + 1].shuxue) > (student[j].yuwen + student[j].shuxue))
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=student[j+1];
					temp.copyFrom(student[j + 1]);
					student[j + 1] = student[j];
					student[j] = temp;
				}
			}
		}
		for (i = 3;i < n;i++)
		{
			if ((student[i].yuwen + student[i].shuxue) > (student[2].yuwen + student[2].shuxue))
			{
					student[2] = student[i];
			}
			if ((student[i].yuwen + student[i].shuxue) > (student[1].yuwen + student[1].shuxue))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=student[1];
					temp.copyFrom(student[1]);
					student[1] = student[i];
					student[2] = temp;
			}
			if ((student[i].yuwen + student[i].shuxue) > (student[0].yuwen + student[0].shuxue))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=student[0];
					temp.copyFrom(student[0]);
					student[0] = student[i];
					student[1] = temp;
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%ld %d\n",student[i].Id,(student[i].shuxue + student[i].yuwen));
		}
		return 0;
	}


}

