package <missing>;

public class GlobalMembers
{
	public static int reverse(int digit)
	{
		int result;
		int[] n = new int[MAX];
		int i;
		int count;
		if (digit == 0)
		{
			return result = 0;
		}
		else if (digit == -0)
		{
			return result = 0;
		}
		else if (digit > 0)
		{
			i = count = 0;
			while (digit >= 1)
			{
				n[i] = digit % 10;
				digit = digit / 10;
				i++;
				count++;
			}
			result = 0;
			for (i = 0;i < count;i++)
			{
				result += n[i] * (int)Math.pow((double)10,(count - i - 1));
			}
			return result;
		}
		else
		{
			digit = Math.abs(digit);
			i = count = 0;
			while (digit >= 1)
			{
				n[i] = digit % 10;
				digit = digit / 10;
				i++;
				count++;
			}
			result = 0;
			for (i = 0;i < count;i++)
			{
				result += n[i] * (int)Math.pow((double)10,(count - i - 1));
			}
			result = -result;
			return result;
		}
	}
	public static int Main()
	{
		int i;
		int s;
		int t;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = Integer.parseInt(tempVar);
			}
			t = reverse(s);
			System.out.printf("%d\n",t);
		}

		return 0;
	}










}

