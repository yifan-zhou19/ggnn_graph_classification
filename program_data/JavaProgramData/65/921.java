package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] sz = new int[200][2];
		int a;
		int b;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			if (((sz[i][0] == 0) && (sz[i][1] == 1)) || ((sz[i][0] == 1) && (sz[i][1] == 2)) || ((sz[i][0] == 2) && (sz[i][1] == 0)))
			{
				a++;
			}
			if (sz[i][0] == sz[i][1])
			{
				continue;
			}
			if (((sz[i][0] == 1) && (sz[i][1] == 0)) || ((sz[i][0] == 2) && (sz[i][1] == 1)) || ((sz[i][0] == 0) && (sz[i][1] == 2)))
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}

}

