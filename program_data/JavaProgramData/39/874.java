package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	   char name[30];
	//	   int qimo;
	//	   int ping;
	//	   char ban;
	//	   char xi;
	//	   int paper;
	//	}
	//	a[100];
		int N;
		int i;
		int[] b = new int[100];
		int max;
		int t;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].ping = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].ban = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = tempVar7;
			}
		}
		for (i = 0;i < N;i++)
		{
			if ((a[i].qimo > 80) && (a[i].paper >= 1))
			{
				b[i] = b[i] + 8000;
			}
			if ((a[i].ping > 80) && (a[i].qimo > 85))
			{
				b[i] = b[i] + 4000;
			}
			if (a[i].qimo > 90)
			{
				b[i] = b[i] + 2000;
			}
			if ((a[i].qimo > 85) && (a[i].xi == 'Y'))
			{
				b[i] = b[i] + 1000;
			}
			if ((a[i].ping > 80) && (a[i].ban == 'Y'))
			{
				b[i] = b[i] + 850;
			}
		}
		max = b[0];
		t = 0;
		for (i = 0;i < N;i++)
		{
			s = s + b[i];
			if (b[i] > max)
			{
				max = b[i];
				t = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",a[t].name,max,s);
		return 0;
	}

}

