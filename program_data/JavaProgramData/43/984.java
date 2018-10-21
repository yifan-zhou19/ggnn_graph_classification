package <missing>;

public class GlobalMembers
{
	public static int d(int x)
	{
		int m;
		int c = 1;
		int q;
		for (int i = 2;i < x;i++)
		{
			m = x % i;
			c++;
	if (m == 0)
	{
		c = 0;
		break;
	}

		}
		if (c != 0)
		{
			q = 1;
		}
		else
		{
			q = 0;
		}
		return q;
	}
	public static int Main()
	{
		int n;
		int[] r = new int[100];
		int[] t = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int w = 1;
	for (int i = 3;i < n / 2 + 1;i++)
	{
		if (d(i) == 1 && d(n - i) == 1)
		{
		r[w] = i;
		t[w] = n - i;
		System.out.print(r[w]);
		System.out.print(' ');
		System.out.print(t[w]);
		System.out.print("\n");
		w++;
		}

	}

	}
}

