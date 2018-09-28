package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		int i;
		int l;
		int[] a = new int[50];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			t = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			for (l = 0;l < p;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q = Integer.parseInt(tempVar3);
				}
				if (q + 3 * l < 60 && (q + 3 * (l + 1)) >= 60 && t != 0)
				{
					a[i] = q;
					t = 0;
				}
				if (q + 3 * l >= 60 && t != 0)
				{
					a[i] = 60 - 3 * l;
					t = 0;
				}
				if (l == p - 1 && q + 3 * (l + 1) < 60 && t != 0)
				{
					a[i] = 60 - 3 * (l + 1);
					t = 0;
				}
			}
			if (p == 0)
			{
				a[i] = 60;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

