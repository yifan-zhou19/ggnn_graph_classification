package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p = 0;
		int[] a = new int[1001];
		int[] b = new int[1001];
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
		for (i = 0,j = 0;i < n,j < n;j++,i++)
		{
			b[j] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((a[i] + b[j] == k))
				{
				p++;
				}
			}
		}
		if (p > 0)
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

