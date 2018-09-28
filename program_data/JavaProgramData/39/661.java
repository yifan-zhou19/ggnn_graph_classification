public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int ping;
	public char gan;
	public char xi;
	public int lun;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(101);

	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] jiang = new int[101];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].ping = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lun = Integer.parseInt(tempVar7);
			}
			jiang[i] = 0;
		}
		int max = 0;
		int zong = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].lun > 0)
			{
				jiang[i] += 8000;
			}
			if (stu[i].qimo > 85 && stu[i].ping > 80)
			{
				jiang[i] += 4000;
			}
			if (stu[i].qimo > 90)
			{
				jiang[i] += 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xi == 'Y')
			{
				jiang[i] += 1000;
			}
			if (stu[i].ping > 80 && stu[i].gan == 'Y')
			{
				jiang[i] += 850;
			}
			if (max < jiang[i])
			{
				max = jiang[i];
			}
			zong += jiang[i];
		}
		for (i = 0;i < n;i++)
		{
			if (max == jiang[i])
			{
				System.out.printf("%s\n%d\n",stu[i].name,jiang[i]);
				break;

			}
		}

	System.out.printf("%d\n",zong);

	}

}

