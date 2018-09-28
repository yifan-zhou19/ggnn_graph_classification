package <missing>;

public class GlobalMembers
{
	public static char t;
	public static int begin = 0;
	public static int[] a = new int[1000];
	public static int p = 1;
	public static int i;
	public static int done = 0;
	public static String s = new String(new char[10000]);

	public static int IsDigit(char t)
	{
		if (t <= '9' && t >= '0')
		{
			return 1;
		}
		return 0;
	}

	public static void sort(int l,int r)
	{
		int i = l;
		int j = r;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		int k = a[(i + j) >> 1];
		int t;
		do
		{
			while (a[i] > k)
			{
				++i;
			}
			while (a[j] < k)
			{
				--j;
			}
			if (i <= j)
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
				++i;
				--j;
			}
		}while (i <= j);
		if (i < r)
		{
			sort(i, r);
		}
		if (l < j)
		{
			sort(l, j);
		}
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;i < s.length();++i)
		{
			t = s.charAt(i);
			if (IsDigit(t) == 0)
			{
				if (begin == 1)
				{
					++p;
					begin = 0;
				}
			}
			else
			{
				begin = 1;
				a[p] = a[p] * 10 + t - '0';
			}
		}
		sort(1, p);
		for (i = 2;i <= p;++i)
		{
			if (a[i] != a[i - 1])
			{
				System.out.printf("%d\n",a[i]);
				done = 1;
				break;
			}
		}
		if (done == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

