public class Student
{
	public int num;
	public int ch;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(4);
		Student temp = new Student();
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].ch + stu[i].math;
		}
		for (i = 0;i < 2;i++)
		{
			k = i;
			for (j = i + 1;j < 3;j++)
			{
				if (stu[j].sum > stu[i].sum)
				{
					k = j;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[k];
				temp.copyFrom(stu[k]);
				stu[j] = stu[i];
				stu[i] = temp;
				}
			}
		}
		  //  for(i=0;i<3;i++)
			//  printf("%d %d\n",stu[i].num,stu[i].sum);
		for (i = 3;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[3].num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[3].ch = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[3].math = Integer.parseInt(tempVar7);
			}
			stu[3].sum = stu[3].ch + stu[3].math;
			if (stu[3].sum > stu[0].sum)
			{
				stu[2] = stu[1];
				stu[1] = stu[0];
				stu[0] = stu[3];
			}
			else if (stu[3].sum > stu[1].sum)
			{
				stu[2] = stu[1];
				stu[1] = stu[3];
			}
			else if (stu[3].sum > stu[2].sum)
			{
				stu[2] = stu[3];
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
		return 0;
	}
}

