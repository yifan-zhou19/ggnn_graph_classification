package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] year = new int[201];
		int[] month1 = new int[201];
		int[] month2 = new int[201];
		int[] huan = new int[201];
		huan[201] = 0;
		int[] days = new int[201];

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
				month1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2[i] = Integer.parseInt(tempVar4);
			}

			if (month1[i] > month2[i])
			{
				huan[i] = month1[i];
				month1[i] = month2[i];
				month2[i] = huan[i];
			}
			days[i] = 0;
		}

		for (i = 0;i < n;i++)
		{

			for (j = month1[i];j < month2[i];j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					days[i] += 31;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					days[i] += 30;
				}
				else if (j == 2)
				{
					if (year[i] % 400 == 0 || (year[i] % 4 == 0 && year[i] % 100 != 0))
					{
						days[i] += 29;
					}
					else
					{
						days[i] += 28;
					}
				}
			}
			if (days[i] % 7 == 0)
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

