package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hui = int n;
		int su = int n;
		int m;
		int n;
		int i;
		int j = 0;
		int[] a = new int[50];
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
		for (i = m;i <= n;i++)
		{
			if ((su(i)) != 0 && (hui(i)) != 0)
			{
			a[j] = i;
			j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
			System.out.printf("%d",a[i]);
			if (i < j - 1)
			{
				System.out.print(',');
			}
			}
		}
	}
	public static int su(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
			return 0;
			break;
			}
		}
		return 1;
	}
	public static int hui(int n)
	{
		int change = int n;
		int m;
		m = change(n);
		if (n == m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int change(int n)
	{
		int i;
		int j;
		int a;
		int b;
		for (i = 1;;i *= 10)
		{
			if (n / i < 10)
			{
				break;
			}
		}
		if (i < 10)
		{
			return n;
		}
		else
		{
			a = n / i;
			n = n % i;
			for (j = 1;;j *= 10)
			{
				if (n / j < 10)
				{
					break;
				}
			}
			b = a + i / j * change(n);
		}
		return b;
	}

}

