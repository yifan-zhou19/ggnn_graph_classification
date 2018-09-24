package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[25];
		int[] b = new int[25];
		int t = 0;
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
			for (j = 0,t = 0;j < i;j++)
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
			if (t > 0)
			{
			b[i] = t + 1;
			}
		}
		for (i = 0,t = 0;i < n;i++)
		{
			if (b[i] > t)
			{
			t = b[i];
			}
		}
		System.out.printf("%d",t);
	}
}

