package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[1000];
		int m;
		int t = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		if ((n == 1) && (a[0] == k))
		{
			   t = 1;
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i != j)
				{
					m = a[i] + a[j];
				}
				if (m == k)
				{
					t = 1;
				}
			}
		}
			   if (t == 1)
			   {
			System.out.print("yes");
			   }
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

