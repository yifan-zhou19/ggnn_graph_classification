package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int k;
		int i;
		int j;
		int l;
		int m;
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
		l = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					m = a[i] + a[j];
					if (m == k)
					{
						l++;
						break;
					}
				}
			}
			if (l > 0)
			{
				break;
			}
		}
		if (l == 0)
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

