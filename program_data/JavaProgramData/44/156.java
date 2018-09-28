package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int[] sw = new int[10];
		int[] sz = new int[10];
		int i;
		int wei = 10;
		int result = 0;
		if (n > 0)
		{
			for (i = 0;i < 10;i++)
			{
				sw[i] = (int)(Math.pow(10,i));
			}
			sz[9] = n / sw[9];
			for (i = 8;i >= 0;i--)
			{
				sz[i] = n % sw[i + 1] / sw[i];
			}
			for (i = 9;i >= 0;i--)
			{
				if (sz[i] == 0)
				{
					wei--;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < wei;i++)
			{
				result += sz[i] * sw[wei - i - 1];
			}
		}
		else if (n == 0)
		{
			result = 0;
		}
		else if (n < 0)
		{
			n = -n;
			for (i = 0;i < 10;i++)
			{
				sw[i] = (int)(Math.pow(10,i));
			}
			sz[9] = n / sw[9];
			for (i = 8;i >= 0;i--)
			{
				sz[i] = n % sw[i + 1] / sw[i];
			}
			for (i = 9;i >= 0;i--)
			{
				if (sz[i] == 0)
				{
					wei--;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < wei;i++)
			{
				result += sz[i] * sw[wei - i - 1];
			}
			result = -result;
		}
		return result;
	}
	public static int Main()
	{
		int num;
		int i;
		int reverse = int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num));
		}
		return 0;
	}
}

