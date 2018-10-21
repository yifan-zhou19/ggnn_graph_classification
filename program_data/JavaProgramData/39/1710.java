package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//	 int score;
	//	 int fame;
	//	   char leader;
	//	 char west;
	//	 int paper;
	//	}
	//	stu[100];

		int i;
		int n;
		int max = 0;
		int k;
		int t;
		int[] Price = {8000, 4000, 2000, 1000, 850};
		int sum = 0;

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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].score = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].fame = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
		}

		for (i = 0;i < n;i++)
		{
			t = 0;
			if (stu[i].score > 80 && stu[i].paper > 0)
			{
				t += Price[0];
			}
			if (stu[i].score > 85 && stu[i].fame > 80)
			{
				t += Price[1];
			}
			if (stu[i].score > 90)
			{
				t += Price[2];
			}
			if (stu[i].score > 85 && stu[i].west == 'Y')
			{
				t += Price[3];
			}
			if (stu[i].fame > 80 && stu[i].leader == 'Y')
			{
				t += Price[4];
			}

			sum += t;
			if (t > max)
			{
				max = t;
				k = i;
			}
		}


		System.out.printf("%s\n%d\n%ld",stu[k].name,max,sum);

	}

}

