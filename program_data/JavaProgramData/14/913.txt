public class student
{
	public int num;
	public int yuwen;
	public int shuxue;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		student temp = new student();
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
		stu[i].total = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (stu[j].total > stu[i].total)
				{
				k = j;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[k];
			temp.copyFrom(stu[k]);
			stu[k] = stu[i];
			stu[i] = temp;
				}
			}
			if (i == 3)
			{
				break;
			}
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",stu[i].num,stu[i].total);
		}
	}
}

