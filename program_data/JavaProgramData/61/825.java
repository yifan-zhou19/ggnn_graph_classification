package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
		int j;
		int k;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 1 || m == 2)
			{
				if (i == 0)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("\n1\n");
				}
			}
			else
			{
				a[0] = 1;
				a[1] = 2;
				for (j = 2;j < m - 1;j++)
				{
					a[j] = a[j - 1] + a[j - 2];
				}
				if (i == 0)
				{
					System.out.printf("%d\n",a[m - 2]);
				}
				else
				{
					System.out.printf("\n%d\n",a[m - 2]);
				}
			}
		}
	}
}

