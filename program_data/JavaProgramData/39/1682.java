public class student
{
	public String name = new String(new char[20]);
	public int gradeA;
	public int gradeB;
	public char a;
	public char b;
	public int num;
	public int n; //??
	public int np; //??
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int m;
		int k;
		int i;
		int max;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].gradeA = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].gradeB = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].num = Integer.parseInt(tempVar7);
			}
			stu[i].n = 0;
			stu[i].np = 0;
		}
		for (i = 0;i < m;i++)
		{
			if (stu[i].gradeA > 80 && stu[i].num >= 1)
			{
				total = total + 8000;
				stu[i].n++;
				stu[i].np = stu[i].np + 8000;
			}
			if (stu[i].gradeA > 85 && stu[i].gradeB > 80)
			{
				total = total + 4000;
				stu[i].n++;
				stu[i].np = stu[i].np + 4000;
			}
			if (stu[i].gradeA > 90)
			{
				total = total + 2000;
				stu[i].n++;
				stu[i].np = stu[i].np + 2000;
			}
			if (stu[i].gradeA > 85 && stu[i].b == 'Y')
			{
				total = total + 1000;
				stu[i].n++;
				stu[i].np = stu[i].np + 1000;
			}
			if (stu[i].gradeB > 80 && stu[i].a == 'Y')
			{
				total = total + 850;
				stu[i].n++;
				stu[i].np = stu[i].np + 850;
			}
		}
		for (i = 0,max = 0;i < m;i++)
		{
			if (stu[i].np > max)
			{
				max = stu[i].np;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (stu[i].np == max)
			{
				k = i;
				break;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[k].name,stu[k].np,total);
	}
}

