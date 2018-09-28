public class student
{
	public String stuID = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String add = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(5000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			stu[0].stuID = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			stu[0].name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			stu[0].sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu[0].age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			stu[0].score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			stu[0].add = tempVar6.charAt(0);
		}
		i = 0;
		if (String.valueOf(stu[i].stuID).length() >= 3)
		{
		while (true)
		{
			i++;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].stuID = tempVar7.charAt(0);
			}
			if (String.valueOf(stu[i].stuID).length() == 3)
			{
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				stu[i].name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				stu[i].sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				stu[i].age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				stu[i].score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				stu[i].add = tempVar12.charAt(0);
			}
		}
		//printf("#####3");
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%s %s %c %d %s %s\n",stu[j].stuID,stu[j].name,stu[j].sex,stu[j].age,stu[j].score,stu[j].add);
		}
		}
		return 0;
	}
}

