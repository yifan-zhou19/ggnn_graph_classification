package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] qtt = new int[n];
		int a;
		for (a = 0; a < n; a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qtt[a] = Integer.parseInt(tempVar2);
			}
		}
		int s = 0;
		int b;
		for (b = 0; b < n; b++)
		{
			if (qtt[b] % 2 == 1)
			{
				s++;
			}
		}
		int[] odd = new int[s];
		int c;
		int d = 0;
		for (c = 0; c < n; c++)
		{
			if (qtt[c] % 2 == 1)
			{
				odd[d] = qtt[c];
				d++;
			}
		}
		int j;
		int r;
		for (j = s - 1; j > 0; j--)
		{
			for (r = 0; r < j; r++)
			{
				if (odd[r] > odd[r + 1])
				{
					int tmp;
					tmp = odd[r + 1];
					odd[r + 1] = odd[r];
					odd[r] = tmp;
				}
			}
		}
		int e;
		for (e = 0; e < s - 1; e++)
		{
			System.out.printf("%d,", odd[e]);
		}
		System.out.printf("%d", odd[s - 1]);
		return 0;
	}
}

