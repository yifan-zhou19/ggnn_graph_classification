public class student
{
	public String name = new String(new char[20]);
	public int mo;
	public int ban;
	public char ganbu;
	public char xibu;
	public int lunwen;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[100];
		int max;
		int t;
		int S = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
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
				stu[i].mo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].ban = Integer.parseInt(tempVar4);
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
		}
		for (i = 0;i < n;i++)
		{
			s[i] = 0;
			if (stu[i].mo > 80 && stu[i].lunwen > 0)
			{
				s[i] = s[i] + 8000;
			}
			if (stu[i].mo > 85 && stu[i].ban > 80)
			{
				s[i] = s[i] + 4000;
			}
			if (stu[i].mo > 90)
			{
				s[i] = s[i] + 2000;
			}
			if (stu[i].mo > 85 && stu[i].xibu == 'Y')
			{
				s[i] = s[i] + 1000;
			}
			if (stu[i].ban > 80 && stu[i].ganbu == 'Y')
			{
				s[i] = s[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			S = S + s[i];
		}
		max = s[0];
		for (i = 1;i < n;i++)
		{
			if (max < s[i])
			{
				max = s[i];
				t = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[t].name,s[t],S);
		return 0;
	}
}

