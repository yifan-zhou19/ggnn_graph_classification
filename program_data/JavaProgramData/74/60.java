package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[10000];
		int i;
		int j;
		int k = 0;
		int p = 0;
		int q = 0;
		int t;
		int[] b = new int[100];
		b[0] = -1;
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
			for (j = 2;j <= i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (i == j)
			{
				a[k] = i;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			t = a[i];
			while (t > 0)
			{
				p = p * 10 + t % 10;
				t /= 10;
			}
			if (p == a[i])
			{
				b[q] = a[i];
				q++;
			}
			p = 0;
		}
		if (b[0] > 0)
		{
			for (i = 0;i < q - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d",b[q - 1]);
		}
		else
		{
			System.out.print("no");
		}
	}
}

