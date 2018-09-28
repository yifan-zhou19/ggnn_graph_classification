package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] b = new int[201];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			System.in.read();
		}

		int num;
		int q = 0;
		int z;
		int x = 0;
		int y = 30;
		for (z = 0;z < n;z++)
		{
			b[z] = String.valueOf(c[z]).length();

			if (b[z] >= x)
			{
				x = b[z];
			}
			if (b[z] <= y)
			{
				y = b[z];
			}

		}
		for (z = 0;z < n;z++)
		{
			if (b[z] == x)
			{
				System.out.printf("%s\n", c[z]);
				break;
			}
		}
		for (z = 0;z < n;z++)
		{
			if (b[z] == y)
			{
				System.out.printf("%s", c[z]);
				break;
			}
		}
	}
}

