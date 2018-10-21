package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[30];
		int m;
		int i;
		int flag = 0;
		String pt;
		String c = new String(new char[30]);
		for (i = 0;i < 30;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
			}
		}
		pt = c.charAt(0);
		m = c.length();
		for (i = 0;i < m;i++)
		{
			if (c.charAt(i) <= '9' && c.charAt(i) >= '0')
			{
				a[i] = 1;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (a[i] == 1)
			{
				System.out.printf("%c",c.charAt(i));
				flag = 1;
			}
			if (a[i] == 0 && flag == 1)
			{
				System.out.print("\n");
				flag = 0;
			}
		}
		return 0;

	}
}

