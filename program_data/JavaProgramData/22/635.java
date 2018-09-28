package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int k;
		int j;
		int m;
		char c;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		k = i + 1;
		if (k == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 1;i < k;i++)
			{
			for (j = 0;j < k - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
			}
		for (j = 0;j < k - 1;j++)
		{
			if (a[j] != a[j + 1])
			{
				System.out.printf("%d\n",a[j + 1]);
				break;
			}
		}
		if (j == k - 1)
		{
			System.out.print("No\n");
		}
		}
	}
}

