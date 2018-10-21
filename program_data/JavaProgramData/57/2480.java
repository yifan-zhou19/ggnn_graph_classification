package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		char[][] a = new char[51][33];
		String b = new String(new char[51]);
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
			b = tangible.StringFunctions.changeCharacter(b, i, String.valueOf(a[i]).length());
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][b.charAt(i) - 1] == 'r')
			{
				a[i][b.charAt(i) - 2] = '\0';
			}
			else if (a[i][b.charAt(i) - 1] == 'y')
			{
				a[i][b.charAt(i) - 2] = '\0';
			}
			else if (a[i][b.charAt(i) - 1] == 'g')
			{
				a[i][b.charAt(i) - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}
}

