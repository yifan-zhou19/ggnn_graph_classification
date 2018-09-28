package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int[] b = new int[301];
		int n;
		int i = 1;
		int k = 1;
		int j;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i != n)
			{
				scanf(" ");
			}
		}
		b[1] = a[1];
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= k;j++)
			{
				if (a[i] == b[j])
				{
					p = 1;
				}
			}
			if (p == 1)
			{
				p = 0;
			}
			else
			{
				k++;
				b[k] = a[i];
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != k)
			{
				System.out.print(",");
			}
		}
		return 0;
	}

}

