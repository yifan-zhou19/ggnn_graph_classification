package <missing>;

public class GlobalMembers
{
	public static void bubble_sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		bubble_sort(a, n);
		int p = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				if (p == 0)
				{
					System.out.printf("%d",a[i]);
					p = 1;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		return 0;
	}
}

