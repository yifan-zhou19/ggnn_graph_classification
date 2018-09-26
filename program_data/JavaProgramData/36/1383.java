package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static change(String s)
	{
		int i;
		int j;
		int n = s.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j <= n - i;j++)
			{
				if (s[j].compareTo(s[j + 1]) > 0)
				{
					char c;
					c = s[j];
					s[j] = s[j + 1];
					s[j + 1] = c;
				}
			}
		}
	}
	public static void Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		change(s1);
		change(s2);
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

