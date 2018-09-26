package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int m;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			m = 0;
			k = 0;
			System.out.printf("%d=",i);
			for (a = 3;a <= i / 2;a = a + 2)
			{
				m = 0;
				k = 0;
				b = i - a;
				for (l = 3;l <= Math.sqrt(a);l = l + 2)
				{
					if (a % l != 0)
					{
						m = m + 1;
					}
					k = k + 1;
				}
				if (m == k)
				{

					m = 0;
					k = 0;
					for (j = 3;j <= Math.sqrt(b);j = j + 2)
					{
						if (b % j != 0)
						{
						m = m + 1;
						}
						k = k + 1;
					}
					if (m == k)
					{
						System.out.printf("%d+%d\n",a,b);
						break;
					}
				}
			}
		}
	}
}

