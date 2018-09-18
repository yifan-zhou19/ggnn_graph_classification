public class grade
{
	public int No;
	public int chinese;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static grade[] student = tangible.Arrays.initializeWithDefaultgradeInstances(100000);
	public static grade s = new grade();
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
			student[i].No = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			student[i].chinese = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			student[i].math = Integer.parseInt(tempVar4);
		}
		student[i].sum = student[i].chinese + student[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (student[i].sum < student[j].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s=student[i];
					s.copyFrom(student[i]);
					student[i] = student[j];
					student[j] = s;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",student[i].No,student[i].sum);
		}
		return 0;
	}
}

