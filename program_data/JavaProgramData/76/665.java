package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sza = new int[50000];
		int[] szb = new int[50000];
		int[] szxa = new int[50000];
		int[] szxb = new int[50000];
		int j;
		int t;
		int i;
		double m;
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
				sza[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				szb[i] = Integer.parseInt(tempVar3);
			}
			szxa[i] = sza[i];
			szxb[i] = szb[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (szxa[j] > szxa[j + 1])
				{
					t = szxa[j];
					szxa[j] = szxa[j + 1];
					szxa[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (szxb[j] > szxb[j + 1])
				{
					t = szxb[j];
					szxb[j] = szxb[j + 1];
					szxb[j + 1] = t;
				}
			}
		}
		if (szxa[0] > szxb[0])
		{
			t = szxa[0];
			szxa[0] = szxb[0];
			szxb[0] = t;
		}
		if (szxa[n - 1] > szxb[n - 1])
		{
			t = szxa[n - 1];
			szxa[n - 1] = szxb[n - 1];
			szxb[n - 1] = t;
		}
		for (m = szxa[0];m <= szxb[n - 1];m = m + 0.5)
		{
			for (j = 0;j < n;j++)
			{
				if ((m >= sza[j]) && (m <= szb[j]))
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.println("no");
				break;
			}
		}
		if (m == szxb[n - 1] + 0.5)
		{
			System.out.printf("%d %d",szxa[0],szxb[n - 1]);
		}
		return 0;
	}

}

