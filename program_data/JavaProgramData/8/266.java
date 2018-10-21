package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] N = new int[100];
	public static int[] M = new int[100];
	public static void scan()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				M[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void sort(int q, int[] a)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < q - 1;i++)
		{
			k = i;
			for (j = i + 1;j < q;j++)
			{
				if (a[j] < a[k])
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = a[i];
			a[i] = a[k];
			a[k] = t;
			}
		}
	}
	public static void print()
	{
		int i;
		System.out.printf("%d",N[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",N[i]);
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf(" %d",M[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		scan();
		sort(n, N);
		sort(m, M);
		print();
	}
}

