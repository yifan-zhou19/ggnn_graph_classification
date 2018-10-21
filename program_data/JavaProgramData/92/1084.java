package <missing>;

public class GlobalMembers
{
	public static int[] speedK = new int[1000];
	public static int[] speedT = new int[1000];
	public static int horseNum;
	public static int search()
	{
		int leftIndexK = 0;
		int rightIndexK = horseNum - 1;
		int leftIndexT = 0;
		int rightIndexT = horseNum - 1;
		int resultCount = 0;
		while (leftIndexT != rightIndexT)
		{
			if (speedT[rightIndexT] > speedK[rightIndexK])
			{
			resultCount++;
			rightIndexT--;
			rightIndexK--;
			}
		else if (speedT[leftIndexT] > speedK[leftIndexK])
		{
			 resultCount++;
			 leftIndexT++;
			 leftIndexK++;
		}
			 else
			 {
			 if (speedK[rightIndexK] - speedT[leftIndexT] > 0)
			 {
					resultCount--;
			 }
			 rightIndexK--;
			 leftIndexT++;
			 }
		}
		 if (speedK[leftIndexK] - speedT[leftIndexT] > 0)
		 {
		resultCount--;
		 }
		 else if (speedK[leftIndexK] - speedT[leftIndexT] < 0)
		 {
			 resultCount++;
		 }
		 return resultCount;
	}
	public static int Main()
	{
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			horseNum = Integer.parseInt(tempVar);
		}
		if (horseNum == 0)
		{
			break;
		}
		for (int i = 0; i < horseNum; i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 speedT + i = tempVar2;
			 }
		}
		for (int i = 0; i < horseNum; i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 speedK + i = tempVar3;
			 }
		}
		sort(speedT, speedT + horseNum);
		sort(speedK, speedK + horseNum);
		int count = search();
		System.out.printf("%d\n", count * 200);
		}
		 return 0;
	}

}

