package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int[] a = new int[20000];
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
			a[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			a[i] = b;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = 0;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

