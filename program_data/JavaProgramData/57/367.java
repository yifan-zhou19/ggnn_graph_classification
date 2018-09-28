package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][20];
		String b = new String(new char[50]);
		int n;
		int i;
		int j;
		int c;
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
			c = b.charAt(i);
			if (a[i][c - 1] == 'g')
			{
				a[i][c - 1] = '\0';
				a[i][c - 2] = '\0';
				a[i][c - 3] = '\0';
			}
			else
			{
				a[i][c - 1] = '\0';
				a[i][c - 2] = '\0';
			}
			System.out.printf("%s\n",a[i]);
		}
	}

}

