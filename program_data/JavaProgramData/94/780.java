package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int k;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,k = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i <= (k - 1);i++)
		{
			for (j = 0;j <= (k - 1 - i);j++)
			{
				if (b[j] < b[j + 1])
				{
					c = b[j];
					b[j] = b[j + 1];
					b[j + 1] = c;
				}
			}
		}
		for (i = (k - 1);i >= 0;i--)
		{
			if (i == (k - 1))
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf(",%d",b[i]);
			}
		}
	}
}

