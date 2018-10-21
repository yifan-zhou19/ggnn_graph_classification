package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100000][2];
		int[] b = new int[100000];
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; ; i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] == 0 && a[i][1] == 0)
			{
				break;
			}
			if (a[i][0] != a[i][1])
			{
				b[a[i][0]] = 1;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (b[i] == 0)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

