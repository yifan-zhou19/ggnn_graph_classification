package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int r = int num;
		int i;
		int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",r(n));
		}
	}
	public static int r(int n)
	{
		int k;
		int i;
		int m = 0;
		int w = 1;
		int[] digit = new int[10];
		if (n < 0)
		{
			n = Math.abs(n);
			for (k = 0;n != 0;k++)
			{
				digit[k] = n % 10;
				n /= 10;
			}
			for (i = k - 1;i >= 0;i--)
			{
				m += digit[i] * w;
				w *= 10;
			}
			m = -m;
			return m;
		}
		else
		{
			for (k = 0;n != 0;k++)
			{
				digit[k] = n % 10;
				n /= 10;
			}
			for (i = k - 1;i >= 0;i--)
			{
				m += digit[i] * w;
				w *= 10;
			}
			return m;
		}

	}
}

