package <missing>;

public class GlobalMembers
{
	public static int[][] m = new int[100][100];
	public static void a()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(m,0,(Integer.SIZE / Byte.SIZE));
		int x;
		int y;
		int count = 0;
		int sum = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = m[0];
		for (;p <= m[x - 1] + y - 1;p++)
		{
			count++;
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (count == 1 || count == y)
			{
				sum += p[0];
			}
			else if (p <= m[0] + y - 1)
			{
				sum += p[0];
			}
			else if (m[x - 1] <= p && p <= m[x - 1] + y - 1)
			{
				sum += p[0];
			}
			if (count == y)
			{
				p = p + 100 - y;
				count = 0;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			a();
		}
		return 0;
	}
}

