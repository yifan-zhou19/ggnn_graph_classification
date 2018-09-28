package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int m;
	public static int n;
	public static void getstr()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void rangestr()
	{
		void range(int str[100],int length);
		range(a, m);
		range(b, n);
	}

	public static void range(int[] str, int length)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < length - 1;i++)
		{
			for (j = 0;j < length - i - 1;j++)
			{
				if (str[j] > str[j + 1])
				{
					t = str[j + 1];
					str[j + 1] = str[j];
					str[j] = t;
				}
			}
		}
	}

	public static void combinestr()
	{
		int i;
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
	}

	public static void putstr()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[m + n - 1]);
	}

	public static void Main()
	{
		getstr();
		rangestr();
		combinestr();
		putstr();
	}
}

