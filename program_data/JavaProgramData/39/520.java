public class student
{
		public String name = new String(new char[20]);
	public int g1;
	public int g2;
	public char id1;
	public char id2;
	public int t;
	public int s;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{

		int n;
		int sum = 0;
		int i;
		int r;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].g1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].g2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].id1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].id2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].t = Integer.parseInt(tempVar7);
			}
			if (stu[i].g1 > 80 && stu[i].t > 0)
			{
				stu[i].s += 8000;
			}
			if (stu[i].g1 > 85 && stu[i].g2 > 80)
			{
				stu[i].s += 4000;
			}
			if (stu[i].g1 > 90)
			{
				stu[i].s += 2000;
			}
			if (stu[i].g1 > 85 && stu[i].id2 == 'Y')
			{
				stu[i].s += 1000;
			}
			if (stu[i].g2 > 80 && stu[i].id1 == 'Y')
			{
				stu[i].s += 850;
			}
			sum += stu[i].s;
		}
		m = stu[0].s;
		r = 0;
		for (i = 0;i < n;i++)
		{

			if (stu[i].s > m)
			{
				m = stu[i].s;
				r = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[r].name,stu[r].s,sum);
	}

}

