public class Student
{
	public String name = new String(new char[20]);
	public int mark;
	public int classpoint;
	public char leader;
	public char west;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int maxnum;
		int tot = 0;
		Student[] stu = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
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
				stu[i].mark = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].classpoint = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
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
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].mark > 80 && stu[i].paper > 0)
			{
				stu[i].money = stu[i].money + 8000;
			}
		if (stu[i].mark > 85 && stu[i].classpoint > 80)
		{
			stu[i].money = stu[i].money + 4000;
		}
		if (stu[i].mark > 90)
		{
			stu[i].money = stu[i].money + 2000;
		}
		if (stu[i].mark > 85 && (stu[i].west == 'Y'))
		{
			stu[i].money = stu[i].money + 1000;
		}
		if (stu[i].leader == 'Y' && (stu[i].classpoint > 80))
		{
			stu[i].money = stu[i].money + 850;
		}
		}
		maxnum = 0;
		for (i = 1;i < n;i++)
		{
			if (stu[maxnum].money < stu[i].money)
			{
				maxnum = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			tot = tot + stu[i].money;
		}
		System.out.printf("%s\n%d\n%d",stu[maxnum].name,stu[maxnum].money,tot);
	}

}

