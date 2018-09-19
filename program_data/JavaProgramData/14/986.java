package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int max;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int hao,yuwen,shuxue,zong;
	//	}
	//	stu[100000];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].hao = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead("""");
			if (tempVar3 != null)
			{
				stu[i].yuwen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead("""");
			if (tempVar4 != null)
			{
				stu[i].shuxue = tempVar4;
			}
			stu[i].zong = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			max = stu[0].zong;
			for (j = 1;j < n;j++)
			{
				if (stu[j].zong > max)
				{
					max = stu[j].zong;
					m = j;
				}
			}
						System.out.printf("%d %d\n",stu[m].hao,max);
				stu[m].zong = 0;

		}



	}
}

