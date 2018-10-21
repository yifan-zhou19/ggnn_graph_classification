package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int m;
		int p;
		int sign = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = n + k;
		while (sign == 0)
		{
			p = m;
			sign = 1;
			for (i = 0;i < n;i++)
			{
				if (p % n != k || p < n + k)
				{
					sign = 0;
					break;
				}
				p = p - p / n - k;
			}
			if (sign != 0)
			{
				System.out.printf("%d",m);
				break;
			}
			m++;
		}
	}
}

