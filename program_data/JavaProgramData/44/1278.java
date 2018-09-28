package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int k;
		int l;
		int m;
		int ans;
		if (num < 0)
		{
			m = -1;
			num = 0 - num;
		}
		else
		{
			m = 1;
		}
		k = 0;
		while (num != 0)
		{
			k = k * 10 + num % 10;
			num = (num - (num % 10)) / 10;
		}
		ans = k * m;
		return ans;
	}

	public static int Main()
	{
		int r;
		int t;
		for (r = 0;r < 6;r++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(t));
		}
	}
}

