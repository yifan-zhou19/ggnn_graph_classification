package <missing>;

public class GlobalMembers
{
	// horse_race.cpp : ??????????????
	//


	public static int[] tian = new int[1001];
	public static int[] king = new int[1001];
	public static int horses;
	public static int[][] f = new int[1001][1001];
	public static void init()
	{
	 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(f,0xff,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < horses;i++)
		{
	  tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < horses;i++)
		{
	  king[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	 sort(tian,tian + horses);
	 sort(king,king + horses);
	}
	public static int getf(int x,int y)
	{
		if (f[x][y] != -1)
		{
	  return f[x][y];
		}
		if (x >= horses != 0 || y >= horses)
		{
	  return f[x][y] = 0;
		}
		if (tian[x] > king[y])
		{
	  return f[x][y] = getf(x + 1, y + 1) + 200;
		}
		if (tian[x] < king[y])
		{
	  return f[x][y] = getf(x + 1, y) - 200;
		}
		if (tian[x] == king[y])
		{
	  return f[x][y] = Math.max(getf(x + 1, y + 1),getf(x + 1, y) - 200);
		}
		return 0;
	}
	public static int Main()
	{
	 while ((horses = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	 {
			if (horses == 0)
			{
				break;
			}
		init();
		   System.out.print(getf(0, 0));
		   System.out.print("\n");
	 }
		return 0;
	}
}

