package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int[] z = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int k;
		int j;
		int l;
		int function = new int(int,int);
		int[] o = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
				for (j = 0;j <= i;j++)
				{
				o[i] = o[i] + z[j];
				}
		}
		for (i = 0;i < 12;i++)
		{
			k = function(w, o[i]);
			if (k != 0)
			{
								l = i + 1;
				System.out.printf("%d\n",l);
			}
			else
			{
				continue;
			}
		}
	}

	public static int function(int x,int y)
	{
		int z = 0;
		int u;
		u = (x + y + 13 - 1) % 7;
		if (u == 5)
		{
			z = 1;
		}
		return (z);
	}
}

