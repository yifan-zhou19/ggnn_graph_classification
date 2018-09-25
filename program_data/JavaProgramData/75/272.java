package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int max;
		int t = 0;
		char d;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			n++;
		}while ((d = System.in.read()) != '\n');
		for (i = 0;i < n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[n - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > t)
			{
				t = b[i];
			}
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (i >= a[j] != 0 && i < b[j])
			{
				c[i]++;
			}
			}
		}
		max = c[0];
		for (i = 1;i < t;i++)
		{
			if (max < c[i])
			{
				max = c[i];
			}
		}
		System.out.printf("%d %d",n,max);
		return 0;
	}
}

