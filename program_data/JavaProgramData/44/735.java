package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int num;
		int jieguo;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			jieguo = reverse(num);
			System.out.printf("%d\n",jieguo);
		}
		return 0;
	}

	public static int reverse(int num)
	{
		int[] a = new int[10000];
		int i = 0;
		int j;
		int m = 1;
		int M = 0;
		if (num < 0)
		{
			num = -num;
			while (num > 0)
			{
				a[i] = num % 10;
				num = num / 10;
				i++;
			}
			for (j = 0;j < i;j++)
			{
				M = M + a[i - 1 - j] * m;
				m = m * 10;
			}
			num = -M;
		}
		else
		{
			while (num > 0)
			{
				a[i] = num % 10;
				num = num / 10;
				i++;
			}
			for (j = 0;j < i;j++)
			{
				M = M + a[i - 1 - j] * m;
				m = m * 10;
			}
			num = M;
		}
		return (num);
	}

}

