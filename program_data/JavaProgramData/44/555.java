package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int result = 0;
		int[] number = new int[100];
		int k = 0;
		int i = 0;
		int j = 0;
		if (num >= 0)
		{
			for (i = 0;num >= 0;i++)
			{
				k = num / 10;
				number[i] = num - 10 * k;
				num = k;
				if (num == 0)
				{
					break;
				}
			}
			for (j = 0;j <= i;j++)
			{
				result = result + number[j] * Math.pow(10.0,i - j);
			}
		}
		else
		{
			num = -num;
			for (i = 0;num >= 0;i++)
			{
				k = num / 10;
				number[i] = num - 10 * k;
				num = k;
				if (num == 0)
				{
					break;
				}
			}
			for (j = 0;j <= i;j++)
			{
				result = result + number[j] * Math.pow(10.0,i - j);
			}
			result = -result;
		}
		return result;
	}

	public static int Main()
	{
		int num = 0;
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			System.out.print(reverse(num));
			System.out.print("\n");
		}
		return 0;
	}

}

