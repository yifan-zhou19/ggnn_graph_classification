package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] p = a;
		int i;
		int[] b = new int[n];
		int[] q = b;
		int j;
		int x = 1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p[i]) = tempVar2;
			}
		}
		q[0] = p[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < x;j++)
			{
				if (p[i] == q[j])
				{
					break;
				}
			}
			if (j == x)
			{
				q[x] = p[i];
				x = x + 1;
			}
		}
		for (i = 0;i < (x - 1);i++)
		{
			System.out.printf("%d,",q[i]);
		}
		System.out.printf("%d",q[x - 1]);
	return 0;
	}
}

