package <missing>;

public class GlobalMembers
{
	public static int[][] ren = new int[1000000][2];
	public static int[][] ming = new int[1000000][2];
	public static int Main()
	{
		int n;
		int i = 0;
		int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ming, 0, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			ren[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ren[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (ren[i][0] == 0 && ren[i][1] == 0)
			{
				break;
			}
			else
			{
				ming[ren[i][0]][0]++;
				ming[ren[i][1]][1]++;
			}
			i++;
		}
		for (i = 0; i < n; i++)
		{
			if (ming[i][0] == 0 && ming[i][1] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				num++;
			}
		}
		if (num == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

