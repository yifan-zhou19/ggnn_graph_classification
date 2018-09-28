package <missing>;

public class GlobalMembers
{
	public static void play(int[] n, int l)
	{
		int k;
		int t;
		t = n[l - 1];
		for (k = l - 1;k > 0;k--)
		{
			n[k] = n[k - 1];
		}
		n[0] = t;
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] num = new int[100];
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
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= m;i++)
		{
			play(num, n);
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",num[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

