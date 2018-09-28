package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int f;
		int[] year = new int[200];
		int[] mon1 = new int[200];
		int day;
		int[] mon2 = new int[200];
		int t1;
		int t2;
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
			if (((year[i] % 4 == 0) && (year[i] % 100 != 0)) || (year[i] % 400 == 0))
			{
				f = 29;
			}
			else
			{
				f = 28;
			}

			t1 = 0;
			t2 = 0;
			for (j = 1;j < mon1[i];j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					day = 31;
				}
				else
				{
					if (j == 2)
					{
					day = f;
					}
					else
					{
						day = 30;
					}
				}
				t1 = t1 + day;
			}
			for (k = 1;k < mon2[i];k++)
			{
				if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10)
				{
					day = 31;
				}
				else
				{
					if (k == 2)
					{
					day = f;
					}
					else
					{
						day = 30;
					}
				}
				t2 = t2 + day;
			}
			if (((t2 - t1) % 7 == 0) || ((t1 - t2) % 7 == 0))
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

