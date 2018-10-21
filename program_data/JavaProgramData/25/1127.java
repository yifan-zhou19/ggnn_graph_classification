package <missing>;

public class GlobalMembers
{
	public static char[] number = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static void fraction()
	{
		int yushu = 0;
		for (int i = 100;i >= 0;i--)
		{
			if (number[i] != '0')
			{
			number[i] = number[i] * 2 - '0' + yushu;
			}
			else
			{
				number[i] = number[i] + yushu;
				yushu = 0;
			}
			if (number[i] > '9')
			{
				number[i] = number[i] - 10;
				yushu = 1;
			}
			else
			{
				yushu = 0;
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 100;i++)
		{
			number[i] = '0';
		}
		number[100] = '1';
		for (int i = 0;i < n;i++)
		{
			fraction();
		}
		int start = 0;
		for (int i = 0;i <= 100;i++)
		{
			if (number[i] != '0')
			{
				start = i;
				break;
			}
		}
		for (int i = start;i <= 100;i++)
		{
		System.out.print(number[i]);
		}

		return 0;

	}
}

