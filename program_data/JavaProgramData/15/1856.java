package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int x;
		int y;
		int a;
		int b;
		int[][] sz = new int[100][100];
		int tag;
		int tag1 = 0;

		for (x = 0;x < n;x++)
		{

			tag = 0;

			for (y = 0;y < n;y++)
			{

				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[x][y] = Integer.parseInt(tempVar2);
				}

				if (sz[x][y] == 0)
				{

					tag++;

					tag1++;

				}

			}

			if (tag1 == tag)
			{

				a = tag - 2;

			}



		}

		b = (tag1 - 2 * (a + 2)) / 2;

		System.out.printf("%d",a * b);

		return 0;

	}




}

