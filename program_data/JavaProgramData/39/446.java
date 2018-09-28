package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct stu
	//{
	//	char name[20];
	//	int qimo;
	//	int banping;
	//	char gb[2];
	//	char xb[2];
	//	int lw;
	//	int jxj;
	//}
	//stu[100];

		int n;
		int N;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int max;
		int temp;
		int totle = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (n = 0;n < N;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[n].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[n].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[n].banping = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[n].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stu[n].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[n].lw = tempVar7;
			}
		}
		for (n = 0;n < N;n++)
		{
			a = 0;
			b = 0;
			c = 0;
			d = 0;
			e = 0;
			if ((stu[n].qimo > 80) && (stu[n].lw >= 1))
			{
				a = 8000;
			}
			if ((stu[n].qimo > 85) && (stu[n].banping > 80))
			{
				b = 4000;
			}
			if (stu[n].qimo > 90)
			{
				c = 2000;
			}
			if ((stu[n].banping > 80) && (strcmp(stu[n].gb,"Y") == 0))
			{
				e = 850;
			}
			if ((stu[n].qimo > 85) && (strcmp("Y",stu[n].xb) == 0))
			{
				d = 1000;
			}
			stu[n].jxj = a + b + c + d + e;
		}
			for (n = 0;n < N;n++)
			{
				totle += stu[n].jxj;
			}
			for (n = 1;n < N;n++)
			{
				if (stu[n].jxj > stu[0].jxj)
				{
					temp = stu[0].jxj;
					stu[0].jxj = stu[n].jxj;
					stu[n].jxj = temp;
					stu[0].name = stu[n].name;
				}
			}

		System.out.printf("%s\n%d\n%d\n",stu[0].name,stu[0].jxj,totle);
		return 0;
	}


}

