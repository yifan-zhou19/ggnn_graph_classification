public class student
{
	public int number;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main(String[] args)
	{
		int n;
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
			stu[i].total = stu[i].chinese + stu[i].math;
		}
		int a = stu[0].total;
		int b = stu[0].total;
		int c = stu[0].total;
		for (i = 0;i < n;i++)
		{
			if (stu[i].total > a)
			{
				c = b;
				b = a;
				a = stu[i].total;
				continue;
			}
			if (stu[i].total < a && stu[i].total> b)
			{
				c = b;
				b = stu[i].total;
				continue;
			}
			if (stu[i].total < b && stu[i].total> c)
			{
				c = stu[i].total;
				continue;
			}
		}
		int m = 0;
		for (i = 0;i < n && m < 3;i++)
		{
			if (stu[i].total == a)
			{
				System.out.printf("%d %d\n",stu[i].number,stu[i].total);
				m++;
			}
		}
		for (i = 0;i < n && m < 3;i++)
		{
			if (stu[i].total == b)
			{
				System.out.printf("%d %d\n",stu[i].number,stu[i].total);
				m++;
			}
		}
		for (i = 0;i < n && m < 3;i++)
		{
			if (stu[i].total == c)
			{
				System.out.printf("%d %d\n",stu[i].number,stu[i].total);
				m++;
			}
		}
	}
}

