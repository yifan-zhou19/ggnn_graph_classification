package <missing>;

public class GlobalMembers
{
	public static int run(int x)
	{
		if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0)))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int j;
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i < n ; i++)
		{
			int year;
			int mona;
			int monb;
			int max;
			int min;
			int run = int x;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				mona = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				monb = Integer.parseInt(tempVar4);
			}
			if (mona > monb)
			{
				max = mona;
				min = monb;
			}
			else
			{
				max = monb;
				min = mona;
			}
			if (run(year) == 0)
			{
				for (j = min ; j < max ; j++)
				{
					if (j == 2)
					{
						day += 29;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day += 30;
					}
					else
					{
						day += 31;
					}

				}
			}
			if (run(year) == 1)
			{
				for (j = min ; j < max ; j++)
				{
					if (j == 2)
					{
						day += 28;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day += 30;
					}
					else
					{
						day += 31;
					}

				}
			}

			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			day = 0;




		}
		return 0;
	}


}

