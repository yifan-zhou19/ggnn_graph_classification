package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int e;
		int p;
		int m = 0;
		int[] a = new int[1000];
		int[] b = new int[499500];
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
			for (j = i + 1;j <= n;j++)
			{
			b[m] = a[i] + a[j];
			m++;
			e = m;
			}
		}
		p = 0;
		for (m = 0;m < e;m++)
		{
			if (b[m] == k)
			{
				p++;
			}
		}
		if (p == 0)
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

