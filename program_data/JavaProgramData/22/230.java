package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int n;
		int[] a = new int[300];
		int m;
		int r;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			i++;
		}while (c != '\n');
		n = i;
		m = a[0];
		for (i = 0;i < n;i++)
		{
			m = a[i] > m != 0?a[i]:m;
		}
		r = 1;
		for (i = 0;i < n;i++)
		{
			if (a[i] != m)
			{
			r = 0;
			break;
			}
		}
		if (r == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				r = 1;
				for (j = 0;j < n;j++)
				{
					if (a[j] == m)
					{
						continue;
					}
					if ((m - a[i]) <= (m - a[j]) && a[i] != m)
					{
						r = 1;
					}
					else
					{
						r = 0;
						break;
					}
				}
				if (r == 1)
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}
	}
}

