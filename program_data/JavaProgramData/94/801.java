package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int i;
			int j;
			int k = 0;
			int e;
			int[] a = new int[500];
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
			for (i = 0;i < n;i++)
			{
				if (a[i] % 2 == 0)
				{
					a[i] = 0;
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 0;j < n - i;j++)
				{
					if (a[j] > a[j + 1])
					{
						e = a[j + 1];
						a[j + 1] = a[j];
						a[j] = e;
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				if (a[i] != 0)
				{
				System.out.printf("%d,",a[i]);
				}
			}
			System.out.printf("%d",a[n - 1]);
			return 0;
		}
}

