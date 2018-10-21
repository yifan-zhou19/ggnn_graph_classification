package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[52]);
		int[] d = new int[52];
		int[] e = new int[52];
		int j;
		int i;
		int m;
		int n;
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
		for (i = 0;i < 26;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, 65 + i);
		}
		for (i = 26;i < 52;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, 71 + i);
		}


		m = a.length();
		n = b.length();

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 52;j++)
			{
			if (a.charAt(i) == c.charAt(j))
			{
				d[j]++;
			}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 52;j++)
			{
			if (b.charAt(i) == c.charAt(j))
			{
				e[j]++;
			}
			}
		}

		for (i = 0;i < 52;i++)
		{
			if (d[i] != e[i])
			{
				break;
			}
		}
		if (i == 52)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

