package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int k;
		int n;
		int s = 0;
		int p;
		int a;
		int[] sz = {-1};
		int[] sz1 = {-1};
		int[] sz2 = {-1};
		int e;
		int f;
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
			(sz1[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(sz2[i]) = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			for (a = 0;a < l;a++)
			{
				if (a + 0.5 >= sz1[i] != 0 && a + 0.5 <= sz2[i])
				{
				sz[a] = 1;
				}
				else if (1 != sz[a])
				{
					sz[a] = 0;
				}
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz1[i] > sz1[i + 1])
				{
				e = sz1[i + 1];
				sz1[i + 1] = sz1[i];
				sz1[i] = e;
				}
			}
		}
			for (k = 1;k < n;k++)
			{
			for (i = 0;i < n - k;i++)
			{
				if (sz2[i] > sz2[i + 1])
				{
				f = sz2[i + 1];
				sz2[i + 1] = sz2[i];
				sz2[i] = f;
				}
			}
			}
		for (a = 0;a < l;a++)
		{
			if (sz[a] == 1)
			{
				s++;
			}
		}
		p = sz2[n - 1] - sz1[0];
		if (p == s)
		{
			System.out.printf("%d %d",sz1[0],sz2[n - 1]);
		}
			else
			{
				System.out.print("no");
			}
			return 0;
	}


}

