package <missing>;

public class GlobalMembers
{
	public static int[] in = new int[100000];
	public static int[] out = new int[100000];


	public static int Main()
	{
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d %d", x, y), (x != 0) || (y != 0))
		{
			out[x]++;
			in[y]++;
		}

		int find = 0;
		for (int i = 0;i < n;i++)
		{
		if (in[i] == n - 1 && out[i] == 0)
		{
			System.out.printf("%d\n",i);
			find = 1;
		}
		}
		if (find == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}




}

