package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int s = 0;
		int l = 0;
		int[] a = new int[num];
		int[] d = new int[num];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 10000;i++)
		{
			a[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			for (x = j;x < k;x++)
			{
				a[x]++;
			}
		}
		for (i = 1;i <= 10000;i++)
		{
			if (a[i] != 0)
			{
				d[s] = i;
				s++;
			}
		}
		for (i = 0;i < s - 1;i++)
		{
			if (d[i + 1] - d[i] != 1)
			{
				l++;
			}
		}
		if (l == 0)
		{
			System.out.printf("%d %d",d[0],d[s - 1] + 1);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

