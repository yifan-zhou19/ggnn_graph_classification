package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int t;
		int s;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (k = 3;k <= i / 2;k = k + 2)
			{
				j = 3;
				while (k % j != 0 && j <= Math.sqrt(k))
				{
					j = j + 2;
				}
				if (j > Math.sqrt(k))
				{
					t = i - k;
					if (t % 2 == 0)
					{
						continue;
					}
					s = 3;
					while (t % s != 0 && s <= Math.sqrt(t))
					{
						s = s + 2;
					}
					if (s > Math.sqrt(t))
					{
						System.out.printf("%d=%d+%d\n",i,k,t);
						break;
					}
				}
			}
		}
	}

}

