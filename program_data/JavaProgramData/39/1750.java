package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int b;
	//		int c;
	//		char d;
	//		char e;
	//		int f;
	//		int g;
	//	}
	//	a[2];
		int n;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0].name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[0].b = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a[0].c = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			a[0].d = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			a[0].e = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			a[0].f = tempVar7;
		}
		a[0].g = 0;
		if ((a[0].b > 80) && (a[0].f > 0))
		{
			a[0].g = a[0].g + 8000;
		}
		if ((a[0].b > 85) && (a[0].c > 80))
		{
			a[0].g = a[0].g + 4000;
		}
		if (a[0].b > 90)
		{
			a[0].g = a[0].g + 2000;
		}
		if ((a[0].b > 85) && (a[0].e == 'Y'))
		{
			a[0].g = a[0].g + 1000;
		}
		if ((a[0].c > 80) && (a[0].d == 'Y'))
		{
			a[0].g = a[0].g + 850;
		}
		sum = a[0].g;
		for (i = 1;i < n;i++)
		{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				a[1].name = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				a[1].b = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				a[1].c = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				a[1].d = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				a[1].e = tempVar12;
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				a[1].f = tempVar13;
			}
			a[1].g = 0;
		if ((a[1].b > 80) && (a[1].f > 0))
		{
			a[1].g = a[1].g + 8000;
		}
		if ((a[1].b > 85) && (a[1].c > 80))
		{
			a[1].g = a[1].g + 4000;
		}
		if (a[1].b > 90)
		{
			a[1].g = a[1].g + 2000;
		}
		if ((a[1].b > 85) && (a[1].e == 'Y'))
		{
			a[1].g = a[1].g + 1000;
		}
		if ((a[1].c > 80) && (a[1].d == 'Y'))
		{
			a[1].g = a[1].g + 850;
		}
		sum = sum + a[1].g;
		if (a[0].g < a[1].g)
		{
			a[0] = a[1];
		}
		}
		System.out.printf("%s\n%d\n%d\n",a[0].name,a[0].g,sum);
		return 0;
	}



}

