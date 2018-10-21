package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1)
		{
			return (-1);
		}
		else
		{
			int i;
			int[] a = new int[10];
			int c = 0;
			int f = 0;
			int m;
			int x;
		m = n;
		while (n > 0)
		{
			a[c++] = n % 10;
			n = n / 10;
		}
		for (i = 0;i < c;i++)
		{
			if (a[i] != a[c - i - 1])
			{
				f = 1;
				x = 0;
			}
		}
		if (f == 0)
		{
			x = 1;
			for (i = 2;i < (m / 2 + 1);i++)
			{
				if (m % i == 0)
				{
					x = 0;
				}
			}
		}
		if (x == 1)
		{
			return m;
		}
		else
		{
			return (-1);
		}
		}
	}


	public static void Main()
	{
		int f = int n;
		int m;
		int n;
		int i;
		int[] a = new int[100000];
		int l = 0;
		int x = 0;
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 100000;i++)
		{
			a[i] = -1;
			b[i] = -1;
		}
		for (i = m;i <= n;i++)
		{
			a[l] = f(i);
			l++;
		}
		for (i = 0;i <= (n - m);i++)
		{
			if (a[i] != -1)
			{
				b[x] = a[i];
				x++;
			}
		}

		if (x != 0)
		{
			 for (i = 0;i < (x - 1);i++)
			 {
				System.out.printf("%d,",b[i]);
			 }
				System.out.printf("%d\n",b[x - 1]);
		}
		else
		{
			System.out.print("no\n");
		}
	}




}

