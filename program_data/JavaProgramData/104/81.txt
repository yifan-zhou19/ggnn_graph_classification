package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int x;
		int y;
		int t;
		int m;
		int n;
		int p;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 10000;i++)
		{
			if (a[i] == 1)
			{
				x = i + 2;
				break;
			}
			else
			{
				a[i + 1] = a[i] / 2;
			}
		}
		for (i = 0;i < 10000;i++)
		{
			if (b[i] == 1)
			{
				y = i + 2;
				break;
			}
			else
			{
				b[i + 1] = b[i] / 2;
			}
		}
		m = x / 2;
		for (i = 0;i < m;i++)
		{
			t = a[i];
			a[i] = a[x - i - 1];
			a[x - i - 1] = t;
		}
		n = y / 2;
		for (i = 0;i < n;i++)
		{
			t = b[i];
			b[i] = b[y - i - 1];
			b[y - i - 1] = t;
		}
		for (i = 0;i < x;i++)
		{
			if (a[i] == b[i])
			{
				p = a[i];
			}
		}
		System.out.printf("%d",p);
	}
}

