//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public String name = new String(new char[21]);
	public int test;
	public int grade;
	public int paper;
	public int sum;
	public char monitor;
	public char west;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] stu = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int a;
		int b = 0;
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
				stu[i].test = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].grade = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].monitor = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
				stu[i].sum = 0;
				if (stu[i].test > 80 && stu[i].paper >= 1)
				{
					stu[i].sum += 8000;
				}
				if (stu[i].test > 85 && stu[i].grade > 80)
				{
					stu[i].sum += 4000;
				}
				if (stu[i].test > 90)
				{
					stu[i].sum += 2000;
				}
				if (stu[i].test > 85 && stu[i].west == 'Y')
				{
					stu[i].sum += 1000;
				}
				if (stu[i].grade > 80 && stu[i].monitor == 'Y')
				{
					stu[i].sum += 850;
				}
				s += stu[i].sum;
		}
		a = stu[0].sum;
		for (i = 1;i < n;i++)
		{
			if (stu[i].sum > a)
			{
				a = stu[i].sum;
				b = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[b].name,stu[b].sum,s);
		return 0;
	}

}

