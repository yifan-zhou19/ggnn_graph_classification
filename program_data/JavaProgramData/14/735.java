public class student
{
		public int j;
		public int x;
		public int y;
		public int z;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main(String[] args)
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int a1;
		int b1;
		int c1;

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
				stu[i].j = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].y = Integer.parseInt(tempVar4);
			}
			stu[i].z = stu[i].x + stu[i].y;
		}
		for (i = 0;i < n;i++)
		{
			if (a < stu[i].z)
			{
				a = stu[i].z;
				a1 = i;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (b < stu[i].z && i != a1)
			{
				b = stu[i].z;
				b1 = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c < stu[i].z && i != a1 && i != b1)
			{
				c = stu[i].z;
				c1 = i;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[a1].j,stu[a1].z,stu[b1].j,stu[b1].z,stu[c1].j,stu[c1].z);
	}

}

