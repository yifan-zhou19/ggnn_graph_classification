package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String c = new String(new char[20000]);
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
		}
		System.out.printf("%d",c.charAt(1));
		for (n = 2;n <= k;n++)
		{
			for (j = 1;j <= n - 1;j++)
			{
				 if (c.charAt(n) == c.charAt(j))
				 {
					 break;
				 }
			}
			if (j == n && c.charAt(n) != c.charAt(n - 1))
			{
				System.out.print(" ");
				System.out.printf("%d",c.charAt(n));
			}
		}
		return 0;
	}
}

