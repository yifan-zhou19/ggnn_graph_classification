package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int t;
	public static int[] yin = new int[50];
	public static void dd(int n, int a,int d,int m)
	{
		int i;
		if (d == m)
		{
			t++;
			return;
		}
		for (i = a;i < num;i++)
		{
			if (n / yin[i] >= yin[i] != 0 && n % yin[i] == 0)
			{
				dd(n / yin[i], i, d + 1, m);
			}
		}
	}
	public static void q_ys(int n)
	{
		int i;
		for (i = 2;i <= n;i++)
		{
			if (n % i == 0)
			{
				num++;
				yin[num] = i;
			}
		}
		return;
	}
	public static int m_ys(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return i;
			}
		}
	 return 1;
	}
	public static void output(int y)
	{
		int k = 1;
		int i;
		int x;
		x = y;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		t = 1,num = 0,memset(yin,0,(Integer.SIZE / Byte.SIZE));
		q_ys(x);
		while (m_ys(x) != 1)
		{
			k++;
			x = x / m_ys(x);
		}
		for (i = 2;i <= k;i++)
		{
			dd(y, 1, 1, i);
		}
		System.out.print(t);
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		t = 0,num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			output(a[i]);
		}
		return 0;


	}
}

