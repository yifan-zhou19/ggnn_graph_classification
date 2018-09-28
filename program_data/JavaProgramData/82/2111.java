package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] <= 90) && b[i] >= 60)
			{
				c++;
			}
			else
			{
				if (c > k)
				{
					k = c;
				}
				c = 0;
			}
		}
		if (c > k)
		{
		System.out.printf("%d\n",c);
		}
		else
		{
			System.out.printf("%d\n",k);
		}
		return 0;
	}

}

