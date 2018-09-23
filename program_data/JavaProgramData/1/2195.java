package <missing>;

public class GlobalMembers
{
	public static int t = 0;
	public static int mini(int k,int i) //�a?&#710;&#160;&#733;��o?��?�?&#174;?�?&#8250;?�&#8482;&#171;&#219;k?&#219;�&#8260;i
	{
		if (k == 1)
		{
			t = t + 1;
		}
		for (;i <= k;i++)
		{
			if (k % i == 0)
			{
				mini(k / i, i);
			}
		}
		return 0;
	}

	public static int Main()
	{
		int N;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (n = 0;n <= N - 1;n++)
		{
			int M;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			mini(M, 2);
			System.out.printf("%d\n",t);
			t = 0;
		}
	}

}

