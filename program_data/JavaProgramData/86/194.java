package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] mis = new int[100];
		int[][] sum = new int[100][20];
		int i;
		int e;
		int time;
		int t;
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
				mis[i] = Integer.parseInt(tempVar2);
			}
			for (e = 0;e < mis[i];e++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sum[i][e] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (e = 0;e < mis[i];e++)
			{
				time = sum[i][e] + 3 * e;
				if (time <= 60 && time >= 57)
				{
					t = sum[i][e];
					System.out.printf("%d\n", t);
					break;
				}
				if (time > 60)
				{
				   t = 60 - 3 * e;
				   System.out.printf("%d\n", t);
				   break;
				}
			}
			if (time < 57)
			{
				t = 60 - 3 * mis[i];
				System.out.printf("%d\n", t);
			}
		}
		return 0;
	}
}

