package <missing>;

public class GlobalMembers
{
	public static void sort(int[] array, int n, int m)
	{
		int i;
		int r;
		for (i = 1;i <= m;i++)
		{
			int k;
			int j;
			k = array[n - 1];
			for (j = n - 1;j >= 1;j--)
			{
				array[j] = array[j - 1];
			}
			array[0] = k;
		}
		System.out.printf("%d",array[0]);
		for (r = 1;r < n;r++)
		{
			System.out.printf(" %d",array[r]);
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int a;
		int[] f = new int[100];
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
		for (a = 0;a < n;a++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[a] = Integer.parseInt(tempVar3);
			}
		}
		sort(f, n, m);
	}




}

