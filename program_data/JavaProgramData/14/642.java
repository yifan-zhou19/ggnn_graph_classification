public class student
{
	public int num;
	public double chi;
	public double math;
	public double total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student temp = new student();
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chi = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = Double.parseDouble(tempVar4);
			}
			stu[i].total = stu[i].chi + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			k = i;
			for (j = i;j < n;j++)
			{
				if (stu[k].total < stu[j].total)
				{
					k = j;
				}
			}
			if (k != i)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
				temp.copyFrom(stu[i]);
				stu[i] = stu[k];
				stu[k] = temp;
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %.0lf\n",stu[i].num,stu[i].total);
		}

		return 0;
	}


}

