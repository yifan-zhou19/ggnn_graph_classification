package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int[] a = new int[1000];
		int x;
		int j;
		int z = 0;
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
			x = k - a[i];
			for (j = 0;j < n;j++)
			{
				if (j == i)
				{
					continue;
				}
				if (a[j] == x)
				{
					z = 1;
				}
			}
		}
		if (z == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}

