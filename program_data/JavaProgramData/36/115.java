package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m = 1;
		int t;
		int a;
		int b;
		String str1 = new String(new char[40]);
		String str2 = new String(new char[40]);
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
		a = str1.length();
		b = str2.length();
		if (a != b)
		{
			System.out.print("NO");
		}
		else
		{
			for (j = 0;j < a - 1;j++)
			{
			for (i = 0;i < a - 1 - j;i++)
			{
				if (str1.charAt(i) < str1.charAt(i + 1))
				{
					t = str1.charAt(i);
					str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i + 1));
					str1 = tangible.StringFunctions.changeCharacter(str1, i + 1, t);
				}
			}
			}
		 for (j = 0;j < a - 1;j++)
		 {
			for (i = 0;i < a - 1 - j;i++)
			{
				if (str2.charAt(i) < str2.charAt(i + 1))
				{
					t = str2.charAt(i);
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i + 1));
					str2 = tangible.StringFunctions.changeCharacter(str2, i + 1, t);
				}
			}
		 }

			for (i = 0;i <= a - 1;i++)

			{
					if (str1.charAt(i) == str2.charAt(i))
					{
						m = m * 1;
					}
					else
					{
						m = m * 0;
					}
			}
		 if (m = 1)
		 {
			 System.out.print("YES");
		 }
		 else
		 {
			 System.out.print("NO");
		 }
		}
	}

}

