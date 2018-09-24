package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int m = 0;
		int n;
		int max = 0;
		int[] a = new int[25];
		int[] t = new int[25];
		int[] s = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		t[k - 1] = 1;
		if (k == 1)
		{
			System.out.print("1\n");
		}
		else
		{
			for (i = k - 2;i >= 0;i--)
			{
				for (j = i + 1;j < k;j++)
				{
					if (a[j] <= a[i])
					{
						s[m] = t[j];
						m++;
					}
				}
				m = 0;
				max = s[0];
				for (n = 1;n < 25;n++)
				{
					if (s[n] > max)
					{
						max = s[n];
					}
				}
				for (j = 0;j < 25;j++)
				{
					s[j] = 0;
				}
				t[i] = max + 1;
			}

			max = 0;
			for (i = 0;i < k;i++)
			{
				if (t[i] > max)
				{
					max = t[i];
				}
			}
			System.out.printf("%d\n",max);
		}
		return 0;
	}
}

