package <missing>;

public class GlobalMembers
{
	public static int run(int a)
	{
		int day;
	if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
	{
		day = 3;
	}
	else if (a == 2)
	{
		day = 1;
	}
	else
	{
		day = 2;
	}
	return (day);
	}


	public static int feirun(int a)
	{
		int day;
	if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
	{
		day = 3;
	}
	else if (a == 2)
	{
		day = 0;
	}
	else
	{
		day = 2;
	}
	return (day);
	}


	public static int Main()
	{
		int n;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] year = new int[300];
		int[] mon1 = new int[300];
		int[] mon2 = new int[300];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		for (i = 0;i < n;i++)
		{
			sum = 0;
			if (year[i] % 400 == 0 || year[i] % 4 == 0 && year[i] % 100 != 0)
			{
				if (mon1[i] > mon2[i])
				{
					for (j = mon2[i];j < mon1[i];j++)
					{
						sum = sum + run(j);
					}
				}
				else
				{
					for (j = mon1[i];j < mon2[i];j++)
					{
						sum = sum + run(j);
					}
				}
			}
			else
			{
				if (mon1[i] > mon2[i])
				{
					for (j = mon2[i];j < mon1[i];j++)
					{
						sum = sum + feirun(j);
					}

				}
				else
				{
					for (j = mon1[i];j < mon2[i];j++)
					{
						sum = sum + feirun(j);
					}

				}
			}
			if (sum % 7 == 0)
			{
					System.out.print("YES");
					System.out.print("\n");
			}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
		}
		return 0;
	}







}

