package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int t;
		int i;
		int j;
		int p;
		int[] a = new int[1000000];
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
		p = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				p++;
			}
		}
		i = 0;
		while (i < n)
		{
			if (a[i] == k)
			{
				for (j = i + 1;a[j] == k;j++)
				{
					;
				}
				t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < n - p - 1;i++)
		{
			System.out.printf("%ld ",a[i]);
		}
			 System.out.printf("%ld",a[n - p - 1]);
	}
}

