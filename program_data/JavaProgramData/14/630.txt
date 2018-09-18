package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int math;
		int chinese;
		int std_num;
		int first;
		int second;
		int third;
		int[] score = {-1, -1, -1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		first = 0;
		second = 0;
		third = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				std_num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			if (chinese + math > score[0])
			{
			   third = second;
			   second = first;
			   score[2] = score[1];
			   score[1] = score[0];
			   first = std_num;
			   score[0] = chinese + math;
			}
			else if (chinese + math > score[1])
			{
					third = second;
					score[2] = score[1];
					second = std_num;
					score[1] = math + chinese;
			}
			else if (chinese + math > score[2])
			{
					third = std_num;
					score[2] = math + chinese;
			}
		}
		System.out.printf("%d %d\n",first,score[0]);
		System.out.printf("%d %d\n",second,score[1]);
		System.out.printf("%d %d\n",third,score[2]);
		return 0;
	}

}

