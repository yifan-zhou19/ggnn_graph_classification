package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] high = new int[4];
		int[] higher = new int[4];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		  int num;
	//		  int yuwen;
	//		  int shuxue;
	//		  int total;
	//	}
	//	stu[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			stu[i].total = stu[i].yuwen + stu[i].shuxue;
			if (stu[i].total > high[1])
			{
				high[1] = stu[i].total;
				higher[1] = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (stu[i].total <= high[1] != 0 && stu[i].total> high[2] && i != higher[1])
			{
				 high[2] = stu[i].total;
				 higher[2] = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (stu[i].total <= high[2] != 0 && stu[i].total> high[3] && i != higher[1] && i != higher[2])
			{
				 high[3] = stu[i].total;
				 higher[3] = i;
			}
		}

		for (i = 1;i < 4;i++)
		{
			System.out.printf("%d %d\n",higher[i],high[i]);
		}
	}
}

