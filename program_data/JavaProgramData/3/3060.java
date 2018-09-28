package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int p = 0;
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
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (int j = 0;j < n;j++)
		{
			for (int s = j + 1;s < n;s++)
			{
			if (a[s] == k - a[j])
			{
				p = 1;
			}
			}
		}
		if (p == 1)
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

