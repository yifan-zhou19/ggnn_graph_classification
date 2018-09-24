package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int set(int i)
	{
		int lastNum = num;
		int lastcurrH = currH;
		if (i == k - 1)
		{
			if (a[i] <= currH)
			{
				num++;
			}
			if (num > MaxNum)
			{
				MaxNum = num;
			}
			num = lastNum;
			currH = lastcurrH;
			return 0;
		}
			if (b[i] == 0)
			{
				set(i + 1);
			}
		b[i]++;


		if (b[i] == 1)
		{
			if (a[i] <= currH)
			{
				currH = a[i];
				num++;
			}
			set(i + 1);
		}


		num = lastNum;
		currH = lastcurrH;
		b[i] = 0;
		return 0;
	}
	public static int num = 0;
	public static int currH = 100000;
	public static int MaxNum = 0;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int Main()
	{
		int i;
		for (i = 0;i < 100;i++)
		{
			b[i] = 0;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			int j;
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = j;
		}
		set(0);
		System.out.print(MaxNum);
		return 0;
	}

}

