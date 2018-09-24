package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int[] c = new int[500];
		int i;
		int d = 1;
		int n;
		int[] a = new int[500];
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
		System.out.printf("%d",a[0]);
		while (d < n)
		{
			c[d] = 0;
			for (j = 0;j < d;j++)
			{
			if (a[d] == a[j])
			{
				c[d] = 1;
				break;
			}
			}
			d++;
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] == 0)
			{
		System.out.printf(",%d",a[i]);
			}
		}
	}
}

