package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int k;
		int[] c = new int[21];
		int j;
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
			else
			{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[j] = Integer.parseInt(tempVar3);
				}
			}
			k = c[m] + (m - 1) * 3;
			if (k <= 60)
			{
				if (k + 3 > 60)
				{
					System.out.printf("%d\n",c[m]);
				}
				else
				{
				System.out.printf("%d\n",60 - m * 3);
				}
			}
			else
			{
				for (j = m;(c[j] + (j - 1) * 3) > 60;j--)
				{
					;
				}
				if ((c[j] + j * 3) > 60)
				{
					System.out.printf("%d\n",c[j]);
				}
				else
				{
					System.out.printf("%d\n",60 - j * 3);
				}
			}
			}
		}
		return 0;
	}


}

