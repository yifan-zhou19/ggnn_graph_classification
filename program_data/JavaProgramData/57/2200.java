package <missing>;

public class GlobalMembers
{
	public static int f(String c)
	{
		int z = 0;
		int l;
		l = c.length();
		if (c[l - 2].equals('e') && c[l - 1].equals('r'))
		{
			z = 2;
		}
		if (c[l - 2].equals('l') && c[l - 1].equals('y'))
		{
			z = 2;
		}
		if (c[l - 3].equals('i') && c[l - 2].equals('n') && c[l - 1].equals('g'))
		{
			z = 3;
		}
		return z;
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		char[][] a = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(a[i]).length();
			if (f(a[i]) == 2)
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.print("\n");
			}
			if (f(a[i]) == 3)
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.print("\n");
			}
		}
	}

}

