package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int n = 0;
		int m = 0;
		int k;
		char c;
		while (true)
		{
			n++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}
		for (k = 1;k <= n;k++)
		{
			if (k != n)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[k] = Integer.parseInt(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					b[k] = Integer.parseInt(tempVar4);
				}
			}
		}
		System.out.printf("%d ",n);
		int i;
		int j;
		int[] s = new int[1001];
		int max = 0;
		for (i = 0;i <= 999;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
				s[i]++;
				}
			}
			if (s[i] > max)
			{
				max = s[i];
			}
		}
		System.out.printf("%d",max);

	}

}

