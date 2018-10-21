package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j;
		int num1 = 0;
		int k;
		if (num >= 0)
		{
		for (i = 1;i <= num;i = i * 10)
		{
			;
		}
		i = k = i / 10;
		for (j = 1;j <= k;j = j * 10)
		{
		   num1 = num1 + num / i * j;
		   num = num - num / i * i;
		   i = i / 10;
		}
		}
		else if (num < 0)
		{
		for (i = 1;i <= (-num);i = i * 10)
		{
			;
		}
		i = k = i / 10;
		for (j = 1;j <= k;j = j * 10)
		{
		   num1 = num1 + num / i * j;
		   num = num - num / i * i;
		   i = i / 10;
		}

		}
		return (num1);
	}

	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int[] b = new int[6];
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
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}

}

