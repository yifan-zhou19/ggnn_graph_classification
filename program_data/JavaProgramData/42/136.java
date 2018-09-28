package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
		int j;
		int[] b = new int[100000];
		int c;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		j = 0;
		c = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				b[j] = a[i];
				j = j + 1;
				c = c + 1;
			}
		}
		for (j = 0;j < c - 1;j++)
		{
			System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d\n",b[j]);
	}
}

