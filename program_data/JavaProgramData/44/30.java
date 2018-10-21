package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int len;
		int sign;
		int out = 0; // Modified Unsigned
		int i;
		if (num == 0)
		{
			return 0;
		}
		sign = num / Math.abs(num);
		num = Math.abs(num);
		len = (int)Math.log10(num) + 1;
		for (i = 0; i < len; i++)
		{
			out += (num / (int)(Math.pow(10, i)) % 10) * Math.pow(10,len - i - 1);
		}
		return sign * out;

	}

	public static int Main()
	{
		int i;
		int temp;
		for (i = 0; i < 6; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				temp = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n", reverse(temp));
		}

		return 0;
	}
}

