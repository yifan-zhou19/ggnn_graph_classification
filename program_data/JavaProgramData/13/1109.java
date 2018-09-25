package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int p;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", a[0]);
		for (i = 1; i < n; i++)
		{
			p = 0;
			t = 0;
			do
			{
				if (a[i] == a[p])
				{
					t = 1;
				}
				p += 1;
			} while (t == 0 && p < i);
			if (t == 0)
			{
				System.out.printf(" %d", a[i]);
			}
		}
		return 0;
	}
}

