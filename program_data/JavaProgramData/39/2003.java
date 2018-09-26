package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//			int qm;
	//			int py;
	//			char gb[2];
	//			char xb[2];
	//			int lw;
	//			int jxj;
	//	}
	//	student[2]={{'\0',0,0,'\0','\0',0,0},{'\0',0,0,'\0','\0',0,0}};
		student temp = new student('\0',0,0,'\0','\0',0,0);
		int i;
		int n;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					student[1].name = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					student[1].qm = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					student[1].py = tempVar4;
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					student[1].gb = tempVar5;
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					student[1].xb = tempVar6;
				}
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					student[1].lw = tempVar7;
				}
				if (student[1].py > 80 && strcmp(student[1].gb,"Y") == 0)
				{
					student[1].jxj = student[1].jxj + 850;
				}
				if (student[1].qm > 80 && student[1].lw >= 1)
				{
					student[1].jxj = student[1].jxj + 8000;
				}
				if (student[1].qm > 85 && student[1].py > 80)
				{
					student[1].jxj = student[1].jxj + 4000;
				}
				if (student[1].qm > 90)
				{
					student[1].jxj = student[1].jxj + 2000;
				}
				if (student[1].qm > 85 && strcmp(student[1].xb,"Y") == 0)
				{
					student[1].jxj = student[1].jxj + 1000;
				}
				sum = sum + student[1].jxj;

				if (student[1].jxj > student[0].jxj)
				{
					temp = student[1];
					student[1] = student[0];
					student[0] = temp;
				}

				student[1].jxj = 0;
			}
			System.out.printf("%s\n%d\n%d\n",student[0].name,student[0].jxj,sum);
	}



}

