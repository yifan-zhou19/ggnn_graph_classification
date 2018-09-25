package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day = new int[200];
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
				year[i - 1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1[i - 1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2[i - 1] = Integer.parseInt(tempVar4);
			}
			//scanf("\n");
		}
		for (i = 1;i <= n;i++)
		{
			day[i - 1] = 0;
			if (month1[i - 1] > month2[i - 1])
			{
				k = month1[i - 1];
				month1[i - 1] = month2[i - 1];
				month2[i - 1] = k;
			}

			for (j = month1[i - 1];j < month2[i - 1];j++)
			{
				day[i - 1] += month[j - 1];
			}
			/*for(j=1;j<=month1[i-1]-1;j++)
			{
				day[i-1]-=month[j-1];
			}*/
			if (((year[i - 1] % 4 == 0 && year[i - 1] % 100 != 0) || year[i - 1] % 400 == 0) && month1[i - 1] < 3 && month2[i - 1] >= 3)
			{
				day[i - 1]++;
			}
			if (day[i - 1] % 7 == 0)
			{
				System.out.print("YES\n");
			}
				else
				{
					System.out.print("NO\n");
				}
		}
		return 0;
	}


}

