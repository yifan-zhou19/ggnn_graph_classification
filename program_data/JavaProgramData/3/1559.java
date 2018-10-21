package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int[] a = new int[1000];
		int j = 0;
		int m;
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
		m = n;
		for (j = 0;j < m;j++)
		{
		for (n;n > 0;n--)
		{
		for (i = 0;i < n;i++)
		{
		if (a[j] + a[i] == k)
		{
			System.out.print("yes");
			return 0;
		}
		}
		}
		n = m - j - 1;
		}
	System.out.print("no");
	return 0;
	}
}

