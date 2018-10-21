package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[500];
		int[] b = new int[500];
		int[] c = new int[500];
		int i;
		int j;
		int t = 0;
		int jishuqi1 = 0;
		int jishuqi2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		for (i = 0;i <= 488;i++)
		{
			if (a[i] > 1)
			{
				a[i + 1] = a[i] / 2;
			jishuqi1 = jishuqi1 + 1;
			}
			else if (a[i] <= 1)
			{
				break;
			}
		}
		for (j = 0;j <= 488;j++)
		{
			if (b[j] > 1)
			{
				b[j + 1] = b[j] / 2;
			jishuqi2 = jishuqi2 + 1;
			}
			else if (b[j] <= 1)
			{
				break;
			}
		}
		for (i = 0;i <= jishuqi1;i++)
		{
			for (j = 0;j <= jishuqi2;j++)
			{
				if (a[i] == b[j])
				{
					c[t] = a[i];
					t = t + 1;
				}
				else if (a[i] != b[j])
				{
				continue;
				}
			}
		}
			System.out.printf("%d\n",c[0]);
	}
}

