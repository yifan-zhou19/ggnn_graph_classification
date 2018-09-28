package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] c = new int[200];
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int Main()
	{
		void A(int str[],int m);
		void B(int str3[],int str2[]);
		void D(int str[],int str2[]);

		int i;
		int j;
		int k;
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

		D(a, b);
		A(a, m);
		A(b, n);
		B(a, b);

	}
	public static void D(int[] str, int[] str2)
	{
	int i;
	for (i = 0;i < m;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
	}
	}

	public static void A(int[] str, int m)
	{
		int i;
		int j;
		int k;
		int temp;
		for (i = 0;i < m - 1;i++)
		{
		for (j = i + 1;j < m;j++)
		{
			if (str[i] > str[j])
			{
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
		}
	}
	public static void B(int[] str3, int[] str2)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",str3[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",str2[i]);
		}
		System.out.printf("%d",str2[n - 1]);
	}
}

