package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		if (num == 0)
		{
			return 0;
		}
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int i;
		int j;
		int a;
		int k = 1;
		int result = 0;
		if (num < 0)
		{
			a = 0 - num;
		}
		if (num > 0)
		{
			a = num;
		}
		for (i = 1;1;i = i + 1)
		{
			k = k * 10;
			if ((a - k) < 0)
			{
				break;
			}
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (j == i - 1)
			{
				d[j] = 1;
			}
			else
			{
				d[j] = d[j + 1] * 10;
			}
		}
		for (j = 0;j < i;j++)
		{
			if (j == 0)
			{
				c[j] = a / d[j];
				e[j] = a;
			}
			else
			{
				c[j] = (e[j - 1] - d[j - 1] * c[j - 1]) / d[j];
				e[j] = e[j - 1] - d[j - 1] * c[j - 1];
			}
		}
		for (j = 0;j < i;j++)
		{
			result = result + c[j] * d[i - j - 1];
		}
		if (num > 0)
		{
			return result;
		}
		if (num < 0)
		{
			return (0 - result);
		}









	}
	public static int Main()
	{
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b[i] = reverse(a[i]);

		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;


	}
}

