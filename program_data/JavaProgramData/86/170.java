package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] b = new int[100];
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			if (m != 0)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[j] = Integer.parseInt(tempVar3);
					}
				}
				for (k = m;k > 0;k--)
				{
					if (b[k - 1] + 3 * k <= 60)
					{
						System.out.printf("%d\n",60 - 3 * k);
						break;
					}
					else if (b[k - 1] + 3 * k == 61 || b[k - 1] + 3 * k == 62 || b[k - 1] + 3 * k == 63)
					{
						System.out.printf("%d\n",b[k - 1]);
						break;
					}
					else if (b[k - 1] + 3 * k > 63)
					{
						continue;
					}
				}
			}
		}
		return 0;
	}
}

