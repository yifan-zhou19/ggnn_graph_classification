package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int d;
		int j;
		int sum1;
		int sum2;
		int[] year = new int[200];
		int[] mon1 = new int[200];
		int[] mon2 = new int[200];
		int[] count = new int[200];
		int[] ping = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leap = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mon1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				mon2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (year[i] % 4 != 0)
			{
				count[i] = 0;
			}
			else if (year[i] % 100 != 0)
			{
				count[i] = 1;
			}
			else if (year[i] % 400 != 0)
			{
				count[i] = 0;
			}
			else
			{
				count[i] = 1;
			}
		}

		for (i = 0;i < n;i++)
		{
				sum1 = 0;
				sum2 = 0;
				d = 0;
			if (count[i] == 0)
			{

				for (j = 0;j < mon1[i];j++)
				{
				sum1 += ping[j];
				}
				for (j = 0;j < mon2[i];j++)
				{
				sum2 += ping[j];
				}
				d = sum2 - sum1;
			if (d % 7 == 0)
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
				for (j = 0;j < mon1[i];j++)
				{
				sum1 += leap[j];
				}
				for (j = 0;j < mon2[i];j++)
				{
				sum2 += leap[j];
				}
			d = sum2 - sum1;
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

			}

		}






	}



}

