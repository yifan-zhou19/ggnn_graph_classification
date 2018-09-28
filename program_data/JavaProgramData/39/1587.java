public class student
{
	public String name = new String(new char[21]);
	public int qimo;
	public int banji;
	public char ganbu;
	public char xibu;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(101);

	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int max = 0;
		int[] sz = new int[101];
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
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].paper >= 1)
			{
				sz[i] = sz[i] + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				sz[i] = sz[i] + 4000;
			}
			if (stu[i].qimo > 90)
			{
				sz[i] = sz[i] + 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xibu == 'Y')
			{
				sz[i] = sz[i] + 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
			{
				sz[i] = sz[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] > sz[max])
			{
				max = i;
			}
			sum = sum + sz[i];
		}
		System.out.printf("%s\n",stu[max].name);
		System.out.printf("%d\n",sz[max]);
		System.out.printf("%d",sum);
		return 0;
	}


}

