package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//	int sco;
	//	int score;
	//	char a;
	//	char b;
	//	int p;
	//	};
		stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100);
		int n;
		int i;
		int j;
		int[] k = new int[100];
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].sco = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].p = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sco > 80 && stu[i].p >= 1)
			{
				k[i] = k[i] + 8000;
			}
			if (stu[i].sco > 85 && stu[i].score > 80)
			{
				k[i] = k[i] + 4000;
			}
			if (stu[i].sco > 90)
			{
				k[i] = k[i] + 2000;
			}
			if (stu[i].sco > 85 && stu[i].b == 'Y')
			{
				k[i] = k[i] + 1000;
			}
			if (stu[i].score > 80 && stu[i].a == 'Y')
			{
				k[i] = k[i] + 850;
			}
		}
		int total = 0;
		for (i = 0;i < n;i++)
		{
			total = total + k[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (k[j] > k[i])
				{
					break;
				}
			}
			if (j == n)
			{
				break;
			}
		}
		System.out.printf("%s\n",stu[i].name);
		System.out.printf("%d\n",k[i]);
		System.out.printf("%d",total);
	}
}

