package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//	int score1;
	//	int score2;
	//	}
	//	stu[100000];
			 int n;
		int i;
		int[] score = new int[100000];
		int[] max = new int[3];
		int[] a = new int[3];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].score1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].score2 = tempVar4;
			}
			score[i] = stu[i].score1 + stu[i].score2;
		}
		for (i = 0;i < n;i++)
		{
			if (max[0] < score[i])
			{
				max[0] = score[i];
				a[0] = stu[i].num;
			}
		}

		 for (i = 0;i < n;i++)
		 {
			 if (stu[i].num == a[0])
			 {
				 continue;
			 }
		 else if (max[1] < score[i])
		 {
			 max[1] = score[i];
			 a[1] = stu[i].num;
		 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 if (stu[i].num == a[1] || stu[i].num == a[0])
			 {
				 continue;
			 }
		 else if (max[2] < score[i])
		 {
			 max[2] = score[i];
			 a[2] = stu[i].num;
		 }
		 }
		 for (i = 0;i < 3;i++)
		 {
			 System.out.printf("%d %d\n",a[i],max[i]);
		 }
	}
}

