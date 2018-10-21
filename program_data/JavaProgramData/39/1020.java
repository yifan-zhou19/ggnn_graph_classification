package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qm;
	//		int bj;
	//		char gb;
	//		char xb;
	//		int lw;
	//	}
	//	a[100];
		int n;
		int[] b = new int[100];
		int t = 0;
		int i;
		int max;
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
				a[i].qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].bj = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].lw = tempVar7;
			}
			if (a[i].qm > 80 && a[i].lw > 0)
			{
				b[i] = b[i] + 8000;
			}
			if (a[i].qm > 85 && a[i].bj > 80)
			{
				b[i] = b[i] + 4000;
			}
			if (a[i].qm > 90)
			{
				b[i] = b[i] + 2000;
			}
			if (a[i].qm > 85 && a[i].xb == 'Y')
			{
				b[i] = b[i] + 1000;
			}
			if (a[i].bj > 80 && a[i].gb == 'Y')
			{
				b[i] = b[i] + 850;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			t = t + b[i];
			if (b[i] > b[max])
			{
				max = i;
			}
		}
		System.out.printf("%s\n",a[max].name);
		System.out.printf("%d\n",b[max]);
		System.out.printf("%d\n",t);
	}
}

