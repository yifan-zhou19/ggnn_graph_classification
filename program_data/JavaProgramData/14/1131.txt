public class Student
{
	public int num;
	public int yuwen;
	public int shuxue;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int stu1 = 0;
		int stu2 = 0;
		int stu3 = 0;
		Student[] student = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		Student * stu = new Student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (stu = student;stu < student + n;stu++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu.yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu.shuxue = Integer.parseInt(tempVar4);
			}
			(stu.sum) = (stu.yuwen) + (stu.shuxue);
			if (stu.sum >= max3)
			{
				if (stu.sum >= max2)
				{
					if (stu.sum >= max1)
					{
						if (stu.sum > max1)
						{
							max3 = max2;
							max2 = max1;
							max1 = stu.sum;
							stu3 = stu2;
							stu2 = stu1;
							stu1 = stu.num;
						}
						else
						{
							max3 = max2;
							max2 = max1;
							max1 = stu.sum;
							stu3 = stu2;
							stu2 = stu.num;
						}
					}
					else
					{
						if (stu.sum > max2)
						{
							max3 = max2;
							max2 = stu.sum;
							stu3 = stu2;
							stu2 = stu.num;
						}
						else
						{
							max3 = max2;
							max2 = stu.sum;
							stu3 = stu.num;
						}
					}
				}
				else
				{
					if (stu.sum > max3)
					{
						max3 = stu.sum;
						stu3 = stu.num;
					}
					else
					{
						max3 = stu.sum;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: stu=student;
		stu.copyFrom(student);
		System.out.printf("%d %d\n",(stu + stu1 - 1).num,(stu + stu1 - 1).sum);
		System.out.printf("%d %d\n",(stu + stu2 - 1).num,(stu + stu2 - 1).sum);
		System.out.printf("%d %d\n",(stu + stu3 - 1).num,(stu + stu3 - 1).sum);
	}
}

