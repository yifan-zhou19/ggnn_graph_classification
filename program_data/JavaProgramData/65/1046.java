package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[200][2];
		int n;
		int i;
		int j;
		int a;
		int b;
		a = 0;
		b = 0;
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
			sz[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i][1] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 0;j < n;j++)
		{
		 if (sz[j][0] == 0)
		 {
				if (sz[j][1] == 1)
				{
				a++;
				}
				else if (sz[j][1] == 2)
				{
				b++;
				}
		 }
			else if (sz[j][0] == 1)
			{
				if (sz[j][1] == 2)
				{
				a++;
				}
				else if (sz[j][1] == 0)
				{
				b++;
				}
			}
			else if (sz[j][0] == 2)
			{
				if (sz[j][1] == 0)
				{
				a++;
				}
				else if (sz[j][1] == 1)
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
		else
		{
		System.out.print("Tie");
		}

	return 0;
	}
}

