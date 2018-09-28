package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		char t;
		int m;
		int n;
		int leap = 1;
		int i;
		int j;
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		m = str1.length();
		n = str2.length();
		if (m != n)
		{
			leap = 0;
		}
		if (m == n)
		{
			for (i = 0;i < m;i++)
			{
				for (j = w;j < n;j++)
				{
					if (str1.charAt(i) == str2.charAt(j))
					{
						t = str2.charAt(j);
						str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(w));
						str2 = tangible.StringFunctions.changeCharacter(str2, w, t);
						w++;
						break;
					}

					if (j == n - 1 && str1.charAt(i) != str2.charAt(j))
					{
						leap = 0;
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				for (j = w;j < n;j++)
				{
					if (str2.charAt(i) == str1.charAt(j))
					{
						t = str1.charAt(j);
						str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(w));
						str1 = tangible.StringFunctions.changeCharacter(str1, w, t);
						w++;
						break;
					}
					if (j == n - 1 && str1.charAt(i) != str2.charAt(j))
					{
						leap = 0;
					}
				}
			}
		}
		if (leap == 0)
		{
			System.out.print("NO");
		}
		if (leap != 0)
		{
			System.out.print("YES");
		}
	}
}

