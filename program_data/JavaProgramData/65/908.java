package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int[][] sz = new int[200][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][0] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					sz[i][1] = Integer.parseInt(tempVar3);
				}
		}
		for (int i = 0;i < n;i++)
		{
				if (sz[i][0] == 0)
				{
					if (sz[i][1] == 1)
					{
						a++;
					}
					else if (sz[i][1] == 2)
					{
						b++;
					}
				}
				if (sz[i][0] == 1)
				{
					if (sz[i][1] == 2)
					{
						a++;
					}
					else if (sz[i][1] == 0)
					{
						b++;
					}
				}
				if (sz[i][0] == 2)
				{
					if (sz[i][1] == 0)
					{
					   a++;
					}
					else if (sz[i][1] == 1)
					{
					   b++;
					}
				}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

