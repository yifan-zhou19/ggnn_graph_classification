package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int[] b = new int[300];
		int j = 0;
		int p;
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
			  a + i = tempVar2;
		  }
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				b[j] = a[i];
				j++;
			}
			if (i > 0)
			{
				for (p = 0;p <= j;p++)
				{
					if (a[i] == b[p])
					{
						break;
					}
					if (p == j)
					{
						b[j] = a[i];
						j++;
						break;
					}
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j - 1]);
		return 0;
	}
}

