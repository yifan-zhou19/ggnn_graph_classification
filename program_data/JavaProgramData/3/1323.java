package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] sz = new int[1000];
		int[] pl = new int[1000];
		int a;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
			pl[i] = sz[i];
		}

		for (k = 0;k < n;k++)
		{
			 for (j = 1;j < n;j++)
			 {
				a = pl[k] + sz[j];
				if (a != m)
				{
					  p++;
				}
			 }
		}
		if (p == n * (n - 1))
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

