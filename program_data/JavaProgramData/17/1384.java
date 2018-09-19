package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][20];
		char[][] b = new char[10][20];
		int i;
		int t;
		int y;
		int u = 0;
	   while (scanf("%s",a[u]) != EOF)
	   {
		b[u] = a[u];
		for (t = 0;a[u][t] != 0;t++)
		{
			if (a[u][t] != 40 && a[u][t] != 41)
			{
				b[u][t] = 32;
			}
			if (b[u][t] == 41)
			{
				for (y = t;y > -1;y--)
				{
					if (b[u][y] == 40)
					{
							b[u][y] = 32;
							b[u][t] = 32;
							break;
					}
				}
			}
		}
		for (t = 0;b[u][t] != 0;t++)
		{
			if (b[u][t] == 40)
			{
				b[u][t] = 36;
			}
			else if (b[u][t] == 41)
			{
				b[u][t] = 63;
			}
		}
		System.out.println(a[u]);
		System.out.println(b[u]);
		u++;

	   }
		return 0;
	}

}
