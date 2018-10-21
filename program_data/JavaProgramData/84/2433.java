package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] sz = new int[300];
		int j;
		int m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[j] > sz[i])
				{
				   m++;
				}
			}
			if (m == 0)
			{
			a = sz[i];
			System.out.printf("%d\n",a);
			break;
			}
			m = 0;
		}
	  m = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{

				if (sz[j] > sz[i])
				{
				   m++;
				}

			}
			if (m == 1)
			{
			b = sz[i];
			System.out.printf("%d\n",b);
			break;
			}
			m = 0;
		}
		return 0;
	}


}

