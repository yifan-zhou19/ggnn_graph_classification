package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[200];
	public static int[] b = new int[100];
	public static int Main()
	{
		void getarray();
		void paixu(int s[],int t);
		void hebin();
		void print();
		getarray();
		paixu(a, m);
		paixu(b, n);
		hebin();
		print();
		return 0;
	}
	public static void getarray()
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
	public static void paixu(int[] s, int t)
	{
		int i;
		int j;
		int temp;
		for (j = 1;j < t;j++)
		{
			for (i = 0;i < t - j;i++)
			{
				if (s[i] > s[i + 1])
				{
					temp = s[i];
					s[i] = s[i + 1];
					s[i + 1] = temp;
				}
			}
		}
	}
	public static void hebin()
	{
		int i;
		for (i = m;i < m + n;i++)
		{
			a[i] = b[i - m];
		}
	}
	public static void print()
	{
		int i;
		System.out.printf("%d",a[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}

