package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int rev = 0;
		int k;
		if (num == 0)
		{
			return (0);
		}
		else if (num > 0)
		{
			for (k = 1;(num / k) >= 10;k *= 10)
			{
				;
			}
	//		printf("k=%d",k);
			for (i = 1;k >= 1;k /= 10,i *= 10)
			{
				rev += i * (num / k);
				num -= k * (num / k);
			}
		}
		else if (num < 0)
		{
			rev = -1 * reverse(-1 * num);
		}
		return (rev);

	}

	public static void Main()
	{
		int[] num = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(num[i]));
		}
	}

}

