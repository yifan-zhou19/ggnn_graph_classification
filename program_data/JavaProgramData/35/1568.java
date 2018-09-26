package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = new int(int b[8][8],int c,int d,int l[2]);
		int e;
		int f;
		int g;
		int k;
		int[][] h = new int[8][8];
		int[] j = new int[2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			f = Integer.parseInt(tempVar2);
		}
		for (g = 0;g < e;g++)
		{
			for (k = 0;k < f;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[g][k] = Integer.parseInt(tempVar3);
				}
			}
		}
			if (a(h, e, f, j) != 0)
			{
				System.out.printf("%d+%d\n",j[0],j[1]);
			}
			else
			{
				System.out.print("No\n");
			}
			return 0;
	}
	public static int a(int[][] b, int c, int d, int[] l)
	{
		int i = 0;
		int o = 0;
		int p = 0;
		int r = 0;
		int s;
		int t = 0;
		int z = 0;
		int[] n = new int[8];
		int[] q = new int[8];
		for (o = 0;o < c;o++)
		{
			for (p = 0;p < d;p++)
			{

			   if (q[o] < b[o][p])
			   {
				   q[o] = b[o][p];
				   n[o] = p;
			   }

			}
		}
		for (r = 0;r < c;r++)
		{
			s = n[r];
		   for (o = 0;o < c;o++)
		   {
			   if (b[o][s] >= q[r])
			   {
				   t = t + 1;
			   }
		   }
		   if (t == c)
		   {
			   if (z == 0)
			   {
			   i = 1;
			   l[0] = r;
			   l[1] = n[r];
			   z = z + 1;
			   }
		   }
		   t = 0;
		}
		return i;

	}
}

