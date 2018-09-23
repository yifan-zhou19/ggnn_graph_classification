package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int n;
		int i;
		int m;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
			r = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (m = 1;m < i;m++)
			{
				if (a[i] == a[m])
				{
					r++;
				}
			}
			if (r == 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

