package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[300]);
		String str2 = new String(new char[300]);
		int i;
		int j;
		int m;
		int n;
		int leap = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		m = str1.length();
		n = str2.length();
		if (m != n)
		{
			leap = 1;
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				for (j = i;j < m;j++)
				{
					if (str2.charAt(j) == str1.charAt(i))
					{
						t = str2.charAt(i);
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(j));
						str2 = tangible.StringFunctions.changeCharacter(str2, j, t);
					}
				}
			}
			if (strcmp(str1,str2) != 0)
			{
				leap = 1;
			}
		}
		if (leap != 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}
}

