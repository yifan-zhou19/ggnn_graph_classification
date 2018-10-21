public class student
{
	public String name = new String(new char[20]);
 public int endmark;
 public int mark;
 public char ganbu;
 public char xibu;
 public int essay;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int max;
		int p;
		int sum = 0;
		int[] scholar = new int[100];
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
				stu[i].endmark = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].mark = Integer.parseInt(tempVar4);
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
				stu[i].essay = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].endmark > 80 && stu[i].essay >= 1)
			{
				scholar[i] = scholar[i] + 8000;
			}
			if (stu[i].endmark > 85 && stu[i].mark > 80)
			{
				scholar[i] = scholar[i] + 4000;
			}
			if (stu[i].endmark > 90)
			{
				scholar[i] = scholar[i] + 2000;
			}
			if (stu[i].endmark > 85 && stu[i].xibu == 'Y')
			{
				scholar[i] = scholar[i] + 1000;
			}
			if (stu[i].mark > 80 && stu[i].ganbu == 'Y')
			{
				scholar[i] = scholar[i] + 850;
			}
		}
		max = scholar[0];
		for (i = 0;i < n;i++)
		{
			if (scholar[i] > max)
			{
				max = scholar[i];
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (scholar[i] == max)
			{
				p = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + scholar[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[p].name,max,sum);
	}

}

