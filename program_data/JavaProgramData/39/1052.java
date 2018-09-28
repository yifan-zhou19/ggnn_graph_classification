package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] sum = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		struct
	//		{
	//		char name[20];
	//		int average;
	//		int clas;
	//		char gan;
	//		char xi;
	//		int lun;
	//	}
	//	a[100];
			for (i = 0;i < n;i++)
			{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].average = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].clas = tempVar4;
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
			for (i = 0;i < n;i++)
			{
				if (a[i].average > 80 && a[i].lun >= 1)
				{
					sum[i] += 8000;
				}
				if (a[i].average > 85 && a[i].clas > 80)
				{
					sum[i] += 4000;
				}
				if (a[i].average > 90)
				{
					sum[i] += 2000;
				}
				if (a[i].average > 85 && a[i].xi == 'Y')
				{
					sum[i] += 1000;
				}
				if (a[i].clas > 80 && a[i].gan == 'Y')
				{
					sum[i] += 850;
				}
			}
			int s = sum[0];
			int d = sum[0];
			for (i = 1;i < n;i++)
			{
				d += sum[i];
				if (sum[i] > s)
				{
				s = sum[i];
			j = i;
				}
			}
			System.out.printf("%s\n",a[j].name);
			System.out.printf("%d\n",sum[j]);
			System.out.printf("%d\n",d);


	}


}

