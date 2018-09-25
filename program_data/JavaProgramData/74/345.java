package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int result = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				result = 0;
				break;
			}
		}
		return result;
	}
	public static int huiwen(int n)
	{
		int bit;
		int i;
		int t = 10;
		int[] a = new int[10];
		for (bit = 1;;bit++)
		{
			if (n / t != 0)
			{
				t *= 10;
			}
			else
			{
				break;
			}
		}
		t /= 10;
		for (i = 1;i <= bit;i++)
		{
			a[i] = n / t;
			n -= a[i] * t;
			t /= 10;
		}
		int out = 1;
		for (i = 1;i <= bit / 2;i++)
		{
			if (a[i] == a[bit - i + 1])
			{
				continue;
			}
			else
			{
				out = 0;
				break;
			}
		}
		return out;
	}

	public static void Main()
	{
		int m;
		int n;
		int y = 0;
		int i;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				y = 1;
				System.out.printf("%d",i);
				count = i;
				break;
			}
		}
		if (count != n)
		{
			for (i = count + 1;i <= n;i++)
			{
				if (sushu(i) != 0 && huiwen(i) != 0)
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (y == 0)
		{
			System.out.print("no");
		}


	}
}

