package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[20000];
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a[i] = 0;
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 2;i <= n;i++)
			{
				for (b = 2;b < i - 1;b++)
				{
					if (i % b == 0)
					{
						break;
					}
				}
				if (b == i - 1)
				{
					a[i] = i;
				}
			}
			for (i = 1;i < n - 1;i++)
			{
				if (a[i] != 0 && a[i + 2] != 0)
				{
					System.out.printf("%d %d\n",a[i],a[i + 2]);
				}
			}
		}
	}



}

