public class stu
{
	public String name = new String(new char[20]);
	public int s1;
	public int s2;
	public char gb;
	public char we;
	public int lw;
	public int jj;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		int max = 0;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].we = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].lw = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].jj = 0;
			if (stu[i].s1 > 80 && stu[i].lw >= 1)
			{
				stu[i].jj += 8000;
			}
			if (stu[i].s1 > 85 && stu[i].s2 > 80)
			{
				stu[i].jj += 4000;
			}
			if (stu[i].s1 > 90)
			{
				stu[i].jj += 2000;
			}
			if (stu[i].s1 > 85 && stu[i].we == 'Y')
			{
				stu[i].jj += 1000;
			}
			if (stu[i].s2 > 80 && stu[i].gb == 'Y')
			{
				stu[i].jj += 850;
			}
			s += stu[i].jj;
			if (stu[i].jj > max)
			{
				max = stu[i].jj;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].jj == max)
			{
				System.out.printf("%s\n%d\n",stu[i].name,stu[i].jj);
				break;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

