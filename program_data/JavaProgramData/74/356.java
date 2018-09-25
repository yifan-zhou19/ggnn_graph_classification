package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int s;
		int k;
		int j;
		int i;
		int b = 0;
		int d = 0;
		int[] a = new int[1000];
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			s = i;
			k = 0;
			while (s != 0)
			{
				k = 10 * k + s % 10;
				s = s / 10;
			}
			if (k == i)
			{
				a[d] = i;
				d++;
			}
		}
		k = d;
		for (i = 0;i < d;i++)
		{
			for (j = 2;j <= Math.sqrt(a[i]);j++)
			{
				if (a[i] % j == 0)
				{
					break;
				}
			}
			if (j <= Math.sqrt(a[i]))
			{
				a[i] = 0;
				k--;
			}
			else
			{
				x = 1;
			}
		}
		j = 0;
		for (i = 0;i < d;i++)
		{
			if (a[i] != 0)
			{
					j++;
				if (j < k)
				{
					System.out.printf("%d,",a[i]);
				}
				else
				{
					System.out.printf("%d",a[i]);
				}
			}
		}
		if (x == 0)
		{
			System.out.print("no");
		}
	}
}

