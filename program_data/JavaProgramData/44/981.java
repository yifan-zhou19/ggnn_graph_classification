package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int[] a = new int[6];
		int[] b = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			b[i] = reverse(a[i]);
			System.out.printf("%d\n",b[i]);
		}
	}

	public static int reverse(int num)
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		if (Math.abs(num) >= 10000)
		{
			i = num / 10000;
			j = (num - 10000 * i) / 1000;
			k = (num - 10000 * i - 1000 * j) / 100;
			l = (num - 10000 * i - 1000 * j - 100 * k) / 10;
			m = num % 10;
			n = 10000 * m + 1000 * l + 100 * k + 10 * j + i;
		}
		else if (Math.abs(num) >= 1000)
		{
			i = num / 1000;
			j = (num - 1000 * i) / 100;
			k = (num - 1000 * i - 100 * j) / 10;
			l = num % 10;
			n = 1000 * l + 100 * k + 10 * j + i;
		}
		else if (Math.abs(num) >= 100)
		{
			i = num / 100;
			j = num / 10 - i * 10;
			k = num % 10;
			n = 100 * k + 10 * j + i;
		}
		else if (Math.abs(num) >= 10)
		{
			i = num / 10;
			j = num % 10;
			n = 10 * j + i;
		}
		else
		{
			n = num;
		}

		return (n);
	}



}

