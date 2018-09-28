public class Student
{
	public String name = new String(new char[20]);
	public int Academy;
	public int Class;
	public char Stujob;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int i;
		int j;
		int[][] scolar = new int[100][6];
		int max;
		int sum = 0;
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		Student * p = new Student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < 6;j++)
			{
				scolar[i][j] = 0;
			}
		}
		for (p = stu;p < stu + N;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.Academy = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.Class = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.Stujob = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (stu[i].Academy > 80 && stu[i].paper >= 1)
			{
				scolar[i][0] = 8000;
			}
			if (stu[i].Academy > 85 && stu[i].Class > 80)
			{
				scolar[i][1] = 4000;
			}
			if (stu[i].Academy > 90)
			{
				scolar[i][2] = 2000;
			}
			if (stu[i].Academy > 85 && stu[i].west == 'Y')
			{
				scolar[i][3] = 1000;
			}
			if (stu[i].Class > 80 && stu[i].Stujob == 'Y')
			{
				scolar[i][4] = 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = 4;j >= 0;j--)
			{
				scolar[i][5] = scolar[i][5] + scolar[i][j];
			}
		}
		max = scolar[0][5];
		j = 0;
		for (i = 0;i < N;i++)
		{
			if (scolar[i][5] > max)
			{
				max = scolar[i][5];
				j = i;
			}
		}
		System.out.printf("%s\n%d\n",stu[j].name,scolar[j][5]);
		for (i = 0;i < N;i++)
		{
			sum = sum + scolar[i][5];
		}
		System.out.printf("%ld",sum);
	}
}

