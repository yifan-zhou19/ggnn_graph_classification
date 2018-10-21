package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] map = new int[1010][1010];

	public static void init()
	{
		 int i;
		 int j;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 map[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		 }
	}
	public static void work()
	{
		 int sx;
		 int sy;
		 int ex;
		 int ey;
		 int f;
		 int i;
		 int j;
		 sx = sy = 0;
		 ex = ey = n - 1;
		 f = 0;
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 if (map[i][j] == 0)
				 {
					sx = i;
					sy = j;
					f = 1;
					break;
				 }
			 }
			 if (f != 0)
			 {
				 break;
			 }
		 }
		 f = 0;
		 for (i = n - 1;i >= 0;i--)
		 {
			 for (j = n - 1;j >= 0;j--)
			 {
				 if (map[i][j] == 0)
				 {
					ex = i;
					ey = j;
					f = 1;
					break;
				 }
			 }
			 if (f != 0)
			 {
				 break;
			 }
		 }
		 System.out.print((ex - sx - 1) * (ey - sy - 1));
		 System.out.print("\n");
	}

	public static int Main()
	{
		init();
		work();
		return 0;
	}

}

