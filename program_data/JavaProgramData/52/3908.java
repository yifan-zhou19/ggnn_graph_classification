package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void change();
		int n;
		int m;
		int i;
		int[] f = new int[20];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < m;i++)
		{
			change(n, f);
		}
		System.out.printf("%d",f[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",f[i]);
		}
		return 0;
	}

	public static void change(int n, int[] f)
	{
		int i;
		int k;
		k = f[n - 1];
		for (i = n - 1;i > 0;i--)
		{
			f[i] = f[i - 1];
		}
		f[0] = k;
	}

}

