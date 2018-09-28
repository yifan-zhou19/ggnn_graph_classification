package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] u = new int[1000000];
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
		}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			for (int i = 0;i < n;i++)
			{
				if (u[i] != a)
				{
					b = b + 1;
				}
			}
			for (int i = 0;i < n;i++)
			{
				if (u[i] != a)
				{
					c = c + 1;
					if (c < b)
					{
						System.out.printf("%d ",u[i]);
					}
					else if (c == b)
					{
						System.out.printf("%d",u[i]);
					}
				}
			}
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						n = Integer.parseInt(tempVar4);
					}
		return 0;
	}

}

