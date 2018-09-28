package <missing>;

public class GlobalMembers
{
	public static int my(int n)
	{
		int i;
		int l;
		int[] a = new int[100];
		int[] b = new int[100];
		int t = 1;
		l = (int)Math.log10(n) + 1;
		for (i = 1;i <= l;i++)
		{
			a[i] = n % 10;
			n = (n - a[i]) / 10;
		}
		for (i = 1;i <= l;i++)
		{
			b[i] = a[l - i + 1];
		}
		for (i = 1;i <= l;i++)
		{
			if (a[i] != b[i])
			{
				t = 0;
				break;
			}
		}
		return t;
	}
	public static int su(int n)
	{
		int i;
		int t = 1;
		for (i = 2;i < n / 2;i++)
		{
			if (n % i == 0)
			{
				t = 0;
				break;
			}
		}
		return t;
	}
	public static int Main()
	{
		int su = int n;
		int my = int n;
		int i;
		int m;
		int n;
		int[] a = new int[1000];
		int k = 0;
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
			if (my(i) == 1 && su(i) == 1)
			{
				a[k++] = i;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[k - 1]);
		}
		return 0;
	}
}

