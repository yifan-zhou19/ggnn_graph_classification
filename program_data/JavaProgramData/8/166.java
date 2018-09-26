package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int m;
	public static int n;

	public static void input()
	{
		int i;
		int j;
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
		scanf("\n");
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[n - 1] = Integer.parseInt(tempVar5);
		}
		return;
	}

	public static void sort(int[] array, int k)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (array[i] > array[i + 1])
				{
					t = array[i];
					array[i] = array[i + 1];
					array[i + 1] = t;
				}
			}
		}
				return;
	}

	public static void combine()
	{
		int i;
		int j = 0;
		for (i = m;i < m + n;i++)
		{
			a[i] = b[j];
			j++;
		}
		return;
	}

	public static void output()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[m + n - 1]);
		return;
	}



	public static int Main()
	{
		input();
		sort(a, m - 1);
		sort(b, n - 1);
		combine();
		output();
		return 0;
	}
}

