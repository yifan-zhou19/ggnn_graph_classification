package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int j;
		int k;
		int[] a = new int[25];
		int i;
		int c;
		int[] b = new int[25];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}

		for (j = n - 2;j >= 0;j--)
		{
			t = 0;
			for (k = j + 1;k < n;k++)
			{
				if (a[k] <= a[j] != 0 && b[k]> t)
				{
					t = b[k];
				}
			}
			b[j] = b[j] + t;

		}
		c = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > c)
			{
				c = b[i];
			}
		}

		System.out.printf("%d",c);


	}
}

