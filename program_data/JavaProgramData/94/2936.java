package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		int k = 0;
		int j;
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
			if (a[i] % 2 == 1)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 0;;i++)
		{
			System.out.printf("%d",b[i]);
			if (i < k - 1)
			{
				System.out.print(",");
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

