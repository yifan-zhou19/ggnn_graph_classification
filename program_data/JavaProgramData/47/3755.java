package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int[] a = new int[111];
		int[] b = new int[111];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = n - 1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[j] = a[i];
			j--;
		}
		for (j = 0;j < n - 1;j++)
		{
		System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d\n",b[n - 1]);
	}
}

