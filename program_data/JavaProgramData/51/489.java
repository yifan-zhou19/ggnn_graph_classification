package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[505]);
		int[] n = new int[505];
		int a;
		int i;
		int j;
		int k;
		int l;
		int max = 0;
		int nu;
		int ju = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nu = Integer.parseInt(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i <= l - nu;i++)
		{
			n[i] = 1;
		}
		for (i = 0;i <= l - nu;i++)
		{
			for (j = i + 1;j <= l - nu;j++)
			{
				for (k = 0;k <= nu - 1;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						ju = 0 * ju;
					}
				}
				if (ju == 1)
				{
					n[i]++;
				}
				ju = 1;
			}
		}
		for (i = 0;i <= l - nu;i++)
		{
			if (n[i] >= max)
			{
				max = n[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - nu;i++)
		{
			if (n[i] == max)
			{
				for (j = i;j <= i + nu - 1;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}


}

