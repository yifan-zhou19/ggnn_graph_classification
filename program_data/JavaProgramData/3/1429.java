package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int y;
	int[] sz = new int[1000];
	int x;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}

	for (int j = 0;j < n;j++)
	{

	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[j] = Integer.parseInt(tempVar3);
	   }
	}


	for (int k = 0;k <= n - 1;k++)
	{

		for (int i = 0;i < n;i++)
		{

			if (sz[k] + sz[i] == y)
			{

				x = 1;

			break;
			}

			if ((i == n - 1) && (sz[k] + sz[i] != y))
			{
			   x = 0;

			}

		}


		if (x == 1)
		{
		System.out.print("yes");

		break;
		}

		if ((k == n - 1) && (x == 0))
		{
		System.out.print("no");


		}



	}













	return 0;

	}
}

