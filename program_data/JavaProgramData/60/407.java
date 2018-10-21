package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int i;
		int j = 1;
		int k;
		int m;
		a[1] = 3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 7)
		{
			System.out.print("3 5\n");
			for (i = 5;i <= n - 2;i = i + 2)
			{
				for (k = 1;k <= j;k++)
				{
					if (i % a[k] == 0)
					{
						break;
					}
				}
				if (k == j + 1)
				{
					j += 1;
					a[j] = i;
					for (m = 1;m <= j;m++)
					{
						if ((i + 2) % a[m] == 0)
						{
						break;
						}
					}
					if (m == j + 1)
					{
						System.out.printf("%d %d\n",i,i + 2);
					}
				}
			}
		}
		else if (n == 5 || n == 6)
		{
			System.out.print("3 5\n");
		}
		else
		{
			System.out.print("empty");
		}
		return 0;

	}
}

