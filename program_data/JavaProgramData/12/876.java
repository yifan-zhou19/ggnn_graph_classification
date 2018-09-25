package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int x;
		int i;
		int j;
		int t = 0;
		for (;;)
		{
			x = 1;
			t = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
		if (a[0] == -1)
		{
			break;
		}
		else
		{
		for (i = 1; ;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		if (a[i] == 0)
		{
			break;
		}
		x++;
		}
		for (i = 0;i < x - 1;i++)
		{
			for (j = i + 1;j <= x - 1;j++)
			{
			if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
			{
		t++;
			}
			}
		}
		System.out.printf("%d\n",t);
		}
		}
	}
}

