public class stu
{
	public String name = new String(new char[21]);
	public int s1;
	public int s2;
	public char g;
	public char x;
	public int l;
	public int m;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(101);

	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int len;
		int max = 0;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].g = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].l = Integer.parseInt(tempVar7);
			}
			stu[i].m = 0;
			if (stu[i].s1 > 80 && stu[i].l >= 1)
			{
				stu[i].m += 8000;
			}
			if (stu[i].s1 > 85 && stu[i].s2 > 80)
			{
				stu[i].m += 4000;
			}
			if (stu[i].s1 > 90)
			{
				stu[i].m += 2000;
			}
			if (stu[i].s1 > 85 && stu[i].x == 'Y')
			{
				stu[i].m += 1000;
			}
			if (stu[i].s2 > 80 && stu[i].g == 'Y')
			{
				stu[i].m += 850;
			}
			sum += stu[i].m;
			if (stu[i].m > max)
			{
				max = stu[i].m;
				num = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[num].name,stu[num].m,sum);
	}

}

