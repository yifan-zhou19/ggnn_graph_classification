package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] sz = new int[100];

		int i;
		int e;
		int n;
		int k;
		int dt;

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
				(sz[i]) = Integer.parseInt(tempVar2);
			}

		}

		for (e = 1;e <= n;e++)
		{

			for (k = 0;k < n - e;k++)
			{

				dt = sz[k];

				sz[k] = sz[k + 1];

				sz[k + 1] = dt;

			}

		}

		 for (i = 0;i < n;i++)
		 {

			 if (i < n - 1)
			 {

			 System.out.printf("%d ",sz[i]);

			 }
			 else
			 {

			 System.out.printf("%d",sz[i]);

			 }

		 }

		 return 0;

	}
}

