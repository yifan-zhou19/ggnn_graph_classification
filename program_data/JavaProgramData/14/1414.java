package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	int idnum,yunum,shunum;
	//}
	//stu[100000];
		int n;
		int i;
		int max = 0;
		int ndmax = 0;
		int rdmax = 0;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] chengji = new int[100000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].idnum = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yunum = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shunum = tempVar4;
			}
			chengji[i] = chengji[i] + stu[i].yunum;
			chengji[i] = chengji[i] + stu[i].shunum;
		}
		for (i = 0;i < n;i++)
		{
			if (chengji[i] > max)
			{
				max = chengji[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max == (stu[i].yunum + stu[i].shunum))
			{
				l = l + 1;
				if (l <= 3)
				{
					System.out.printf("%d %d\n",stu[i].idnum,max);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((chengji[i] < max) && (chengji[i]> ndmax))
			{
				ndmax = chengji[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (ndmax == (stu[i].yunum + stu[i].shunum))
			{
				l = l + 1;
				if (l <= 3)
				{
					System.out.printf("%d %d\n",stu[i].idnum,ndmax);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((chengji[i] < ndmax) && (chengji[i]> rdmax))
			{
				rdmax = chengji[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (rdmax == (stu[i].yunum + stu[i].shunum))
			{
				l = l + 1;
				if (l <= 3)
				{
					System.out.printf("%d %d\n",stu[i].idnum,rdmax);
				}
			}
		}
		return 0;
	}
}

