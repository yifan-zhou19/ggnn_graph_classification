package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[999];
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int b = 0;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[i] + a[j] == k)
				{
					b = b + 1;
				}
			}
		}
			if (b >= 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
	}
}

