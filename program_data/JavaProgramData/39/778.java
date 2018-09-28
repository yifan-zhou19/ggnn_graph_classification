package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[100];
	//		int qi;
	//		int ping;
	//		char gan;
	//		char xi;
	//		int lun;
	//	}
	//	a[1000];
		int i;
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
				a[i].qi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].ping = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].lun = tempVar7;
			}
		}
		int[] d = new int[1000];
		for (i = 0;i < n;i++)
		{
			if (a[i].qi > 80 && a[i].lun != 0)
			{
				d[i] += 8000;
			}
			if (a[i].qi > 85 && a[i].ping > 80)
			{
				d[i] += 4000;
			}
			if (a[i].qi > 90)
			{
				d[i] += 2000;
			}
			if (a[i].qi > 85 && a[i].xi == 'Y')
			{
				d[i] += 1000;
			}
			if (a[i].ping > 80 && a[i].gan == 'Y')
			{
				d[i] += 850;
			}
		}
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += d[i];
		}
		int z = 0;
		for (i = 0;i < n;i++)
		{
			if (d[z] < d[i])
			{
				z = i;
			}
		}
		System.out.printf("%s\n%d\n%d",a[z].name,d[z],sum);
		return 0;
	}


}

