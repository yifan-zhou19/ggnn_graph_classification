package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int[] a = new int[500];
		int[] b = new int[500];
		int j = 0;
		int l;
		int k;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (((a[i]) % 2) != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (l = i;l < j;l++)
			{
				if (b[l] <= b[i])
				{
					 k = b[i];
					 b[i] = b[l];
					 b[l] = k;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i != j - 1)
			{
				System.out.printf("%d,",b[i]);
			}
			else
			{
				System.out.printf("%d\n",b[i]);
			}
		}





		return 0;
	}
}

