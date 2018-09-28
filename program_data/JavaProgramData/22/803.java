package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j = 0;
		int c = 0;
		int l;
		int d;
		char b = 'a';
		while (b != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i += 1;
			b = System.in.read();
		}
		l = i;
		if (l == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i <= l - 2;i++)
		{
			if (a[i] - a[i + 1] == 0)
			{
				c = c + 1;
			}
		}
		if (c == l - 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 1;i <= l - 1;i++)
		{
			for (j = 0;j <= l - i - 1;j++)
			{
				if (a[j] <= a[j + 1])
				{
					d = a[j + 1];
					a[j + 1] = a[j];
					a[j] = d;
				}
			}
		}
		for (i = 0;i <= l - 1;i++)
		{
			if (a[i] - a[i + 1] != 0)
			{
				System.out.printf("%d",a[i + 1]);
				break;
			}
		}
		}
		}
	}
}

