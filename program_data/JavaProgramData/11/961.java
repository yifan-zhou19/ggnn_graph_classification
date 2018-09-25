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
		nian = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yue = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ri = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(tian(nian, yue, ri));
		System.out.print("\n");
		return 0;
	}
}

