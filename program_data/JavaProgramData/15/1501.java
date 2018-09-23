package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int rol;
		int col;
		int a;
		int b;
		int c;
		int d;
		int x;
		int[][] sz1 = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (rol = 0;rol < n;rol++)
		{
			for (col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(sz1[rol][col]) = Integer.parseInt(tempVar2);
				}
			}

		}
		for (rol = 0;rol < n;rol++)
		{
			for (col = 0;col < n;col++)
			{
				if (sz1[rol][col] == 0)
				{
					b = col;
					break;
				}
			}
		}
		for (col = 0;col < n;col++)
		{
			for (rol = 0;rol < n;rol++)
			{
				if (sz1[rol][col] == 0)
				{
					a = rol;
					break;
				}
			}
		}
		for (col = b;col < n;col++)
		{
			if (sz1[a][col] != 0)
			{
				d = col - 1;
				break;
			}
		}

		for (rol = a;rol < n;rol++)
		{
			if (sz1[rol][d] != 0)
			{
				c = rol - 1;
				break;
			}
		}

		x = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",x);
		return 0;
	}

}

