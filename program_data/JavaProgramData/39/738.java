package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct jiangxuejin
	//	{
	//		char name[20];
	//		char ganbu;
	//		char xibu;
	//		int qimo;
	//		int qizhong;
	//		int lunwen;
	//		int money;
	//	};
		jiangxuejin[] a = tangible.Arrays.initializeWithDefaultjiangxuejinInstances(100);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		jiangxuejin * p = new jiangxuejin();
		jiangxuejin max;
		max = a;
		for (p = a;p < a + n;p++)
		{
			p.money = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.qizhong = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.lunwen = tempVar7;
			}
			if ((p.qimo > 80) && (p.lunwen >= 1))
			{
			(p.money) += 8000;
			}
			if ((p.qimo > 85) && (p.qizhong > 80))
			{
			(p.money) += 4000;
			}
			if (p.qimo > 90)
			{
			(p.money) += 2000;
			}
			if ((p.qimo > 85) && (p.xibu == 'Y'))
			{
			(p.money) += 1000;
			}
			if ((p.qizhong > 80) && (p.ganbu == 'Y'))
			{
			(p.money) += 850;
			}
			if (p.money > max.money)
			{
			max = p;
			}
			sum += p.money;
		}
		System.out.printf("%s\n%d\n%d",max.name,max.money,sum);
	}
}

