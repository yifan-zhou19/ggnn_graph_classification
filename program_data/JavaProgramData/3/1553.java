package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int i;
		int j;
		int e;
		int s = 0;
		int q = 0;
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
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				e = a[i] + a[j];
				if (e == k)
				{
					s++;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}
}

