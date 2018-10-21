package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int j = 2;
		int a;
		int n;
		int e;
		int[] c = new int[100];
		int[] s = new int[100];
		int[] w = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[0] = 1;
		for (int t = 1;t <= 90;t++)
		{
			s[t] = i;
			e = j;
			j = i + j;
			i = e;
		}
		for (int r = 0;r <= n - 1;r++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[r] = Integer.parseInt(tempVar2);
			}
			w[r] = s[c[r] - 1];
		}
		for (int y = 0;y <= n - 1;y++)
		{
			System.out.printf("%d\n",w[y]);
		}

		return 0;
	}
}

