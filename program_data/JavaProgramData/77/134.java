package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		String a = new String(new char[100]);
		char m;
		char n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		p = a.length();
		m = a.charAt(0);
		for (i = 1;i <= p / 2;i++)
		{
			if (a.charAt(i) != m)
			{
			n = a.charAt(i);
			break;
			}
		}
		for (i = i;i <= p - 1;i++)
		{
			if (a.charAt(i) == n)
			{
				for (j = i;j >= 0;j--)
				{
					if (a.charAt(j) == m)
					{
		System.out.printf("%d %d\n", j, i);
		a = tangible.StringFunctions.changeCharacter(a, j, ' ');
		break;
					}
				}
			}
		}
		return 0;
	}

}

