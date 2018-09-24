package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 2;
		int p;
		int q;
		int r;
		int[] m = new int[100];
		int[] t = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m[n - 1] = Integer.parseInt(tempVar3);
		}
		i = 0;
		for (i = 0;i < n;i++)
		{
			if (m[i] == 1 || m[i] == 2)
			{
				t[i] = 1;
			}
			if (m[i] > 2)
			{
				p = 1;
				q = 1;
				for (j = 2;j < m[i];j++)
				{
					r = q;
					q = p + q;
					p = r;
				}
				t[i] = q;
				j = 2;
			}
		}
		i = 0;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d\n",t[i]);
		}
		System.out.printf("%d",t[n - 1]);
		return 0;
	}
}

