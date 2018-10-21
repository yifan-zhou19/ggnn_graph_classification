package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] sz = new int[100];
		int i;
		int n;
		int e;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[0] = Integer.parseInt(tempVar2);
		}

		for (i = 1;i < n;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar3);
		  }
		}

		if (n % 2 == 0)
		{
			for (i = 0;i < n / 2;i++)
			{
				e = sz[i];
				sz[i] = sz[n - i - 1];
				sz[n - 1 - i] = e;
			}
		}
		else
		{

			for (i = 0;i < (n - 1) / 2;i++)
			{
				e = sz[i];
				sz[i] = sz[n - i - 1];
				sz[n - 1 - i] = e;
			}
		}

		System.out.printf("%d",sz[0]);

		for (i = 1;i < n;i++)
		{
		  System.out.printf(" %d",sz[i]);
		}
		return 0;
	}

}

