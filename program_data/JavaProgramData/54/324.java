package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		j = 1;
		while (j > 0)
		{
			t = 1;
			m = n * j + k;
			i = 2;
			while (i <= n)
			{
				if (m % (n - 1) == 0)
				{
					m = (m / (n - 1)) * n + k;
					i = i + 1;
				}
				else
				{
					t = 0;
					break;
				}
			}
			if (t == 1)
			{
				break;
			}
			else
			{
				j = j + 1;
			}
		}
		System.out.printf("%d",m);
	}
}

