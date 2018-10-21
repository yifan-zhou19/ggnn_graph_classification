public class student
{
	public int n;
	public int a;
	public int b;
	public int aver;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int m;
		int i;
		int j;
		int f;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < m;i++)
		{
			stu[i].aver = stu[i].a + stu[i].b;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = m - 1 - i;j >= 0;j--)
			{
				if (stu[j].aver < stu[j + 1].aver)
				{
					f = stu[j].aver;
					 stu[j].aver = stu[j + 1].aver;
					 stu[j + 1].aver = f;
					t = stu[j].n;
					 stu[j].n = stu[j + 1].n;
					 stu[j + 1].n = t;
				}
			}
		}
			for (i = 0;i < 3;i++)
			{
				System.out.printf("%d %d\n",stu[i].n,stu[i].aver);
			}
	}




}

