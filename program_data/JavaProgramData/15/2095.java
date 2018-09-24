package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int b;
		int x;
		int p = 0;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
		{
			for (x = 0,j = 1;j <= a;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b = Integer.parseInt(tempVar2);
				}
				if (b == 0)
				{
					x = x + 1;
				}
				else
				{
					x = x + 0;
				}
			}
			if (x != 0)
			{
				p++;
				q = x;
			}
		}
		System.out.printf("%d",(p - 2) * (q - 2));
		return 0;
	}

}

