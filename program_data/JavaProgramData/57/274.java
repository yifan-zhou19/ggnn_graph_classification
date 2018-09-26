package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	void de(char x[][50],int y);
		int k;
		int i;
		char[][] x =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = tempVar2.charAt(0);
		}
		}
		for (i = 0;i <= k - 1;i++)
		{
		de(x, i);
		}
		for (i = 0;i <= k - 1;i++)
		{
		System.out.printf("%s\n",x[i]);
		}
	return 0;
	}
	public static void de(String[] x, int y)
	{
		 int c;
		 c = x[y].length();
		 if (x[y][c - 1].equals('r') || x[y][c - 1].equals('y'))
		 {
										   x[y][c - 1] = null;
										   x[y][c - 2] = null;
		 }
		 else if (x[y][c - 1].equals('g'))
		 {
			  x[y][c - 1] = null;
			  x[y][c - 2] = null;
			  x[y][c - 3] = null;
		 }
	}

}

