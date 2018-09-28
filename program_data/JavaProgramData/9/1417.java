package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int a;
		int e;
		int f;
		int b;
		char[][] id = new char[N][11];
		char[][] ido = new char[N][11];
		char[][] idy = new char[N][11];
		String m = new String(new char[11]);
		int[] nl = new int[N];
		int[] nlo = new int[N];
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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				nl[i] = Integer.parseInt(tempVar3);
			}
			if (nl[i] < 60)
			{
				idy[j] = id[i];
				j++;
			}
			if (nl[i] >= 60)
			{
				nlo[k] = nl[i];
				ido[k] = id[i];
				k++;
			}
		}
		for (a = 1;a <= k;a++)
		{
			for (b = 0;b < k - a;b++)
			{
				if (nlo[b] < nlo[b + 1])
				{
					e = nlo[b + 1];
					nlo[b + 1] = nlo[b];
					nlo[b] = e;
					m = ido[b + 1];
					ido[b + 1] = ido[b];
					ido[b] = m;
				}
			}
		}
		for (f = 0;f < k;f++)
		{
			System.out.println(ido[f]);
		}
		for (f = 0;f < j;f++)
		{
			System.out.println(idy[f]);
		}
		return 0;
	}
}

