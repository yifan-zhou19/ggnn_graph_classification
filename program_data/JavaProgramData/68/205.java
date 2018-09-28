package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int m;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{

			for (j = 3;j <= i / 2;j += 2)
			{
				m = 0;
				t = 0;
				for (k = 3;k <= Math.sqrt(j) + 1;k += 2)
				{
					if (j % k == 0)
					{
						m = 1;
					}
				}
				if (m == 0)
				{
					for (k = 3;k <= Math.sqrt(i - j) + 1;k += 2)
					{
						if ((i - j) % k == 0)
						{
							t = 1;
						}
					}
					if (t == 0)
					{
						System.out.printf("%d=%d+%d\n",i,j,(i - j));
						break;
					}
				}
			}
		}
		return 0;
	}


}

