package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int l;
		int k;
		int r = 0;
		int[] a = new int[301];
		int[] c = new int[301];
		int[] b = new int[1000];
		for (j = 1;;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 1;i <= n;i++)
			{
				a[i] = i;
			}
			for (l = n;l > 1;l--)
			{
				if (m % l == 0)
				{
					continue;
				}
				else
				{
				k = m % l;
				}
				for (i = 1;i <= l - k;i++)
				{
					c[i] = a[k + i];
				}
				for (i = l - k + 1;i <= l - 1;i++)
				{
					c[i] = a[i - l + k];
				}
				for (i = 1;i <= l - 1;i++)
				{
					a[i] = c[i];
				}
			}
			b[j] = a[1];
			r++;
		}
		for (j = 1;j <= r;j++)
		{
			System.out.printf("%d\n",b[j]);
		}
	}


}

