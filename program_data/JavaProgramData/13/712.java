package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int b;
		int t;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			j = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			for (t = 0;t < k;t++)
			{
				if (b == a[t])
				{
				   j = 0;
				}
			}
			if (j == 1)
			{
				a[k] = b;
				k++;
				if (k == 1)
				{
				   System.out.printf("%d",b);
				}
				else
				{
				   System.out.printf(" %d",b);
				}
			}
		}
		System.in.read();
		System.in.read();
	}
}

