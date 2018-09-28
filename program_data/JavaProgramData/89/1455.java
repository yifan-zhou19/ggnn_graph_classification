package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		int y;
		int[] know = new int[10000];
		int[] beknown = new int[10000];
		for (i = 0; i < 10000; i++)
		{
			know[i] = 0;
			beknown[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = know;
		int[] q = beknown;
		while (true)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0 && y == 0)
			{
				break;
			}
			(p[x])++;
			(q[y])++;
		}
		int flag = 1;
		for (i = 0; i < n; i++)
		{
			if (know[i] == 0 && beknown[i] == n - 1)
			{
				flag = 0;
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (flag != 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

