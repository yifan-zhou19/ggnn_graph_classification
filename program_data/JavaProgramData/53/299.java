package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int n;
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
		b[0] = a[0];
		c = 1;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < c;j++)
			{
			if (a[i] == b[j])
			{
				break;
			}
			}
			if (j == c)
			{
				b[c] = a[i];
				c = j + 1;
			}
		}
		for (j = 0;j < c - 1;j++)
		{
		System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[c - 1]);
	}

}

