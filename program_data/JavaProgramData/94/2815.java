package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int n)
	{
		int tmp;
		int i;
		int j;
		for (i = n - 1; i >= 0;i--)
		{
		for (j = 0; j < i; j++)
		{
		if (a[j] > a[j + 1])
		{
			tmp = a[j];
			a[j] = a[j + 1];
			a[j + 1] = tmp;
		}
		}
		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int i;
		int[] b = new int[500];
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i <= n - 1; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j += 1;
			}
		}
		bubble(b, j);
		System.out.printf("%d", b[0]);
		for (i = 1; i < j; i++)
		{
			System.out.printf(",%d", b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

