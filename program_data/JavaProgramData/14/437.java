public class Student
	{
		public int num;
		public int yuwen;
		public int math;
	}

package <missing>;

public class GlobalMembers
{
		public static Student temp = new Student();
		public static Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100050);


		public static int Main()
		{
			int n;
			int i;
			int j;
			int k;
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
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					stu[i].yuwen = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					stu[i].math = Integer.parseInt(tempVar4);
				}
				stu[i].math = stu[i].yuwen + stu[i].math;
			}
			for (i = 0;i < 3;i++)
			{
				k = i;
				for (j = i + 1;j < n;j++)
				{
				if (stu[j].math > stu[k].math)
				{
				k = j;
				}
				}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[k];
				temp.copyFrom(stu[k]);
				stu[k] = stu[i];
				stu[i] = temp;
			}
			for (i = 0;i < 3;i++)
			{
			System.out.printf("%d %d\n",stu[i].num,stu[i].math);
			}
		}
}

