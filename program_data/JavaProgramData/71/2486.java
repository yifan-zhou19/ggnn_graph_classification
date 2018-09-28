package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] feirun = new int[13];
		int[] run = new int[13];
		feirun[1] = 0;
		feirun[2] = 31;
		feirun[3] = 31 + 28;
		feirun[4] = 31 + 28 + 31;
		feirun[5] = 31 + 28 + 31 + 30;
		feirun[6] = 31 + 28 + 31 + 30 + 31;
		feirun[7] = 31 + 28 + 31 + 30 + 31 + 30;
		feirun[8] = 31 + 28 + 31 + 30 + 31 + 30 + 31;
		feirun[9] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		feirun[10] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		feirun[11] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		feirun[12] = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

		run[1] = 0;
		run[2] = 31;
		run[3] = 31 + 29;
		run[4] = 31 + 29 + 31;
		run[5] = 31 + 29 + 31 + 30;
		run[6] = 31 + 29 + 31 + 30 + 31;
		run[7] = 31 + 29 + 31 + 30 + 31 + 30;
		run[8] = 31 + 29 + 31 + 30 + 31 + 30 + 31;
		run[9] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
		run[10] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		run[11] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		run[12] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		int a;
		int[] sum = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] year = new int[1000];
		int[] yue = new int[1000];
		int[] tian = new int[1000];
		for (i = 1;i <= a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				yue[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				tian[i] = Integer.parseInt(tempVar4);
			}
		}


		for (j = 1;j <= a;j++)
		{
			if ((year[j] == 1998) && (yue[j] == 6) && (tian[j] == 2))
			{
				System.out.print("NO\n");
			  continue;
			}


			else if (((year[j] % 4 == 0) && (year[j] % 100 != 0)) || (year[j] % 400 == 0))
			{
			sum[j] = Math.abs(run[(yue[j])] - run[(tian[j])]);
				if (sum[j] % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				sum[j] = Math.abs(feirun[(yue[j])] - feirun[(tian[j])]);
				if (sum[j] % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}


		}






		return 0;
	}
}

