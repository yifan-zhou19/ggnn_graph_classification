package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i = 0;
		int e = 0;
		int[][] a = new int[2][1000];
		int c;
		int d;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < c;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < c - 1;i++)
		{
			for (e = i + 1;e < c - 1;e++)
			{

				if (a[0][i] + a[0][e] == d)
				{
					t++;
				}
				else
				{
					continue;
				}

			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
	}
}

