package <missing>;

public class GlobalMembers
{
	public static int g(int y)
	{
		int i;
		for (i = 0;;i++)
		{
			if (i * i > y)
			{
				break;
			}
		}
		return i - 1;
	}
	public static int f(int x,int b)
	{
		int p;
		int[] a = new int[100];
		int t = 0;
		int k = 0;
		p = g(x);
		if (x == 2)
		{
			return 0;
		}
		else
		{
		for (int i = b;i <= p;i++)
		{
			if (x % i == 0)
			{
				a[t] = i;
				t++;
			}
		}
		if (t == 0)
		{
			return 0;
		}
		else
		{
			for (int i = 0;i < t;i++)
			{
				k = k + f(x / a[i], a[i]) + 1;
			}
		}
			return k;
		}
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, 2) + 1);
			System.out.print("\n");
		}
		return 0;
	}
}

