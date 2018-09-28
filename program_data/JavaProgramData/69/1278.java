package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	//int n, tian[1000], qi[1000];
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int[] c = new int[300];
	public static int la;
	public static int lb;
	public static int Main()
	{
		String xa = new String(new char[300]);
		String xb = new String(new char[300]);
		xa = ConsoleInput.readToWhiteSpace(true).charAt(0);
		xb = ConsoleInput.readToWhiteSpace(true).charAt(0);
		la = xa.length();
		lb = xb.length();
		for (int i = 0; i < la; i++)
		{
			a[i] = xa.charAt(la - 1 - i) - '0';
		}
		for (int i = 0; i < lb; i++)
		{
			b[i] = xb.charAt(lb - 1 - i) - '0';
		}
		int m = la > lb != 0 ? la : lb;
		int x = 0;
		for (int i = 0; i < m; i++)
		{
			int w = a[i] + b[i] + x;
			c[i] = w % 10;
			x = w / 10;
		}
		c[m] = x;
		int h;
		for (h = 299; h >= 0; h--)
		{
			if (c[h] != 0)
			{
				break;
			}
		}
		if (h == -1)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (; h >= 0; h--)
			{
				System.out.print(c[h]);
			}
			System.out.print("\n");
		}
	//while (true)
	//{
	//	cin>>n;
	//	if (n == 0) break;
	//	for (int i = 0; i < n; i++)
	//	{
	//		cin>>tian[i];
	//	}
	//	for (int i = 0; i < n; i++)
	//	{
	//		cin>>qi[i];
	//	}
	//	qsort(tian, n, sizeof(int), cmp);
	//	qsort(qi, n, sizeof(int), cmp);
	//	int t = 0, q = 0, s = 0;
	//	while (q < n)
	//	{
	//		int x;
	//		for (x = t; x < n; x++)
	//			if (tian[x] > qi[q]) break;
	//		if (x == n)
	//		{
	//			for (x = t; x < n; x++)
	//				if (tian[x] == qi[q]) break;
	//			if (x == n)
	//			{
	//				s -= 200 * (n - q);
	//				goto end;
	//			}
	//			else
	//			{
	//				q++;
	//				t = x + 1;
	//			}
	//		}
	//		else
	//		{
	//			s += 200;
	//			q++;
	//			t = x + 1;
	//		}
	//	}
	//end:
	//	cout<<s<<endl;
	//}
	}
}

