package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int total = 0;
		int i;
		int n;
		int max = 0;
		String maxname = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a,b,c,sum;
	//		char name[20];
	//		char west,office;
	//	}
	//	student[100];
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
				student[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[i].office = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				student[i].c = tempVar7;
			}
			student[i].sum = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (student[i].a > 80 && student[i].c >= 1)
			{
				student[i].sum += 8000;
				total += 8000;
			}
			if (student[i].a > 85 && student[i].b > 80)
			{
				student[i].sum += 4000;
				total += 4000;
			}
			if (student[i].a > 90)
			{
				student[i].sum += 2000;
				total += 2000;
			}
			if (student[i].west == 'Y' && student[i].a > 85)
			{
				student[i].sum += 1000;
				total += 1000;
			}
			if (student[i].office == 'Y' && student[i].b > 80)
			{
				student[i].sum += 850;
				total += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (student[i].sum > max)
			{
				max = student[i].sum;
				maxname = student[i].name;
			}
		}
		System.out.printf("%s\n%d\n%d",maxname,max,total);
		return 0;
	}
}

