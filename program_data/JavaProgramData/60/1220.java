package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int n;
		int k = 0;
		int b = 0;
		int x = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			b = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
					b++;
				}
			}
			if (b == i - 2)
			{
				a[k] = i;
				k++;
			}
		}
		for (c = 0;c < k - 1;c++)
		{
			if (a[c + 1] - a[c] == 2)
			{
				System.out.printf("%d %d\n",a[c],a[c + 1]);
			}
			else
			{
						x++;
			}
		}
			 if (x == k - 1)
			 {
					System.out.print("empty");
			 }
		return 0;
	}


}

