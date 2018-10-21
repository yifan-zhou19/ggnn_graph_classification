public class data
{
	public String name = new String(new char[21]);
	public int final;
	public int assess;
	public char servant;
	public char west;
	public int pub;
	public int bonus;
}

package <missing>;

public class GlobalMembers
{
	public static data[] student = tangible.Arrays.initializeWithDefaultdataInstances(100);
	public static data medium;

	public static void yuanshi(data student)
	{
		if (student.final > 80 && student.pub > 0)
		{
			student.bonus = student.bonus + 8000;
		}
	}

	public static void wusi(data student)
	{
		if (student.final > 85 && student.assess > 80)
		{
			student.bonus = student.bonus + 4000;
		}
	}

	public static void chengji(data student)
	{
		if (student.final > 90)
		{
			student.bonus = student.bonus + 2000;
		}
	}

	public static void xibu(data student)
	{
		if (student.final > 85 && student.west == 'Y')
		{
			student.bonus = student.bonus + 1000;
		}
	}

	public static void banji(data student)
	{
		if (student.assess > 80 && student.servant == 'Y')
		{
			student.bonus = student.bonus + 850;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int index;
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].assess = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[i].servant = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				student[i].pub = Integer.parseInt(tempVar7);
			}
			student[i].bonus = 0;
		}
		medium = student;
		for (i = 0; i < n; i++)
		{
			banji(medium + i);
			xibu(medium + i);
			chengji(medium + i);
			yuanshi(medium + i);
			wusi(medium + i);
		}
		for (i = 0; i < n; i++)
		{
			if (max < student[i].bonus)
			{
				max = student[i].bonus;
				index = i;
			}
			sum = sum + student[i].bonus;
		}
		System.out.printf("%s\n%d\n%d", student[index].name, max, sum);
		return 0;
	}

}

