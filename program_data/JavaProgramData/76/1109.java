package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[10002];
		int[] d = new int[10000];
		int i;
		int n;
		int j;
		int k = 0;
		int l = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10002;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 1;
			}
		}
		for (i = 0;i < 10001;i++)
		{
			if (c[i] == c[i + 1])
			{
				continue;
			}
			if (c[i] != c[i + 1])
			{
				k++;
				d[l] = i;
				d[l + 1] = i + 1;
				l = l + 2;
			}
		}
		if (k == 2)
		{
			System.out.printf("%d %d",d[2],d[3] + 1);
		}
		else
		{
				System.out.print("no");
		}
		return 0;
	}

}

