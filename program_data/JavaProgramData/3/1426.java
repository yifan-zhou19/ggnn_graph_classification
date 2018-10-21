package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int s;
		m = 0;
		int[] sz = new int[LEN];
		int[] p = new int[LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
			p[m] = sz[i];
			m++;
		}
		for (i = 0;i < n;i++)
		{
		for (m = 0;m < n;m++)
		{
		   s = sz[i] + p[m];
		   if (s == k)
		   {
		   break;
		   }
		}
		   if (s == k)
		   {
		   break;
		   }
		}
		if (i == n)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}
}

