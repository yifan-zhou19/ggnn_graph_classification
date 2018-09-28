package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int s;
		int[] a = new int[100];
		int[] sz = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		   for (i = 0;i < n;i++)
		   {
			m = a[i];
			sz[0] = 1;
			sz[1] = 1;
			if (m == 1)
			{
				s = 1;
			}
			if (m == 2)
			{
				s = 1;
			}
			if (m != 1 && m != 2)
			{
				s = 0;
				for (k = 2;k < a[i];k++)
				{
					sz[k] = sz[k - 1] + sz[k - 2];
					s = sz[k];
				}
			}
			System.out.printf("%d\n",s);
		   }
		return 0;
	}

}

