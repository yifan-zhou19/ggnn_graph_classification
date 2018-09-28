package <missing>;

public class GlobalMembers
{
	public static int num(int n,int k)
	{
		int i;
		int j;
		int sign = 0;
		int m;
		for (j = 1; sign == 0 ; j++)
		{
			sign = 1;
			for (m = j, i = n; i >= 1; i--)
			{
				if ((m * n) % (n - 1) != 0)
				{
					sign = 0;
					break;
				}
				else
				{
					m = k + m * n / (n - 1);
				}
			}
		}
		return m;
	}
	public static void Main()
	{
		int m;
		int n;
		int k;
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
		m = num(n, k);
		System.out.printf("%d\n",m);
	}
}

