package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int l = 10;
		int k = 0;
		if (-0 == num)
		{
			k = 0;
		}
		else if ((num >= -9) && (num <= 9))
		{
			k = num;
		}
		else if (num > 9)
		{
			int[] a = new int[100];
			int i = 0;
			while (true)
			{
				a[i] = num % 10;
				num = (num - a[i]) / 10;
				i++;
				if (num <= 9)
				{
					a[i] = num;
					break;
				}
			}
			int p = i + 1;
			while (p > 0)
			{
				k = (int)(a[i + 1 - p] * Math.pow((double)l,p - 1)) + k;
				p--;
			}
		}
		else
		{
			num = -num;
			int[] a = new int[100];
			int i = 0;
			while (true)
			{
				a[i] = num % 10;
				num = (num - a[i]) / 10;
				i++;
				if (num <= 9)
				{
					a[i] = num;
					break;
				}
			}
			int p = i + 1;
			while (p > 0)
			{
				k = (int)(a[i + 1 - p] * Math.pow((double)l,p - 1)) + k;
				p--;
			}
			k = -k;
		}
		return k;
	}
	public static int Main()
	{
		int i = 1;
		while (i <= 6)
		{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",(int)reverse(n));
			i++;
		}
		return 0;
	}
}

