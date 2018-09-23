package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[0]);
		for (int i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			k = 1;
			for (int j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
				k = 0;
				}
			}
			if (k != 0)
			{
				System.out.printf(" %d",a[i]);
			}

		}
	}

}

