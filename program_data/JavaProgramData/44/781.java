package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int p;
		int q;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
			q = reverse(p);
			System.out.printf("%d\n",q);
		}
		return 0;
	}

	public static int reverse(int num)
	{
		int t;
		int sign;
		int b = 0;
		t = Math.abs(num);
		while (t > 0)
		{
			b = b * 10 + t % 10;
			t /= 10;
		}
		sign = (num >= 0)?1:-1;
		b = sign * b;
		return b;
	}
}

