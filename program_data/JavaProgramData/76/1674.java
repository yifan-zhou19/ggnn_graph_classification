package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[50000];
		int i;
		int e;
		int f;
		int j;
		int sum = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		e = a[0];
		f = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < e)
			{
				e = a[i];
			}
			if (b[i] > f)
			{
				f = b[i];
			}
		}
		for (i = e;i <= f;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j <= b[i] - 1;j++)
			{
				c[j] = 0;
			}
		}
		for (i = e;i <= f;i++)
		{
			sum += c[i];
		}
		if (sum == 1)
		{
			System.out.printf("%d %d",e, f);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

