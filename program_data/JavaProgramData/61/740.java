package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int x;
		int y;
		int e;
		int i = 0;
		int j = 0;
		int[] s = new int[21];
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
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				y = 1;
			}
			else
			{
				 j = 0;
				for (j = 0;j < a - 1;j++)
				{
					if (j == 0)
					{
						y = 1;
						x = 1;
					}
					if (j > 0)
					{
						e = y;
						y = x + y;
						x = e;
					}
				}
			}
			s[i] = y;
		}
		i = 0;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
	  return 0;

	}

}

