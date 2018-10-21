package <missing>;

public class GlobalMembers
{
	public static int a1;
	public static int a2;
	public static int a3;
	public static int a4;
	public static int a5;
	public static int a6;
	public static int a7;
	public static int a8;
	public static int a9;
	public static int a10;
	public static int[] a = new int[100];
	public static String c = new String(new char[100]);

	public static int Main()
	{
		int judge1;
		int judge2;
		judge1 = judge2 = 0;
		int count = 0;
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (a1 = 0;a1 <= 4;a1++)
		{
			for (a2 = 0;a2 <= 4;a2++)
			{
				judge1 = judge2 = 0;
				for (a3 = 0;a3 <= 4;a3++)
				{
					if (a[a1][a3] > a[a1][a2])
					{
						break;
					}
					if (a3 == 4)
					{
						judge1 = 1;
					}
				}
				for (a4 = 0;a4 <= 4;a4++)
				{
					if (a[a4][a2] < a[a1][a2])
					{
						break;
					}
					if (a4 == 4)
					{
						judge2 = 1;
					}
				}
				if (judge1 == 1 && judge2 == 1)
				{
					System.out.printf("%d %d %d",a1 + 1,a2 + 1,a[a1][a2]);
					count++;
				}
			}
		}
		if (count == 0)
		{
			System.out.print("not found");
		}
	}

}

