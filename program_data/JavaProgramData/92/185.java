package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int[] store = new int[100];
		for (num = 0;;num++)
		{
		int i;
		int n;
		int j;
		int[] a = new int[100000];
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
				break;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		a[n] = 2147483647;
		b[n] = 2147483647;
		for (i = 0;i < n;i++)
		{
			int t;
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			int t;
			for (j = 0;j < n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		int money = 0;
		int x;
		int q = 0;
		int[] m = new int[100000];
		for (x = 0;x < n;x++)
		{
			int t;
			t = a[0];
			for (i = 0;i < n;i++)
			{
				a[i] = a[i + 1];
			}
			a[n - 1] = t;
		for (i = 0;i < n;i++)
		{
			if (a[i] > b[i])
			{
				money = money + 200;
			}
			else
			{
				if (a[i] < b[i])
				{
					money = money - 200;
				}
			}
		}
		m[q] = money;
		money = 0;
		q++;
		}
		int max = m[0];
		for (i = 1;i < n;i++)
		{
			if (m[i] >= max)
			{
				max = m[i];
			}
		}
		store[num] = max;

		}
	int w;
	for (w = 0;w < num;w++)
	{
	System.out.printf("%d\n",store[w]);
	}
	}

}

