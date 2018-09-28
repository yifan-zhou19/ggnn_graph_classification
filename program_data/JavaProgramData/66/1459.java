package <missing>;

public class GlobalMembers
{
	public static int runnian(int a)
	{
		if (a % 4 == 0 && a % 400 == 0)
		{
			return 1;
		}
		if (a % 4 == 0 && a % 100 != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int tian(int nian,int yue,int ri)
	{
		int sum = 0;
		int i;
		int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] feirun = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (runnian(nian) == 1)
		{
			for (i = 0;i <= yue-2;i++)
			{
				sum += run[i];
			}
			sum += ri;
		}
		else
		{
			for (i = 0;i <= yue-2;i++)
			{
				sum += feirun[i];
			}
			sum += ri;
		}
		return sum;
	}

	public static int Main()
	{
		int nian;
		int yue;
		int ri;
		int all = 0;
		int i;
		nian = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yue = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ri = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (nian > 2000)
		{
			nian = nian % 2000;
		}
		for (i = 1;i < nian;i++)
		{
			if (runnian(i) == 1)
			{
				all += 366;
			}
			else
			{
				all += 365;
			}
		}
		all += tian(nian, yue, ri);
		String[] xingqi = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		System.out.print(xingqi[(all - 1) % 7]);
		System.out.print("\n");

		return 0;
	}
}

