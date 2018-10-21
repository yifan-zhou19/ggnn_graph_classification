package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 2;i <= n;i++)
		{
			int j = 1;
			while (j < i)
			{
				if (a[i - 1] == a[j - 1])
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if (j == i)
			{
				System.out.printf(" %d",a[i - 1]);
			}
		}
		return 0;
	}

}

