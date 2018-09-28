package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char name[20];
	//		int qimo,pingyi;
	//		char ban,xi;
	//		int lun,sum;
	//	}
	//	num[100];
		int n;
		int i;
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
				num[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				num[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				num[i].pingyi = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				num[i].ban = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				num[i].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				num[i].lun = tempVar7;
			}

		}
		int zong = 0;
		for (i = 0;i < n;i++)
		{
			num[i].sum = 0;
			if (num[i].qimo > 80 && num[i].lun >= 1)
			{
				num[i].sum += 8000;
			}
			if (num[i].qimo > 85 && num[i].pingyi > 80)
			{
				num[i].sum += 4000;
			}
			if (num[i].qimo > 90)
			{
				num[i].sum += 2000;
			}
			if (num[i].qimo > 85 && num[i].xi == 'Y')
			{
				num[i].sum += 1000;
			}
			if (num[i].pingyi > 80 && num[i].ban == 'Y')
			{
				num[i].sum += 850;
			}
			zong += num[i].sum;


		}
		int w = 0;
		int e;

		for (i = 0;i < n;i++)
		{
			if (num[i].sum > w)
			{
				w = num[i].sum;
				e = i;

			}

		}
		System.out.printf("%s\n",num[e].name);
		System.out.printf("%d\n",w);
		System.out.printf("%d",zong);
		return 0;
	}
}

