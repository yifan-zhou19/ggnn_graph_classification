public class student
{
	public int No;
	public int yuwen;
	public int shuxue;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int n;
		int i;
		int k;
		int e;
		int f;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(4 * n);

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].No = Integer.parseInt(tempVar2);
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
			stu[i].sum = stu[i].yuwen + stu[i].shuxue;
		}

		for (k = 0;k < 3;k++)
		{
			for (i = n - 1;i > k;i--)
			{
				if (stu[i - 1].sum < stu[i].sum)
				{
				e = stu[i - 1].sum;
				stu[i - 1].sum = stu[i].sum;
				stu[i].sum = e;
				f = stu[i - 1].No;
				stu[i - 1].No = stu[i].No;
				stu[i].No = f;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].No,stu[i].sum);
		}


		return 0;
	}



}

