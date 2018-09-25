package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	int num;
	//	int chi;
	//	int math;
	//	int sum;
	//}
	//score[100000],temp;
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
			score[i].num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			score[i].chi = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			score[i].math = tempVar4;
		}
		score[i].sum = score[i].chi + score[i].math;
	}
		for (i = 0;i < 4;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (score[j].sum > score[k].sum)
				{
					k = j;
				}
			}
			temp = score[k];
			score[k] = score[i];
			score[i] = temp;
		}
	System.out.printf("%d %d",score[0].num,score[0].sum);
	System.out.print("\n");
	System.out.printf("%d %d",score[1].num,score[1].sum);
	System.out.print("\n");
	System.out.printf("%d %d",score[2].num,score[2].sum);
	return 0;
	}
}

