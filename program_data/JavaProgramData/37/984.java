package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zxc = new String(new char[99]);
		int[] sz = new int[99];
		int m;
		int n;
		int i;
		int t;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (m = 0;m < 98;m++)
			{
			sz[m] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zxc = tempVar2.charAt(0);
			}
			m = zxc.length();
			for (t = 0;t < m;t++)
			{
				for (k = t + 1;k < m;k++)
				{
					if (zxc.charAt(t) == zxc.charAt(k))
					{
						sz[t]++;
						sz[k]++;
					}
				}
			}

			for (t = 0;t < m;t++)
			{

				if (sz[t] == 0)
				{
					System.out.printf("%c\n",zxc.charAt(t));
				break;
				}
				else if (t == (m - 1))
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}

}

