package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int[] a = new int[100];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		for (l = 0;l < n;l++)
		{
			for (i = 0;i <= k;i++)
			{
			  a[i] *= 2;
			}
			for (i = 0;i <= k;i++)
			{
				a[i + 1] += a[i] / 10;
				a[i] = a[i] % 10;
			}
			if (a[k + 1] != 0)
			{
				k++;
			}
		}
		for (i = k;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
	}
}

