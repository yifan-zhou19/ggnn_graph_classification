package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		String b = new String(new char[50]);
		String d = new String(new char[50]);
		int pp = new int(char f[],char g[]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		m = pp(d,b);
		System.out.printf("%d",m);
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static pp(String a, String b)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t = 1;
		String c = new String(new char[50]);
		m = a.length();
		n = b.length();
		for (i = 0;i <= m - n;i++)
		{
				for (j = 0;j < n;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a[j + i]);
				}
				for (t = 1,j = 0;j < n;j++)
				{
					 if (!b[j].equals(c.charAt(j)))
					 {
						 t = 0;
					 }
				}
				if (t == 1)
				{
					k = i;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto hell;
				}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	hell:
	;
		 return (k);
	}
}

