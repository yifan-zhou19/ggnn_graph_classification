package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int l;
		int b;
		int i1;
		int j;
		int k;
		int[] a = new int[302];
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0 && n == 0)
		{
			break;
		}
		if (n == 1)
		{
			System.out.print("1\n");
			continue;
		}
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		l = n;
		k = 0;
		for (i1 = 0;;i1++)
		{

			b = (k + m) % l;
			if (b == 0)
			{
				b = l;
			}
			for (i = b - 1;i < l;i++)
			{
				a[i] = a[i + 1];
			}
			l--;
			k = b - 1;
			if (a[1] == 0)
			{
				break;
			}
		}

		System.out.printf("%d\n",a[0]);

		}
	}
}

