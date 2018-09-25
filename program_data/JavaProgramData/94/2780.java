package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int l;
		int s;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		j = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 0)
			{
				return 0;
			}
			if ((a[i] + 1) % 2 == 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		s = j - 1;
		for (i = 0;i < s;i++)
		{
			for (l = i + 1;l < j;l++)
			{
				if (b[i] > b[l])
				{
				m = b[i];
				b[i] = b[l];
				b[l] = m;
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[s]);
		return 0;
	}
}

