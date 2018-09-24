package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[105];
	public static void times()
	{
		int i;
		int j;
		int[] temp = new int[105];
		for (i = 104;i >= 0;i--)
		{
		if (num[i] != 0)
		{
			break;
		}
		}
		for (j = 0;j <= i;j++)
		{
			temp[j] = num[i - j];
			temp[j] = temp[j] * 2;
		}
		for (j = 0;j <= i;j++)
		{
			temp[j + 1] += temp[j] / 10;
			 temp[j] = temp[j] % 10;
		}
		if (temp[i + 1] == 0)
		{
			for (j = 0;j <= i;j++)
			{
			num[j] = temp[i - j];
			}
		}
		else
		{
			for (j = 0;j <= i + 1;j++)
			{
			 num[j] = temp[i + 1 - j];
			}
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int stop;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 1;
		for (i = 0;i < n;i++)
		{
		times();
		}
		for (stop = 104;num[stop] == 0;stop--)
		{
			;
		}
		for (i = 0;i <= stop;i++)
		{
		System.out.print(num[i]);
		}
		return 0;
	}

}

