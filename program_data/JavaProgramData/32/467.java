package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			x = a.length();
			y = b.length();
			for (j = y - 1;j >= 0;j--)
			{
				if (a.charAt(x - y + j) < b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, x - y + j, a.charAt(x - y + j) + 10 - b.charAt(j) + 48);
					a.charAt(x - y + j - 1) -= 1;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, x - y + j, a.charAt(x - y + j) - b.charAt(j) + 48);
				}
			}
			System.out.printf("%s\n",a);
		}
		return 0;
	}
}

