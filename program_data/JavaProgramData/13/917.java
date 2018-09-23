package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		j = 0;
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
		System.out.printf("%d",a[0]);
		m = 1;
		if (n > 1)
		{
			do
			{

				for (i = m - 1;i >= 0;i--)
				{
					if (a[m] == a[i])
					{
						j = j + 1;
					}
				}
				if (j == 0)
				{
					System.out.printf(" %d",a[m]);
				}
				j = 0;
				m = m + 1;
			}while (m < n);
		}
		System.out.print("\n");
	}
}

