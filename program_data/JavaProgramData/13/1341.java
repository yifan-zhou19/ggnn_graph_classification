package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] u = new int[20000];
		int[] a = new int[20000];
		int b;
		int c;
		b = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i] = Integer.parseInt(tempVar2);
			}
			a[i] = 0;
		}
		if (n == 1)
		{
			System.out.printf("%d",u[0]);
		}
		else
		{
		for (int i = 1;i < n;i++)
		{
			for (int j = 0;j <= i - 1;j++)
			{
				if (u[i] == u[j])
				{
					a[i] = a[i] + 1;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
					if (a[i] == 0)
					{
					   b = b + 1;
					}
		}
		for (int i = 0;i < n;i++)
		{
					if (a[i] == 0)
					{
						c = c + 1;
						if (c < b)
						{
							System.out.printf("%d ",u[i]);
						}
						if (c == b)
						{
							System.out.printf("%d",u[i]);
						}
					}
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

