public class student
{
	public int id;
	public int math;
	public int chinese;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static void Main(String[] args)
	{
		int i;
		int n;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int maxid1 = 0;
		int maxid2 = 0;
		int maxid3 = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i < n ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].math + stu[i].chinese;
			if (stu[i].sum > max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = stu[i].sum;
				maxid3 = maxid2;
				maxid2 = maxid1;
				maxid1 = stu[i].id;
			}
			else if (stu[i].sum > max2)
			{
				max3 = max2;
				max2 = stu[i].sum;
				maxid3 = maxid2;
				maxid2 = stu[i].id;
			}
			else if (stu[i].sum > max3)
			{
				max3 = stu[i].sum;
				maxid3 = stu[i].id;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d", maxid1,max1,maxid2,max2,maxid3,max3);
	}

}

