package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int[] b = new int[301];
		int i;
		int j;
		int n;
		int m;
		int p;
		int t;
		int line;
		int num;
		for (;;)
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
		if (n == 0 && m == 0)
		{
			break;
		}
		else
		{
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (num = 0;num < n - 1;num++)
		{
			p = n - num;
			for (i = 1;;i++)
			{
				if (p >= m)
				{
					break;
				}
				p = p + n - num;
			}
			if (i == 1)
			{
				line = m;
			}
			else
			{
				line = n - num - p % m;
			}
			for (j = 1;j <= n - num - 1;j++)
			{
				if (line + j > n - num)
				{
					t = line + j - (n - num);
				}
			   else
			   {
				   t = line + j;
			   }
			   b[j] = a[t];
			}
			for (j = 1;j <= n - num - 1;j++)
			{
				a[j] = b[j];
			}
		}
		System.out.printf("%d\n",a[1]);
		}
		}
	}
}

