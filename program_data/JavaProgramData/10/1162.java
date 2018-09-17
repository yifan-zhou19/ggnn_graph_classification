package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t;
		int max = 0;
		int[] a = new int[26];
		int[] b = new int[26];
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
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					if (b[j] > t)
					{
						t = b[j];
					}
				}
			}
			if (t == 0)
			{
				b[i] = 1;
			}
			else
			{
				b[i] = t + 1;
			}
		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

