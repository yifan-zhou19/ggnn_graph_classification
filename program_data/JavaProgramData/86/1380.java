package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t = 0;
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
			for (i = 0;i < 500;i++)
			{
				a[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 0;i < n;i++)
				{
					if (a[i] + 3 * (i + 1) > 60)
					{
						t = 1;
						if (a[i] + 3 * i < 60)
						{
							System.out.printf("%d\n",a[i]);
						}
						else
						{
							System.out.printf("%d\n",60 - 3 * i);
						}
						break;
					}
				}
				if (t == 0)
				{
					System.out.printf("%d\n",60 - 3 * n);
				}
				t = 0;
			}
		}
		return 0;
	}
}

