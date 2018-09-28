package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int c;
		int tag = 0;
		int[] a = new int[1000];
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
		for (i = 0;i < n;i++)
		{
			c = k - a[i];
			for (j = 0;j < n;j++)
			{
				if (j == i)
				{
					continue;
				}
				if (c == a[j])
				{
					tag = 1;
				}
				if (tag == 1)
				{
					break;
				}
			}
			if (tag == 1)
			{
				break;
			}
		}
		if (tag == 1)
		{
			System.out.print("yes");
		}
		if (tag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

