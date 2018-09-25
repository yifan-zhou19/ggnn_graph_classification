package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int[] a = new int[500];
		int[] b = new int[500];
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
		}
		System.out.print("\n");
		for (i = 0,j = 0,k = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
			b[j] = a[i];
		j++;
		k++;
			}
		}
		for (j = 0;j < k;j++)
		{
			for (l = j + 1;l < k;l++)
			{
		if (b[l] < b[j])
		{
			m = b[l];
			b[l] = b[j];
			b[j] = m;
		}
			}
		if (j == 0)
		{
			System.out.printf("%d",b[j]);
		}
		else
		{
		System.out.printf(",%d",b[j]);
		}
		}
		System.out.print("\n");
		return 0;
	}
}

