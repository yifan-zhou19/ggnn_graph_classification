public class student
{
	public int number;
	public int ch;
	public int ma;
	public int sum;
	public int key;

}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int n;
		int i;
		int max = 0;
		int l = 0;
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
				stu[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].ma = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].ch + stu[i].ma;
			stu[i].key = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (max < stu[i].sum && stu[i].key == 0)
			{
				max = stu[i].sum;
				l = i;
			}
		}
		System.out.printf("%d %d\n",l + 1,max);
		max = 0;
		stu[l].key = 1;
		l = 0;
		for (i = 0;i < n;i++)
		{
			if (max < stu[i].sum && stu[i].key == 0)
			{
				max = stu[i].sum;
				l = i;
			}
		}
		System.out.printf("%d %d\n",l + 1,max);
		max = 0;
		stu[l].key = 1;
		l = 0;
		for (i = 0;i < n;i++)
		{
			if (max < stu[i].sum && stu[i].key == 0)
			{
				max = stu[i].sum;
				l = i;
			}
		}
		System.out.printf("%d %d\n",l + 1,max);
		max = 0;
		stu[l].key = 1;
		l = 0;
	}




}

