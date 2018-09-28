package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[300];
		int t = 0;
		char b;
		for (;;)
		{
			for (;;)
			{
				b = System.in.read();
				if (b == ',' || b == '\n')
				{
					break;
				}
				a[i] = a[i] * 10 + (int)(b - '0');
			}
			if (b == '\n')
			{
				break;
			}
			i++;
		}
		if (i == 0)
		{
			System.out.print("No\n");
			System.exit(0);
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] == a[k])
			{
				t++;
			}
		}
		if (t == i + 1)
		{
			System.out.print("No\n");
			System.exit(0);
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] > a[k])
			{
				k = j;
			}
		}
		t = a[k];
		for (j = 0;j <= i;j++)
		{
			if (a[j] == t)
			{
				a[j] = 0;
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] > a[k])
			{
				k = j;
			}
		}
		System.out.printf("%d\n",a[k]);
	}

}
