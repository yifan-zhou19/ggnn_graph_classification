public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int banpin;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public double sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
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
				stu[i].banpin = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
			stu[i].sum = 0;
			if (stu[i].qimo > 80 && stu[i].lunwen > 0)
			{
				stu[i].sum = stu[i].sum + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banpin > 80)
			{
				stu[i].sum = stu[i].sum + 4000;
			}
			if (stu[i].qimo > 90)
			{
				stu[i].sum = stu[i].sum + 2000;
			}
			if (stu[i].xibu == 'Y' && stu[i].qimo > 85)
			{
				stu[i].sum = stu[i].sum + 1000;
			}
			if (stu[i].ganbu == 'Y' && stu[i].banpin > 80)
			{
				stu[i].sum = stu[i].sum + 850;
			}
		}
		int max = 0;
		int totalsum = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > max)
			{
				max = stu[i].sum;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum == max)
			{
				System.out.printf("%s\n",stu[i].name);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
		totalsum = totalsum + stu[i].sum;
		}
		System.out.printf("%d\n%d",max,totalsum);
	}

}

