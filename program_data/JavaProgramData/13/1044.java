package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int k = 0;
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
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (a[j] != a[i])
				{
					k = k + 1;
				}
				if (a[j] == a[i])
				{
					k = 0;
					break;
				}
			}

			if (k != 0)
			{
				System.out.printf(" %d",a[i]);
				k = 0;
			}
		}
		System.out.print("\n");
	}
}

