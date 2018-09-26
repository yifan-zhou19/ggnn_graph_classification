package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[MAX];
		int n;
		int k;
		int i;
		int j;
		int l = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < (n - 1);i++)
		{
			for (j = (n - 1);j > i;j--)
			{
				if (k == a[i] + a[j])
				{
					System.out.print("yes");
					l = 1;
				break;
				}
			}
			if (l == 1)
			{
				break;
			}
		}
		if (i == (n - 1))
		{
			System.out.print("no");
		}
		return 0;
	}

}

