package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5000];
		int n;
		int i;
		int t;
		int m;
		int c;
		int I = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (t = i - 1;t > 0;t--)
		{
			for (c = 0;c < t;c++)
			{
			if (a[c] > a[c + 1])
			{
				m = a[c];
				a[c] = a[c + 1];
				a[c + 1] = m;
			}
			}
		}
		m = 0;
		for (I = 0;I < n - 1;I++)
		{
			for (t = I + 1;t < n;t++)
			{
				if (a[I] + a[t] == k)
				{
					m = 1;
					break;
				}
			}
		}
		if (m == 1)
		{
			System.out.print("yes");
		}
		if (m == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

