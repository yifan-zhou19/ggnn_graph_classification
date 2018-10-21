package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int diyi;
		int dier;
		int disan;
		diyi = 0;
		dier = 0;
		disan = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int yuwen;
	//		int shuxue;
	//		int sum;
	//	}
	//	stu[99999];
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
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yuwen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shuxue = tempVar4;
			}
			stu[i].sum = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum > stu[diyi].sum)
			{
				diyi = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			while (i != diyi)
			{
				dier = i;
				break;
			}
			break;
		}
		for (i = 0;i < n;i++)
		{
			if (i != diyi)
			{
			if (stu[i].sum > stu[dier].sum)
			{
				dier = i;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			while (i != diyi && i != dier)
			{
				disan = i;
				break;
			}
			break;
		}
		for (i = 0;i < n;i++)
		{
			if (i != diyi && i != dier)
			{
			if (stu[i].sum > stu[disan].sum)
			{
				disan = i;
			}
			}
		}
		System.out.printf("%d %d\n",diyi + 1,stu[diyi].sum);
		System.out.printf("%d %d\n",dier + 1,stu[dier].sum);
		System.out.printf("%d %d\n",disan + 1,stu[disan].sum);
	}

}

