package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int i;
		int max1 = 0;
		int max2 = 0;
		int[] score = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= r - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				score[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= r - 1;i++)
		{
			if (score[i] > max1)
			{
	max2 = max1;

				max1 = score[i];
			}
			else if (score[i] > max2)
			{
				max2 = score[i];
			}

		}
		System.out.printf("%d\n%d",max1,max2);
		 return 0;
	}

}

