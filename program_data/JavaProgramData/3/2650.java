package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[1009];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		int isbreak = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] != a[j])
				{
				b = a[i] + a[j];
				}
				if (b == m)
				{
					System.out.print("yes");
					isbreak = 1;
					break;
				}
			}
			if (isbreak == 1)
			{
			break;
			}
		}
		if (isbreak == 0)
		{
		System.out.print("no");
		}
		return 0;
	}
}

