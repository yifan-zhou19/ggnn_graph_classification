package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[30000];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (j == i)
			{
				System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}

}

