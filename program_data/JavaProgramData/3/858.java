package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int i;
		int[] b = new int[1000];
		int j;
		int c = 0;
		int d = 0;
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
		for (i = 0,j = 0;i < n,j < n;i++,j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[j] = k - a[i];
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (b[j] == a[i])
				{
					c = 1;
					System.out.print("yes");
					d = 1;
					break;
				}
			}
			if (d == 1)
			{
				break;
			}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

