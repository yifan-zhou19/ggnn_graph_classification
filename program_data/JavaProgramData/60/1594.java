package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 2;
		int j = 2;
		int q;
		int m = 0;
		int n = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
			if (q < 5)
			{
			System.out.print("empty\n");
			}
			else
			{
				for (i = 2;i <= q;i++)
				{
			for (j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (j == i)
			{
				a[n++] = i;
			}
				}
		   for (i = 0;i < n - 1;i++)
		   {
				  if ((a[i + 1] - a[i]) == 2)
				  {
							m = m + 1;
						  System.out.printf("%d %d\n",a[i],a[i + 1]);
				  }
		   }
			}

			return 0;
	}
}

