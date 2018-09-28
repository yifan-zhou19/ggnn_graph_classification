package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		int biaoji = 0;
		int m;
		int i;
		int[] a = new int[max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			for (i = 0;i < n;i++)
			{
		m = k - a[i];
		for (j = i;j < n;j++)
		{
			if (m == a[j])
			{
				biaoji = 1;
			break;
			}
		}
			}
		if (biaoji != 0)
		{
				System.out.print("yes");
		}
			else
			{
				System.out.print("no");
			}
		return 0;
	}

}

