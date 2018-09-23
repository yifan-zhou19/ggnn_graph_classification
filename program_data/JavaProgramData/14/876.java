public class student
{
		public int num;
		public int chi;
		public int mat;
		public int sum;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{

		int i;
		int n;
		int max = 0;
		int m;
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
				stu[i].chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].mat = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].chi + stu[i].mat;
		}
		for (k = 0;k < 3;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (stu[i].sum > max)
				{
				max = stu[i].sum;
				m = i;
				}
			}
			System.out.printf("%d %d\n",stu[m].num,stu[m].sum);
			stu[m].sum = 0;
			max = 0;
		}
	}

}

