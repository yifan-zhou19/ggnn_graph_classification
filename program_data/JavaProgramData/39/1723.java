package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qi;
	//		int pin;
	//		char xue;
	//		char xi;
	//		int lun;
	//	}
	//	student[20000];
		int a;
		int b;
		int c;
		int f;
		int sum = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < a;b++)
		{
			f = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[b].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[b].qi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[b].pin = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[b].xue = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[b].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				student[b].lun = tempVar7;
			}
			if (student[b].qi > 80 && student[b].lun > 0)
			{
				f = f + 8000;
			}
			if (student[b].qi > 85 && student[b].pin > 80)
			{
				f = f + 4000;
			}
			if (student[b].qi > 90)
			{
				f = f + 2000;
			}
			if (student[b].qi > 85 && student[b].xi == 'Y')
			{
				f = f + 1000;
			}
			if (student[b].pin > 80 && student[b].xue == 'Y')
			{
				f = f + 850;
			}
			sum = sum + f;
			if (f > j)
			{
				j = f;
				c = b;
			}
		}
		System.out.printf("%s\n",student[c].name);
		System.out.printf("%d\n",j);
		System.out.printf("%d",sum);
		return 0;
	}




}

