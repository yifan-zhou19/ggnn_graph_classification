package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[4];
		int i;
		int t;
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			while (x[i] > 0)

			{
			t = x[i] % 10;
			System.out.printf("%d",t);
			x[i] = (x[i] - t) / 10;
			}
			System.out.print("\n");
		}
			return 0;
	}
}

