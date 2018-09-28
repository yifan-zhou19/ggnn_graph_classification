package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int oddnum = 0;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int term;
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
			if ((a[i]) % 2 != 0)
			{
				b[i] = a[i];
				oddnum++;
			}
			else
			{
				b[i] = 0;
			}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					term = b[i];
					b[i] = b[i + 1];
					b[i + 1] = term;
				}
			}
		}
		System.out.printf("%d",b[n - oddnum]);
		for (k = n - oddnum + 1;k < n;k++)
		{
			System.out.printf(",%d",b[k]);
		}
		return 0;
	}


}

