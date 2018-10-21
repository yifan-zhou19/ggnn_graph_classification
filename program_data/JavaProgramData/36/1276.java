package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
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
			for (j = m - 1;j > i;j--)
			{
				if (a.charAt(j - 1) > a.charAt(j))
				{
					char e;
					e = a.charAt(j - 1);
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j));
					a = tangible.StringFunctions.changeCharacter(a, j, e);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				for (j = n - 1;j > i;j--)
				{
					if (b.charAt(j - 1) > b.charAt(j))
					{
						char f;
						f = b.charAt(j - 1);
						b = tangible.StringFunctions.changeCharacter(b, j - 1, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, f);
					}
				}
		}
				if (strcmp(a,b) == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
	}

}

