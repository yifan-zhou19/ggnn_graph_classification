package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int sqrti;
		int m = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			sqrti = (int)Math.sqrt(i);
			for (j = 3;j <= sqrti;j += 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > sqrti)
			{
				a[m] = i;
				m++;
			}
		}
		for (i = 0;i <= m;i++)
		{
			for (j = i;j <= m;j++)
			{
				if (n == a[i] + a[j])
				{
					System.out.printf("%d %d\n",a[i],a[j]);
				}
			}
		}
	}


}

