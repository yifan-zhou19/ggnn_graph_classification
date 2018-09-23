package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		j = 0;
		b = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 1;
		System.out.printf("%d",a[0]);
		while (i < n)
		{
			while ((j < i) && (b == 0))
			{
				if (a[j] != a[i])
				{
					j++;
				}
				else
				{
					b = 1;
				}
			}
			if (b == 0)
			{
				System.out.printf(" %d",a[i]);
			}
			i++;
			j = 0;
			b = 0;
		}
		return 0;
	}



}

