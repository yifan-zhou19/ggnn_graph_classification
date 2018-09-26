package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int si = 0;
		int[] s = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 5)
		{
			for (i = 3;i < n - 1;i++)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						s[j] = 1;
					}
					else
					{
						s[j] = 0;
					}
				}
				for (j = 2;j < i;j++)
				{
					si = si + s[j];
				}
				if (si == 0)
				{
					for (j = 2;j < i;j++)
					{
						if ((i + 2) % j == 0)
						{
							s[j] = 1;
						}
						else
						{
							s[j] = 0;
						}
					}
				}
				for (j = 2;j < i;j++)
				{
					si = si + s[j];
				}
				if (si == 0)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
				si = 0;
			}
		}
		else
		{
			System.out.print("empty\n");
		}
		return 0;
	}
}

