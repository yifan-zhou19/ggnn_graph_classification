package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int b;
		int c;
		int d;
		int e;
		int huanh = new int(int z[][5],int x,int y);
		for (d = 0;d < 5;d++)
		{
			for (e = 0;e < 5;e++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[d][e] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		d = huanh(a, b, c);
		if (d == 0)
		{
			System.out.print("error");
		}
		if (d != 0)
		{
			for (d = 0;d < 5;d++)
			{
				for (e = 0;e < 5;e++)
				{
					System.out.printf("%d%c",a[d][e],e < 4?' ':'\n');
				}
			}
		}
	}
	public static int huanh(int[][] z, int x, int y)
	{
		int i;
		int t;
		if (x < 5 && x >= 0 && y < 5 && y >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				t = z[x][i];
				z[x][i] = z[y][i];
				z[y][i] = t;
			}
			return (1);
		}
		else
		{
			return (0);
		}
	}




}

