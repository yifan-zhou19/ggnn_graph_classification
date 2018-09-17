package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int findout = new int(int x,int y);
		int m;
		int n;
		int num;
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
		num = findout(m, n);
		System.out.printf("%d\n",num);
	}

	public static int findout(int x,int y)
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j;
		int k = 0;
		int l = 0;
		int t;
		int c;
		a[0] = x;
		for (i = 1;x != 1;i++)
		{
			if (x % 2 == 1)
			{
				x = (x - 1) / 2;
				a[i] = x;
			}
			else if (x % 2 == 0)
			{
				x = x / 2;
				a[i] = x;
			}
		}
		k = i;
		for (i = 0;i <= (k - 1) / 2;i++)
		{
			t = a[i];
			a[i] = a[k - 1 - i];
			a[k - 1 - i] = t;
		}

		b[0] = y;
		for (j = 1;y != 1;j++)
		{
			if (y % 2 == 1)
			{
				y = (y - 1) / 2;
				b[j] = y;
			}
			else if (y % 2 == 0)
			{
				y = y / 2;
				b[j] = y;
			}
		}
		l = j;
		for (j = 0;j <= (l - 1) / 2;j++)
		{
			t = b[j];
			b[j] = b[l - 1 - j];
			b[l - 1 - j] = t;
		}

		for (i = 0;i < k;i++)
		{
			if (a[i] == b[i] && a[i + 1] != b[i + 1])
			{
				break;
			}
		}

		if (a[k - 1] == 1 || b[l - 1] == 1)
		{
			c = 1;
		}
		else
		{
			c = a[i];
		}

		return (c);
	}

}

