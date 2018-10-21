package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int time;
		int jump;
		int broken;
		int i;
		int j;
		int b;
		int[] sum = new int[101];
		int[] brokenjump = new int[21];
		for (i = 1,broken = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				broken = Integer.parseInt(tempVar2);
			}
			if (broken == 0)
			{
						  sum[i] = 60;
						  continue;
			}
			for (j = 1;j <= broken;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					brokenjump[j] = Integer.parseInt(tempVar3);
				}
			}
			for (time = 0,jump = 0,b = 1;time < 60;)
			{
				if ((jump == brokenjump[b]) && b <= broken)
				{
						   time = time+3;
						   b++;
				}
				else
				{
						   jump++;
						   time++;
				}
			}
			sum[i] = jump;
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
			return 0;
	}

}

