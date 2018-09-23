package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int ID;
	//		int yuwen;
	//		int shuxue;
	//		int zongfen;
	//	};
		student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		int n;
		int i;
		int max;
		int maxID;
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
				student[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].yuwen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].shuxue = tempVar4;
			}
		}
		for (i = 1;i <= n;i++)
		{
			student[i].zongfen = student[i].yuwen + student[i].shuxue;
		}
		for (int j = 1;j <= 3;j++)
		{
			maxID = 1;
			max = student[1].zongfen;
			for (i = 2;i <= n;i++)
			{
				if (student[i].zongfen > max)
				{
					maxID = student[i].ID;
					max = student[i].zongfen;
				}
			}
			System.out.printf("%d %d\n",maxID,max);
			student[maxID].zongfen = 0;
		}
	}
}

