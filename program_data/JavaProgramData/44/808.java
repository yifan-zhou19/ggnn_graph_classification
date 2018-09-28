package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int j;
		int result;
		for (j = 0;;j++)
		{
			if (num / (int)(Math.pow(10,j)) == 0)
			{
				break;
			}
		}
		result = res(num, j, 0);
		return result;
	}
	public static int res(int q, int w, int t)
	{
		int e;
		int r;
		e = ((int)(q / Math.pow(10,t))) % 10;
		r = ((int)(q / Math.pow(10,w - t - 1))) % 10;
		q = q + Math.pow(10,t) * (r - e) + Math.pow(10,w - t - 1) * (e - r);
		t++;
		if (t >= w / 2)
		{
			return q;
		}
		q = res(q, w, t);
		return q;
	}
	public static int Main()
	{
		int[] n = new int[7];
		int[] n1 = new int[7];
		int i;
		char c;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			if (n[i] < 0)
			{
				n1[i] = 0 - n[i];
				c = '-';
			}
			else
			{
				n1[i] = n[i];
				c = '+';
			}
			if (c == '+')
			{
				System.out.printf("%d\n",reverse(n1[i]));
			}
			if (c == '-')
			{
				System.out.printf("-%d\n",reverse(n1[i]));
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

