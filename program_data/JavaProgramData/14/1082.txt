public class mark
{
	public int num;
	public int ch;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static mark[] stu = tangible.Arrays.initializeWithDefaultmarkInstances(100000);
	public static void Main(String[] args)
	{
		int i;
		int n;
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
				stu[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].math + stu[i].ch;
		}
		for (i = 0;i < n - 1;i++)
		{
			if (stu[i].sum >= stu[i + 1].sum)
			{
				stu[100000] = stu[i];
				stu[i] = stu[i + 1];
				stu[i + 1] = stu[100000];
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			if (stu[i].sum >= stu[i + 1].sum)
			{
				stu[100000] = stu[i];
				stu[i] = stu[i + 1];
				stu[i + 1] = stu[100000];
			}
		}
		for (i = 0;i < n - 3;i++)
		{
			if (stu[i].sum >= stu[i + 1].sum)
			{
				stu[100000] = stu[i];
				stu[i] = stu[i + 1];
				stu[i + 1] = stu[100000];
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[n - 1].num,stu[n - 1].sum,stu[n - 2].num,stu[n - 2].sum,stu[n - 3].num,stu[n - 3].sum);
	}

}

