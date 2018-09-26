package <missing>;

public class GlobalMembers
{
	public static int sushu(int t)
	{
		int r;
		int cnt = 0;
		r = (int)Math.sqrt(t);
		for (int i = 1;i <= r;i++)
		{
			if (t % i == 0)
			{
				cnt++;
			}
		}
		if (cnt == 1)
		{
			return t;
			cnt = 0;
		}
		else
		{
			return 0;
			cnt = 0;
		}
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (int)(m / 2);i = i + 2)
		{
			j = m - i;
			if (sushu(i) == i && sushu(j) == j)
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		System.in.read();
		System.in.read();
	}

}

