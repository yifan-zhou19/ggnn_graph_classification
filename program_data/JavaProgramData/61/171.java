package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x = 1;
		int y = 1;
		int z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));

		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
			x = 1;
			y = 1;
			for (j = 1;j <= a[i];j++)
			{
				z = x + y;
				x = y;
				y = z;
			}

			System.out.print(y - x);
			System.out.print("\n");
		}
		return 0;
	}

}

