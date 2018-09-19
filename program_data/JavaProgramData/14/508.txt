public class Student
{
	public int No;
	public int Chinese;
	public int Maths;
	public int Total;
}

package <missing>;

public class GlobalMembers
{
	public static void bubble(Student[] a, int n)
	{
		int i;
		int j;
		Student temp = new Student();
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j].Total < a[j + 1].Total)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[j];
					temp.copyFrom(a[j]);
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(4);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 3)
		{
			for (i = 0;i < 3;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					stu[i].No = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					stu[i].Chinese = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					stu[i].Maths = Integer.parseInt(tempVar4);
				}
				stu[i].Total = stu[i].Chinese + stu[i].Maths;
			}
			for (i = 3;i < n;i++)
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					stu[3].No = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					stu[3].Chinese = Integer.parseInt(tempVar6);
				}
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					stu[3].Maths = Integer.parseInt(tempVar7);
				}
				stu[3].Total = +stu[3].Chinese + stu[3].Maths;
				bubble(stu, 4);
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					stu[i].No = Integer.parseInt(tempVar8);
				}
				String tempVar9 = ConsoleInput.scanfRead();
				if (tempVar9 != null)
				{
					stu[i].Chinese = Integer.parseInt(tempVar9);
				}
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					stu[i].Maths = Integer.parseInt(tempVar10);
				}
				stu[i].Total = stu[i].No + stu[i].Chinese + stu[i].Maths;
			}
			bubble(stu, n);
		}
		for (i = 0;i < n && i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].No,stu[i].Total);
		}
		return 0;
	}

}

