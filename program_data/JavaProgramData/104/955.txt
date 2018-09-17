package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int a[],int n);
		int x;
		int y;
		int s;
		int t;
		int j;
		int[] a = new int[11];
		int[] b = new int[11];
		for (j = 0;j < 11;j++)
		{
			a[j] = 0;
			b[j] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		f(a, x);
		f(b, y);

		for (j = 10;j >= 0;j--)
		{
			if (a[j] != 0)
			{
				s = j;
				break;
			}
		}
		for (j = 10;j >= 0;j--)
		{
			if (b[j] != 0)
			{
				t = j;
				break;
			}
		}
		for (j = 1;j <= s != 0 && j <= t;j++)
		{
			if (a[s - j] != b[t - j])
			{
				System.out.printf("%d",a[s - j + 1]);
				break;
			}
		}
		if (j == s + 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
		if (j == t + 1)
		{
			System.out.printf("%d",b[0]);
		}
		}
	}
	public static void f(int[] a, int n)
	{
		int i;
		a[0] = n;
		n = n / 2;
		for (i = 1;n > 0;i++)
		{
			if (n % 2 == 0)
			{
				a[i] = n;
				n = n / 2;
			}
			else
			{
				a[i] = n;
				n = (n - 1) / 2;
			}
		}
	}
}

