package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int i;
		int j;
		int t;
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
			for (j = 0;j < n;j++)
			{
				if (a[i] == a[j] && i > j)
				{
					t = 0;
					break;
				}
				else
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.print("\0");
			}
			else
			{
				if (i > 0)
				{
					System.out.printf(" %d",a[i]);
				}
				else
				{
					System.out.printf("%d",a[i]);
				}
			}
		}
		return 0;
	}
}

