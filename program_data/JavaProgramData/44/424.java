package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int k;
		int[] N = new int[100];
		int i;
		int rev;
		rev = 0;
		if (num < 10)
		{
			return num;
		}
		if (num >= 10)
		{
			k = 0;
			while (true)
			{
				if (num > 0)
				{
					N[k] = num % 10;
					k++;
					num /= 10;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < k;i++)
			{
				rev += Math.pow(10,i) * N[k - 1 - i];
			}
			return rev;
		}
	}

	public static int Main()
	{
		int i;
		int[] sz = new int[6];
		int[] rev = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			if (sz[i] < 0)
			{
				sz[i] = -sz[i];
				rev[i] = reverse(sz[i]);
				System.out.printf("-%d\n",rev[i]);
			}
			else
			{
				rev[i] = reverse(sz[i]);
				System.out.printf("%d\n",rev[i]);
			}
		}
		return 0;
	}
}

