package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int j;
		int k;
		int s = 0;
		int[] a = new int[17];
		for (scanf("%d", a[1]);a[1] != -1;scanf("%d", a[1]))
		{
		for (i = 2;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == 0)
			{
				t = i - 1;
				break;
			}
		}
		for (j = 1;j <= t;j++)
		{
			for (k = 1;k <= t;k++)
			{
				if (a[j] == 2 * a[k])
				{
				s = s + 1;
				}
			}
		}
		System.out.printf("%d\n",s);
		s = 0;
		}
		return 0;
	}
}

