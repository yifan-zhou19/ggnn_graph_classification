package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//{
	//	char name[20];
	//int fen;
	//int pin;
	//char gan;
	//char sheng;
	//int lun;
	//int jiang;
	//}
	//a[100];
		int n;
		int i;
		int max;
		int k;
		int sum = 0;
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
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].fen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].pin = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].sheng = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].lun = tempVar7;
			}
			a[i].jiang = 0;
			if (a[i].fen > 80 && a[i].lun > 0)
			{
				a[i].jiang = a[i].jiang + 8000;
			}
			if (a[i].fen > 85 && a[i].pin > 80)
			{
				a[i].jiang = a[i].jiang + 4000;
			}
			if (a[i].fen > 90)
			{
				a[i].jiang = a[i].jiang + 2000;
			}
			if (a[i].fen > 85 && a[i].sheng == 'Y')
			{
				a[i].jiang = a[i].jiang + 1000;
			}
			if (a[i].pin > 80 && a[i].gan == 'Y')
			{
				a[i].jiang = a[i].jiang + 850;
			}
			sum = sum + a[i].jiang;
		}
		for (i = 1,k = 0,max = a[0].jiang;i < n;i++)
		{
			if (a[i].jiang > max)
			{
				max = a[i].jiang;
				k = i;
			}
		}
			System.out.printf("%s\n%d\n%d",a[k].name,a[k].jiang,sum);
	}
}

