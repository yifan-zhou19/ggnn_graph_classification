package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char t;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
			for (j = i;j < n;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
				t = b.charAt(j);
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
				b = tangible.StringFunctions.changeCharacter(b, i, t);
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

