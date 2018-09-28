package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int n;
		int i;
		int j;
		int m;
		n = a.length();
		m = b.length();
		if (n == m)
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a.charAt(j) > a.charAt(j + 1))
					{
						c = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						a = tangible.StringFunctions.changeCharacter(a, j + 1, c);
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (b.charAt(j) > b.charAt(j + 1))
					{
						c = b.charAt(j);
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
						b = tangible.StringFunctions.changeCharacter(b, j + 1, c);
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) != b.charAt(i))
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}



}

