public class student
{
	public String name = new String(new char[20]);
	public int f_gra;
	public int c_gra;
	public char ganbu;
	public char xibu;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static void Main(String[] args)
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] scho = new int[n];
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
				stu[i].f_gra = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].c_gra = Integer.parseInt(tempVar4);
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
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			scho[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			if (stu[i].f_gra > 80 && stu[i].paper > 0)
			{
				scho[i] = scho[i] + 8000;
				sum = sum + 8000;
			}
			if (stu[i].f_gra > 85 && stu[i].c_gra > 80)
			{
				scho[i] = scho[i] + 4000;
				sum = sum + 4000;
			}
			if (stu[i].f_gra > 90)
			{
				scho[i] = scho[i] + 2000;
				sum = sum + 2000;
			}
			if (stu[i].f_gra > 85 && stu[i].xibu == 'Y')
			{
				scho[i] = scho[i] + 1000;
				sum = sum + 1000;
			}
			if (stu[i].c_gra > 80 && stu[i].ganbu == 'Y')
			{
				scho[i] = scho[i] + 850;
				sum = sum + 850;
			}
		}

		int max = scho[0];
		int goal;
		for (i = 0;i < n;i++)
		{
			if (scho[i] > max)
			{
				max = scho[i];
				goal = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[goal].name,max,sum);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(scho);
	}

}

