package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[321];
		int i;
		int k;
		int count;


		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}

			k = 1;
			for (i = 1;i <= n;i++)
			{
				a[i] = 0;
			}

			for (i = 1;i < n;i++)
			{
				count = 0;
				do
				{
					if (a[k] == 0)
					{
						count++;
					}
					if (count != m)
					{
						k++;
					}
					if (k > n)
					{
						k = 1;
					}
				}while (count < m);
				a[k] = 1;

			}

			for (i = 1;i <= n;i++)
			{
				if (a[i] == 0)
				{
					System.out.printf("%d",i);
				}
			}
			System.out.print("\n");

		}while (1 != 0);
	}
}

