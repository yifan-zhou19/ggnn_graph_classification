package <missing>;

public class GlobalMembers
{
	public static int cpu(int term_end,int class_talk,char stu_staff,char stu_west,int thesis_num)
	{
		int money = 0;
		if (term_end > 80 && thesis_num >= 1)
		{
			money += 8000;
		}
		if (term_end > 85 && class_talk > 80)
		{
			money += 4000;
		}
		if (term_end > 90)
		{
			money += 2000;
		}
		if (term_end > 85 && stu_west == 'Y')
		{
			money += 1000;
		}
		if (class_talk > 80 && stu_staff == 'Y')
		{
			money += 850;
		}
		return money;
	}
	public static int Main()
	{

		int stu_num;
		String name = new String(new char[21]);
		int term_end;
		int class_talk;
		char stu_staff;
		char stu_west;
		int thesis_num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			stu_num = Integer.parseInt(tempVar);
		}

		int stu_max = -1;
		int stu_money;
		int money = 0;
		String stu_name = new String(new char[21]);
		for (int i = 0; i < stu_num; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				term_end = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				class_talk = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu_staff = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu_west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				thesis_num = Integer.parseInt(tempVar7);
			}
			stu_money = cpu(term_end, class_talk, stu_staff, stu_west, thesis_num);
			if (stu_money > stu_max)
			{
				stu_max = stu_money;
				stu_name = name;
			}
			money += stu_money;
		}
		System.out.printf("%s\n%d\n%d",stu_name,stu_max,money);
		return 0;
	}
}

