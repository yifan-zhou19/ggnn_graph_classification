package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[30000];
		int n;
		int i;
		int j;
		int k;
		int temp;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3; i <= n; i++)
		{
			for (j = 2; j <= Math.sqrt(i); j++)
			{
				if (i % j == 0)
				{
					break;
				}
				else
				{
					continue;
				}
			}
			if (j > Math.sqrt(i))
			{
				a[b] = i;
				b++;
			}
		}
		b--;
		for (i = 6; i <= n; i += 2)
		{
			temp = 0;
			for (j = 0; j <= b; j++)
			{
				for (k = 0; k <= b; k++)
				{
					if (i - a[j] == a[k])
					{
						temp = 1;
						break;
					}
				}
				if (temp != 0)
				{
					break;
				}
			}
			if (temp != 0)
			{
				System.out.printf("%d=%d+%d\n",i,a[j],a[k]);
			}
		}
	}

}

