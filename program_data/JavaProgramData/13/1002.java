package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int[] b = new int[20000];
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
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < i;j++)
			{
				b[i] = a[i] - a[j];
				if (b[i] == 0)
				{
					break;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 0;i < n;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}
}

