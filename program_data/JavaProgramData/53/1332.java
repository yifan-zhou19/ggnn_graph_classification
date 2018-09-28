package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j = 0;
		int k = 0;
		int[] x = new int[300];
		int[] t = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[0] = Integer.parseInt(tempVar2);
		}
		t[0] = x[0];
		m = 0;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
			for (j = m;j > -1;j--)
			{
				if (x[i] == t[j])
				{
					k = 1;
					break;
				}
				else
				{
					k = 0;
				}
			}
			if (k == 0)
			{
				t[++m] = x[i];
			}
		}
		System.out.printf("%d",t[0]);
		for (j = 1;j <= m;j++)
		{
			System.out.printf(",%d",t[j]);
		}
	}
}

