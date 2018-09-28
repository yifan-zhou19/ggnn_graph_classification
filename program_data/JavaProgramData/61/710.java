package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int m;
		int n;
		a[0] = 1;
		a[1] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (int q = 2;q < n;q++)
			{
					a[q] = a[q - 1] + a[q - 2];

			}
			System.out.printf("%d\n",a[n - 1]);
		}
	}

}

