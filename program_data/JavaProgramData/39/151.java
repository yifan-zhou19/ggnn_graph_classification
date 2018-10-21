package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct std
	//	{
	//		char name[21];
	//		int cj;
	//		int py;
	//		char gb;
	//		char xb;
	//		int lw;
	//		int sum;
	//	}
	//	std[100];

		int n;
		int i;
		int max;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				std[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				std[i].cj = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				std[i].py = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				std[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				std[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				std[i].lw = tempVar7;
			}

			std[i].sum = 0;

			if (std[i].cj > 80 && std[i].lw >= 1)
			{
				std[i].sum = std[i].sum + 8000;
			}
			else
			{
				;
			}

			if (std[i].cj > 85 && std[i].py > 80)
			{
				std[i].sum = std[i].sum + 4000;
			}
			else
			{
				;
			}

			if (std[i].cj > 90)
			{
				std[i].sum = std[i].sum + 2000;
			}
			else
			{
				;
			}

			if (std[i].xb == 'Y' && std[i].cj > 85)
			{
				std[i].sum = std[i].sum + 1000;
			}
			else
			{
				;
			}

			if (std[i].gb == 'Y' && std[i].py > 80)
			{
				std[i].sum = std[i].sum + 850;
			}
			else
			{
				;
			}

			sum = sum + std[i].sum;
		}

		for (i = 1,max = std[0].sum;i < n;i = i + 1)
		{
			if (max < std[i].sum)
			{
				max = std[i].sum;
			}
			else
			{
				;
			}
		}

		for (i = 0;i < n;i = i + 1)
		{
			if (std[i].sum == max)
			{
				System.out.printf("%s\n",std[i].name);
				System.out.printf("%d\n",std[i].sum);
				System.out.printf("%d\n",sum);
				break;
			}
		}
	}

}

