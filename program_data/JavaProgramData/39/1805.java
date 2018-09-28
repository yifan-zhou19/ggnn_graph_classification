package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qimochengji;
	//		int banjipingyi;
	//		char ganbu;
	//		char xibu;
	//		int lunwenshu;
	//		int jiangxuejin;
	//	}
	//	stu[100];
		int n;
		int i;
		int sum;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,sum = 0,max = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qimochengji = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banjipingyi = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lunwenshu = tempVar7;
			}
			stu[i].jiangxuejin = 0;
			if (stu[i].qimochengji > 80 && stu[i].lunwenshu >= 1)
			{
				stu[i].jiangxuejin = stu[i].jiangxuejin + 8000;
			}
			if (stu[i].qimochengji > 85 && stu[i].banjipingyi > 80)
			{
				stu[i].jiangxuejin = stu[i].jiangxuejin + 4000;
			}
			if (stu[i].qimochengji > 90)
			{
				stu[i].jiangxuejin = stu[i].jiangxuejin + 2000;
			}
			if (stu[i].qimochengji > 85 && stu[i].xibu == 'Y')
			{
				stu[i].jiangxuejin = stu[i].jiangxuejin + 1000;
			}
			if (stu[i].banjipingyi > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].jiangxuejin = stu[i].jiangxuejin + 850;
			}
			sum += stu[i].jiangxuejin;
			if (stu[max].jiangxuejin < stu[i].jiangxuejin)
			{
				max = i;
			}
		}
		System.out.printf("%s\n",stu[max].name);
		System.out.printf("%d\n",stu[max].jiangxuejin);
		System.out.printf("%d\n",sum);
	}
}

