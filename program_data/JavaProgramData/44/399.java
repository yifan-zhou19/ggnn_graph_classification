package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i = 0;
		int[] a = new int[100];
		int m = 0;
		int j;
		int y = 1;
	 if (num < 0)
	 {
		 num = -num;
	 y = 0;
	 }
		while (true)
		{
			if (num < 10)
			{
				break;
			}
			a[i] = num % 10;
			num = num / 10;
			i++;
		}
		for (j = 0;j < i;j++)
		{
			m += a[j] * (Math.pow(10,(i - j)));
		}
		m += num;
		if (y == 0)
		{
			return -m;
		}
		else
		{
			return m;
		}
	}
	public static int Main()
	{
		int i = 0;
		int j;
		int n;
		while (i < 6)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			j = reverse(n);
					if (i < 5)
					{
			System.out.printf("%d\n",j);
					}
					else
					{
	System.out.printf("%d",j);
					}
	i++;
		}
		return 0;
	}
}

